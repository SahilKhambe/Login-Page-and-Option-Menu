package com.example.loginoptionmenu;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.app.ApplicationExitInfo;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    EditText txt_id, txt_pass;
    TextView txt1;
    Button btnlogin, btnexit;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        txt_id = findViewById(R.id.Eid);
        txt_pass = findViewById(R.id.pass);
        btnlogin = findViewById(R.id.btnlogin);

//        btnexit = findViewById(R.id.btnexit);
        txt1 = findViewById(R.id.txtinvalid);
        txt1.setVisibility(View.GONE);
        btnlogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(txt_id.getText().toString().equals("admin") &&
                txt_pass.getText().toString().equals("admin")){
                    Intent intent = new Intent(MainActivity.this, OptionMenu.class);
                    startActivity(intent);
                }
                else{
                    Toast.makeText(getApplicationContext(), "Invalid Credentials",Toast.LENGTH_SHORT).show();
                    txt1.setVisibility(View.GONE);

                }
            }
        });
//        btnexit.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//
//                finish();
//
//            }
//        });

    }


}