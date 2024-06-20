package com.example.profisrael;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Color;
import android.net.Uri;
import android.os.Bundle;
import android.text.InputType;
import android.view.ContextMenu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.Spinner;

public class Registration extends AppCompatActivity {

    private EditText name_reg_editText,login_reg_editText, pass_reg_editText, tel_reg_editText, whatsapp_reg_editText, instagram_reg_editText, name_of_your_service_reg_editText, from_ils_reg_editText, to_ils_reg_editText, address_reg_editText, description_reg_editText;
    private Spinner spinner_city_spinner, spinner_category_spinner, spinner_service_spinner;

    ImageView btnPupMenu;
    Button loginButton;





    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_registration);

        // Initialize Spinners
        spinner_city_spinner = findViewById(R.id.spinner_city);
        ArrayAdapter<CharSequence> adapter_city = ArrayAdapter.createFromResource(this, R.array.spinner_city_items, android.R.layout.simple_spinner_item);
        adapter_city.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinner_city_spinner.setAdapter(adapter_city);
        spinner_city_spinner.setSelection(0, false);

        spinner_category_spinner = findViewById(R.id.spinner_category);
        ArrayAdapter<CharSequence> adapter_category = ArrayAdapter.createFromResource(this, R.array.spinner_category_items, android.R.layout.simple_spinner_item);
        adapter_category.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinner_category_spinner.setAdapter(adapter_category);
        spinner_category_spinner.setSelection(0, false);

        spinner_service_spinner = findViewById(R.id.spinner_service);
        ArrayAdapter<CharSequence> adapter_service = ArrayAdapter.createFromResource(this, R.array.spinner_service_items, android.R.layout.simple_spinner_item);
        adapter_service.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinner_service_spinner.setAdapter(adapter_service);
        spinner_service_spinner.setSelection(0, false);

        // Initialize EditTexts
        login_reg_editText = findViewById(R.id.login_reg);
        pass_reg_editText = findViewById(R.id.pass_reg);
        tel_reg_editText = findViewById(R.id.tel_reg);
        whatsapp_reg_editText = findViewById(R.id.whatsapp_reg);
        instagram_reg_editText = findViewById(R.id.instagram_reg);
        name_of_your_service_reg_editText = findViewById(R.id.name_of_your_service_reg);
        from_ils_reg_editText = findViewById(R.id.from_ils_reg);
        to_ils_reg_editText = findViewById(R.id.to_ils_reg);
        address_reg_editText = findViewById(R.id.address_reg);
        description_reg_editText = findViewById(R.id.description_reg);
        name_reg_editText = findViewById(R.id.name_reg);
        // Set focus listeners for EditTexts

        setFocusListener(login_reg_editText);
        setFocusListener(pass_reg_editText);
        setFocusListener(name_reg_editText);
        setFocusListener(tel_reg_editText);
        setFocusListener(whatsapp_reg_editText);
        setFocusListener(instagram_reg_editText);
        setFocusListener(name_of_your_service_reg_editText);
        setFocusListener(from_ils_reg_editText);
        setFocusListener(to_ils_reg_editText);
        setFocusListener(address_reg_editText);
        setFocusListener(description_reg_editText);

        // Set focus and item listeners for Spinners
        setSpinnerListener(spinner_city_spinner);
        setSpinnerListener(spinner_category_spinner);
        setSpinnerListener(spinner_service_spinner);



        CheckBox checkBox = findViewById(R.id.checkBox);
        EditText passEditText = findViewById(R.id.pass_reg);

        // Устанавливаем слушатель для CheckBox
        checkBox.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked) {
                    // Показываем пароль
                    passEditText.setInputType(InputType.TYPE_CLASS_TEXT | InputType.TYPE_TEXT_VARIATION_VISIBLE_PASSWORD);
                } else {
                    // Скрываем пароль
                    passEditText.setInputType(InputType.TYPE_CLASS_TEXT | InputType.TYPE_TEXT_VARIATION_PASSWORD);
                }

                // Перемещаем курсор в конец текста
                passEditText.setSelection(passEditText.getText().length());
            }
        });

        btnPupMenu = findViewById(R.id.menuPUP);
        registerForContextMenu(btnPupMenu);
        btnPupMenu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                v.showContextMenu();
            }
        });

        loginButton = findViewById(R.id.loginButton);
        loginButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                loginClick();
            }
        });
    }

    private void loginClick() {
        Intent intent = new Intent(this, EnterActivity.class);
        startActivity(intent);
    }

    public void logoClick(View v) {
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
    }

    @Override
    public void onCreateContextMenu(ContextMenu menu, View v, ContextMenu.ContextMenuInfo menuInfo) {
        super.onCreateContextMenu(menu, v, menuInfo);
        MenuInflater menuInflater = new MenuInflater(this);
        menuInflater.inflate(R.menu.menu_items, menu);
    }

    @Override
    public boolean onContextItemSelected(@NonNull MenuItem item) {
        switch (item.getItemId()) {
            case R.id.item1:
                Intent intent = new Intent(this, MainActivity.class);
                startActivity(intent);
                break;
            case R.id.item2:
                Intent intent1 = new Intent(this, ContactsActivity.class);
                startActivity(intent1);
                break;
            case R.id.item3:
                openInstagram();
                break;
        }
        return super.onContextItemSelected(item);
    }

    private void openInstagram() {
        Uri uri = Uri.parse("https://www.instagram.com/profi.israel");
        Intent intent = new Intent(Intent.ACTION_VIEW, uri);
        intent.setPackage("com.instagram.android");

        // Check if the Instagram app is installed
        if (intent.resolveActivity(getPackageManager()) != null) {
            startActivity(intent);
        } else {
            // If Instagram app is not installed, open in browser
            intent.setPackage(null);
            startActivity(intent);
        }
    }

    private void setFocusListener(final EditText editText) {
        editText.setOnFocusChangeListener(new View.OnFocusChangeListener() {
            @Override
            public void onFocusChange(View v, boolean hasFocus) {
                if (hasFocus) {
                    highlightView(editText);
                } else {
                    removeHighlight(editText);
                }
            }
        });
    }

    private void setSpinnerListener(final Spinner spinner) {
        spinner.setOnFocusChangeListener(new View.OnFocusChangeListener() {
            @Override
            public void onFocusChange(View v, boolean hasFocus) {
                if (hasFocus) {
                    highlightView(spinner);
                } else {
                    removeHighlight(spinner);
                }
            }
        });
        spinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parentView, View selectedItemView, int position, long id) {
                highlightView(spinner);
            }

            @Override
            public void onNothingSelected(AdapterView<?> parentView) {
                removeHighlight(spinner);
            }
        });
    }

    private void highlightView(View view) {
        view.setBackgroundResource(R.drawable.rounded_edit_focused);
        removeHighlightFromOthers(view);
    }

    private void removeHighlight(View view) {
        view.setBackgroundResource(R.drawable.rounded_edit);
    }

    private void removeHighlightFromOthers(View currentView) {
        if (currentView != login_reg_editText) removeHighlight(login_reg_editText);
        if (currentView != pass_reg_editText) removeHighlight(pass_reg_editText);
        if (currentView != name_reg_editText) removeHighlight(name_reg_editText);
        if (currentView != tel_reg_editText) removeHighlight(tel_reg_editText);
        if (currentView != whatsapp_reg_editText) removeHighlight(whatsapp_reg_editText);
        if (currentView != instagram_reg_editText) removeHighlight(instagram_reg_editText);
        if (currentView != name_of_your_service_reg_editText) removeHighlight(name_of_your_service_reg_editText);
        if (currentView != from_ils_reg_editText) removeHighlight(from_ils_reg_editText);
        if (currentView != to_ils_reg_editText) removeHighlight(to_ils_reg_editText);
        if (currentView != address_reg_editText) removeHighlight(address_reg_editText);
        if (currentView != description_reg_editText) removeHighlight(description_reg_editText);
        if (currentView != spinner_city_spinner) removeHighlight(spinner_city_spinner);
        if (currentView != spinner_category_spinner) removeHighlight(spinner_category_spinner);
        if (currentView != spinner_service_spinner) removeHighlight(spinner_service_spinner);

    }
}