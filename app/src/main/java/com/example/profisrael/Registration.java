package com.example.profisrael;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.ContextMenu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.Spinner;

public class Registration extends AppCompatActivity {



    ImageView btnPupMenu;
    Button loginButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_registration);
        Spinner spinner_city = findViewById(R.id.spinner_city);
        ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(this,
                R.array.spinner_city_items, android.R.layout.simple_spinner_item);

        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinner_city.setAdapter(adapter);

        Spinner spinner_category = findViewById(R.id.spinner_category);
        ArrayAdapter<CharSequence> adapter1 = ArrayAdapter.createFromResource(this,
                R.array.spinner_category_items, android.R.layout.simple_spinner_item);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinner_category.setAdapter(adapter1);

        Spinner spinner_service = findViewById(R.id.spinner_service);
        ArrayAdapter<CharSequence> adapter2 = ArrayAdapter.createFromResource(this,
                R.array.spinner_service_items, android.R.layout.simple_spinner_item);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinner_service.setAdapter(adapter2);




        EditText descriptionEditText = findViewById(R.id.description_reg);

        descriptionEditText.setOnFocusChangeListener(new View.OnFocusChangeListener() {
            @Override
            public void onFocusChange(View v, boolean hasFocus) {
                if (hasFocus) {
                    descriptionEditText.setBackgroundResource(R.drawable.rounded_edit_focused);
                } else {
                    descriptionEditText.setBackgroundResource(R.drawable.rounded_edit);
                }
            }
        });

        EditText login_regEditText = findViewById(R.id.login_reg);

        login_regEditText.setOnFocusChangeListener(new View.OnFocusChangeListener() {
            @Override
            public void onFocusChange(View v, boolean hasFocus) {
                if (hasFocus) {
                    login_regEditText.setBackgroundResource(R.drawable.rounded_edit_focused);
                } else {
                    login_regEditText.setBackgroundResource(R.drawable.rounded_edit);
                }
            }
        });

        EditText pass_reg_EditText = findViewById(R.id.pass_reg);

        pass_reg_EditText.setOnFocusChangeListener(new View.OnFocusChangeListener() {
            @Override
            public void onFocusChange(View v, boolean hasFocus) {
                if (hasFocus) {
                    pass_reg_EditText.setBackgroundResource(R.drawable.rounded_edit_focused);
                } else {
                    pass_reg_EditText.setBackgroundResource(R.drawable.rounded_edit);
                }
            }
        });

//        Spinner spinner_city_Spinner = findViewById(R.id.spinner_city);
//
//        spinner_city_Spinner.setOnFocusChangeListener(new View.OnFocusChangeListener() {
//            @Override
//            public void onFocusChange(View v, boolean hasFocus) {
//                if (hasFocus) {
//                    spinner_city_Spinner.setBackgroundResource(R.drawable.rounded_edit_focused);
//                } else {
//                    spinner_city_Spinner.setBackgroundResource(R.drawable.rounded_edit);
//                }
//            }
//        });

//        Spinner spinner_category_Spinner = findViewById(R.id.spinner_category);
//
//        spinner_category_Spinner.setOnFocusChangeListener(new View.OnFocusChangeListener() {
//            @Override
//            public void onFocusChange(View v, boolean hasFocus) {
//                if (hasFocus) {
//                    spinner_category_Spinner.setBackgroundResource(R.drawable.rounded_edit_focused);
//                } else {
//                    spinner_category_Spinner.setBackgroundResource(R.drawable.rounded_edit);
//                }
//            }
//        });


//        Spinner spinner_service1 = findViewById(R.id.spinner_service);


        EditText tel_regEditText = findViewById(R.id.tel_reg);

        tel_regEditText.setOnFocusChangeListener(new View.OnFocusChangeListener() {
            @Override
            public void onFocusChange(View v, boolean hasFocus) {
                if (hasFocus) {
                    tel_regEditText.setBackgroundResource(R.drawable.rounded_edit_focused);
                } else {
                    tel_regEditText.setBackgroundResource(R.drawable.rounded_edit);
                }
            }
        });

        EditText whatsapp_reg_EditText = findViewById(R.id.whatsapp_reg);

        whatsapp_reg_EditText.setOnFocusChangeListener(new View.OnFocusChangeListener() {
            @Override
            public void onFocusChange(View v, boolean hasFocus) {
                if (hasFocus) {
                    whatsapp_reg_EditText.setBackgroundResource(R.drawable.rounded_edit_focused);
                } else {
                    whatsapp_reg_EditText.setBackgroundResource(R.drawable.rounded_edit);
                }
            }
        });

        EditText instagram_reg_EditText = findViewById(R.id.instagram_reg);

        instagram_reg_EditText.setOnFocusChangeListener(new View.OnFocusChangeListener() {
            @Override
            public void onFocusChange(View v, boolean hasFocus) {
                if (hasFocus) {
                    instagram_reg_EditText.setBackgroundResource(R.drawable.rounded_edit_focused);
                } else {
                    instagram_reg_EditText.setBackgroundResource(R.drawable.rounded_edit);
                }
            }
        });


        EditText name_of_your_service_reg_EditText = findViewById(R.id.name_of_your_service_reg);

        name_of_your_service_reg_EditText.setOnFocusChangeListener(new View.OnFocusChangeListener() {
            @Override
            public void onFocusChange(View v, boolean hasFocus) {
                if (hasFocus) {
                    name_of_your_service_reg_EditText.setBackgroundResource(R.drawable.rounded_edit_focused);
                } else {
                    name_of_your_service_reg_EditText.setBackgroundResource(R.drawable.rounded_edit);
                }
            }
        });

        EditText from_ils_reg_EditText = findViewById(R.id.from_ils_reg);

        from_ils_reg_EditText.setOnFocusChangeListener(new View.OnFocusChangeListener() {
            @Override
            public void onFocusChange(View v, boolean hasFocus) {
                if (hasFocus) {
                    from_ils_reg_EditText.setBackgroundResource(R.drawable.rounded_edit_focused);
                } else {
                    from_ils_reg_EditText.setBackgroundResource(R.drawable.rounded_edit);
                }
            }
        });

        EditText to_ils_reg_EditText = findViewById(R.id.to_ils_reg);

        to_ils_reg_EditText.setOnFocusChangeListener(new View.OnFocusChangeListener() {
            @Override
            public void onFocusChange(View v, boolean hasFocus) {
                if (hasFocus) {
                    to_ils_reg_EditText.setBackgroundResource(R.drawable.rounded_edit_focused);
                } else {
                    to_ils_reg_EditText.setBackgroundResource(R.drawable.rounded_edit);
                }
            }
        });

        EditText address_reg_EditText = findViewById(R.id.address_reg);

        address_reg_EditText.setOnFocusChangeListener(new View.OnFocusChangeListener() {
            @Override
            public void onFocusChange(View v, boolean hasFocus) {
                if (hasFocus) {
                    address_reg_EditText.setBackgroundResource(R.drawable.rounded_edit_focused);
                } else {
                    address_reg_EditText.setBackgroundResource(R.drawable.rounded_edit);
                }
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

    public void logoClick(View v){
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
    }
    @Override
    public void onCreateContextMenu(ContextMenu menu, View v, ContextMenu.ContextMenuInfo menuInfo) {
        super.onCreateContextMenu(menu, v, menuInfo);
        MenuInflater menuInflater =  new MenuInflater(this);
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
}