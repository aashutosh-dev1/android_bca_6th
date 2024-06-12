package com.example.layouts;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {

    EditText username_editText, password_editText;
    Button blue_button;

    Spinner random_spinner;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        username_editText = findViewById(R.id.username_et);
        password_editText = findViewById(R.id.pass);

        blue_button = findViewById(R.id.btn_submit);

        random_spinner = findViewById(R.id.spn);

        blue_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
               String typedUsername = String.valueOf(username_editText.getText());
               String typedPassowrd  = String.valueOf(password_editText.getText());
                Toast.makeText(MainActivity.this, " Username =" +typedUsername +"\n"+" Password = " + typedPassowrd , Toast.LENGTH_LONG).show();

            }
        });

        random_spinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                Toast.makeText(MainActivity.this, "Selected item  =" + parent.getSelectedItem(), Toast.LENGTH_SHORT).show();
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });



    }
}