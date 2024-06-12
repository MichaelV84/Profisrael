package com.example.profisrael;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.ContextMenu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class Registration extends AppCompatActivity {

    ImageView btnPupMenu;
    Button loginButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_registration);


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