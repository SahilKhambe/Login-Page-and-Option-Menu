package com.example.loginoptionmenu;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Toast;

public class WelcomeActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_welcome);

        Thread thread = new Thread(){
            @Override
            public void run() {

                try {

                    sleep(3000);

                }catch (Exception e){

                    Toast.makeText(WelcomeActivity.this, e.getMessage(), Toast.LENGTH_SHORT).show();

                }finally {

                    Intent intent = new Intent(WelcomeActivity.this, MainActivity.class);
                    startActivity(intent);

                }

            }
        };
        thread.start();

    }
}