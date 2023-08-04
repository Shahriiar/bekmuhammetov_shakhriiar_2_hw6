package com.example.bekmuhammetov_shakhriiar_2_hw6;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.content.ContextCompat;

import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        String login = "admin";
        String password = "admin";
        int color = ContextCompat.getColor(this, R.color.orange);
        int color2 = ContextCompat.getColor(this, R.color.grey);
        Button btnEnter = findViewById(R.id.btn_enter);
        EditText editTextLogin = findViewById(R.id.email_input);
        EditText editTextPassword = findViewById(R.id.password_input);
        TextView textViewInput = findViewById(R.id.tv_input);
        TextView textViewHintInput = findViewById(R.id.tv_hint_input);
        TextView textViewForgotPassword = findViewById(R.id.tv_forgot_password);


        btnEnter.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (editTextLogin.getText().toString().equals(login) || editTextPassword.getText().toString().equals(password)) {
                    editTextLogin.setVisibility(View.GONE);
                    editTextPassword.setVisibility(View.GONE);
                    textViewInput.setVisibility(View.GONE);
                    textViewHintInput.setVisibility(View.GONE);
                    textViewForgotPassword.setVisibility(View.GONE);
                    Toast.makeText(MainActivity.this, "Вы успешно зарегистрировались", Toast.LENGTH_LONG).show();

                } else {
                    Toast.makeText(MainActivity.this, "Неправильный логин или пароль", Toast.LENGTH_LONG).show();
                }
            }
        });

        editTextLogin.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }

            @Override
            public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }

            @Override
            public void afterTextChanged(Editable editable) {
                String newText = editable.toString();
                if (newText.length() > 0) {
                    btnEnter.setBackgroundColor(color);
                } else {
                    btnEnter.setBackgroundColor(color2);
                }
            }
        });

        editTextPassword.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }

            @Override
            public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }

            @Override
            public void afterTextChanged(Editable editable) {
                String newText = editable.toString();
                if (newText.length() > 0) {
                    btnEnter.setBackgroundColor(color);
                } else {
                    btnEnter.setBackgroundColor(color2);
                }

            }
        });


    }
}
