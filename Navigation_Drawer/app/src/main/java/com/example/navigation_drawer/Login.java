package com.example.navigation_drawer;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.text.Editable;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class Login extends AppCompatActivity {
    private EditText userEdt, passEdt;
    private Button loginBtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        initView();
        setVariable();

    }
    private void setVariable(){
        loginBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(!userEdt.getText().toString().isEmpty() && !passEdt.getText().toString().isEmpty()){
                    Toast.makeText(Login.this, "Please fill the form of login", Toast.LENGTH_SHORT).show();
                }else {
                    startActivity(new Intent(Login.this,MainActivity.class));
                }
            }
        });
    }
    private void initView(){
        userEdt=findViewById(R.id.editTextTextPersonName);
        passEdt=findViewById(R.id.editTextTextPassword);
        loginBtn=findViewById(R.id.loginBtn);


    }
}