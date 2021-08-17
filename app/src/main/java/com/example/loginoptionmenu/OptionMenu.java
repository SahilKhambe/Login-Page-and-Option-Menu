package com.example.loginoptionmenu;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Toast;

public class OptionMenu extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_option_menu);



    }
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.option_menu, menu);

        return true;

    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        switch (item.getItemId()) {
            case R.id.call:
                Toast.makeText(OptionMenu.this, "CALL", Toast.LENGTH_LONG).show();
                Intent intent = new Intent(OptionMenu.this, CallActivity.class);
                startActivity(intent);
                break;

            case R.id.sms:
                Toast.makeText(OptionMenu.this, "SMS", Toast.LENGTH_LONG).show();
                Intent intent1 = new Intent(OptionMenu.this, SMSActivity.class);
                startActivity(intent1);
                break;

            case R.id.email:
                Toast.makeText(OptionMenu.this, "EMAIL", Toast.LENGTH_LONG).show();
                Intent intent2 = new Intent(OptionMenu.this, EMAILActivity.class);
                startActivity(intent2);
                break;
        }
        return super.onOptionsItemSelected(item);
    }
}