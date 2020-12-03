package com.example.movieapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;

import java.util.ConcurrentModificationException;

public class duracionActivity extends AppCompatActivity {

    CheckBox treintamin;
    CheckBox treintaysesenta;
    CheckBox mayora60;
    CheckBox medaigual;
    String drama;
    String comedia;
    String terror;
    String accion;
    String aventura;
    String musicales;
    String suspenso;
    String cienciaFiccion;

    Intent i;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_duracion);
        treintamin = findViewById(R.id.treintamin);
        treintaysesenta= findViewById(R.id.treintaysesenta);
        mayora60=findViewById(R.id.mayora60);
        medaigual = findViewById(R.id.medaigual);

        datosActivityMain();


    }

    private void datosActivityMain() {
        i = new Intent(duracionActivity.this,preferenciasActivity.class);
        comedia=getIntent().getStringExtra("comedia");
        i.putExtra("comedia",comedia);
        drama=getIntent().getStringExtra("drama");
        i.putExtra("drama",drama);
        terror=getIntent().getStringExtra("terror");
        i.putExtra("terror",terror);
        accion=getIntent().getStringExtra("accion");
        i.putExtra("accion",terror);
        aventura=getIntent().getStringExtra("aventura");
        i.putExtra("aventura",aventura);
        musicales=getIntent().getStringExtra("musicales");
        i.putExtra("musicales",musicales);
        suspenso=getIntent().getStringExtra("suspenso");
        i.putExtra("suspenso",suspenso);
        cienciaFiccion=getIntent().getStringExtra("cienciaFiccion");
        i.putExtra("cienciaFiccion",cienciaFiccion);
    }


    public void continuar(View view) {
        checking();
        startActivity(i);
    }



    private void checking() {
        if(treintamin.isChecked()) {
            i.putExtra("treintamin",treintamin.getText().toString().trim());

        }
        if(treintaysesenta.isChecked()) {
            i.putExtra("treintaysesenta",treintaysesenta.getText().toString().trim());

        }
        if(mayora60.isChecked()) {
            i.putExtra("mayora60",mayora60.getText().toString().trim());

        }

        if(medaigual.isChecked()) {
            i.putExtra("medaigual",medaigual.getText().toString().trim());

        }

    }
}