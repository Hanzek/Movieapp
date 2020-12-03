package com.example.movieapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;

public class preferenciasActivity extends AppCompatActivity {
    String treintamin;
    String treintaysesenta;
    String mayora60;
    String medaigual;
    String drama;
    String comedia;
    String terror;
    String accion;
    String aventura;
    String musicales;
    String suspenso;
    String cienciaFiccion;
    CheckBox series;
    CheckBox peliculas;
    CheckBox ambas;
    Intent i;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_preferencias);
        series = findViewById(R.id.series);
        peliculas=findViewById(R.id.peliculas);
        ambas = findViewById(R.id.ambas);
        datosActivityMain();
        datosDuracionActivity();

    }
    private void datosActivityMain() {
        i = new Intent(preferenciasActivity.this,homeActivity.class);
        comedia=getIntent().getStringExtra("comedia");
        i.putExtra("comedia",comedia);
        drama=getIntent().getStringExtra("drama");
        i.putExtra("drama",drama);
        terror=getIntent().getStringExtra("terror");
        i.putExtra("terror",terror);
        accion=getIntent().getStringExtra("accion");
        i.putExtra("accion",accion);
        aventura=getIntent().getStringExtra("aventura");
        i.putExtra("aventura",aventura);
        musicales=getIntent().getStringExtra("musicales");
        i.putExtra("musicales",musicales);
        suspenso=getIntent().getStringExtra("suspenso");
        i.putExtra("suspenso",suspenso);
        cienciaFiccion=getIntent().getStringExtra("cienciaFiccion");
        i.putExtra("cienciaFiccion",cienciaFiccion);
    }

    private void datosDuracionActivity() {
        treintamin=getIntent().getStringExtra("treintamin");
        i.putExtra("treintamin",treintamin);
        treintaysesenta=getIntent().getStringExtra("treintaysesenta");
        i.putExtra("treintaysesenta",treintaysesenta);
        mayora60=getIntent().getStringExtra("mayora60");
        i.putExtra("mayora60",mayora60);
        medaigual=getIntent().getStringExtra("medaigual");
        i.putExtra("medaigual",medaigual);

    }

    public void continuar(View view) {
        checking();
        startActivity(i);
    }

    private void checking() {
        if(series.isChecked()) {
            i.putExtra("series",series.getText().toString().trim());

        }
        if(peliculas.isChecked()) {
            i.putExtra("peliculas",peliculas.getText().toString().trim());

        }

        if(ambas.isChecked()) {
            i.putExtra("ambas",ambas.getText().toString().trim());

        }
    }


}