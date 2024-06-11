package com.example.layouts;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {

    EditText username_editText, password_editText;
    Button blue_button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        username_editText = findViewById(R.id.username_et);
        password_editText = findViewById(R.id.pass);

        blue_button = findViewById(R.id.btn_submit);


        blue_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
               String typedUsername = String.valueOf(username_editText.getText());
               String typedPassowrd  = String.valueOf(password_editText.getText());
                Toast.makeText(MainActivity.this, " Username =" +typedUsername +"\n"+" Password = " + typedPassowrd , Toast.LENGTH_LONG).show();

            }
        });



    }
}