package com.example.iniciodesesion;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;

import com.example.iniciodesesion.R;

import java.util.zip.Inflater;

public class MuestraDatos extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_muestra_datos);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.mimenu, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        switch (item.getItemId()){
            case R.id.new1:
                Intent intent = new Intent(MuestraDatos.this,Registrarses.class);
                startActivity(intent);
                break;

            case R.id.new2:
                Intent i = new Intent(MuestraDatos.this,MainActivity.class);
                startActivity(i);

        }

        return super.onOptionsItemSelected(item);
    }
}