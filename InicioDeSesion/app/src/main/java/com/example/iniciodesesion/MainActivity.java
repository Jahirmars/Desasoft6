package com.example.iniciodesesion;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private EditText Email;
    private EditText Password;
    private Button Login;
    private Button Register;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

            Email = findViewById(R.id.editTextEmail);
            Password = findViewById(R.id.editTextPassword);
            Login=(Button)findViewById(R.id.buttonLogin);
            Register=(Button)findViewById(R.id.buttonRegister);



Login.setOnClickListener(new View.OnClickListener() {
    @Override
    public void onClick(View v) {
        String password = Email.getText().toString();
        String correo = Password.getText().toString();



            Intent intent = new Intent(MainActivity.this,MuestraDatos.class);
            startActivity(intent);



    }
});

Register.setOnClickListener(new View.OnClickListener() {
    @Override
    public void onClick(View v) {

        Intent intent = new Intent(MainActivity.this,Registrarses.class);
        startActivity(intent);

    }
});




    }








}

