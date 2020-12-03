package com.example.movieapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.SharedPreferences;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    CheckBox dramaCheck;
    CheckBox comediaCheck;
    CheckBox terrorCheck;
    CheckBox accionCheck;
    CheckBox aventuraCheck;
    CheckBox musicalesCheck;
    CheckBox suspensoCheck;
    CheckBox cienciaFiccionCheck;
    Intent i;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        dramaCheck = findViewById(R.id.drama);
        comediaCheck = findViewById(R.id.comedia);
        terrorCheck = findViewById(R.id.terror);
        accionCheck = findViewById(R.id.accion);
        aventuraCheck = findViewById(R.id.aventura);
        musicalesCheck = findViewById(R.id.musicales);
        suspensoCheck = findViewById(R.id.suspenso);
        cienciaFiccionCheck = findViewById(R.id.cienciaFiccion);


    }


    public void continuar(View view) {
        i = new Intent(MainActivity.this,duracionActivity.class);
        checking();
        startActivity(i);



    }

    private void checking() {
        if(dramaCheck.isChecked()) {
            i.putExtra("drama",dramaCheck.getText().toString().trim());

        }
        if(comediaCheck.isChecked()) {
            i.putExtra("comedia",comediaCheck.getText().toString().trim());

        }
        if(terrorCheck.isChecked()) {
            i.putExtra("terror",terrorCheck.getText().toString().trim());

        }

        if(accionCheck.isChecked()) {
            i.putExtra("accion",accionCheck.getText().toString().trim());

        }

        if(aventuraCheck.isChecked()) {
            i.putExtra("aventura",aventuraCheck.getText().toString().trim());

        }

        if(musicalesCheck.isChecked()) {
            i.putExtra("musicales",musicalesCheck.getText().toString().trim());

        }


        if(suspensoCheck.isChecked()) {
            i.putExtra("suspenso",suspensoCheck.getText().toString().trim());

        }

        if(cienciaFiccionCheck.isChecked()) {
            i.putExtra("cienciaFiccion",cienciaFiccionCheck.getText().toString().trim());

        }
    }
}