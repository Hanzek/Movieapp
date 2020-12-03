package com.example.movieapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class homeActivity extends AppCompatActivity {
    String peliculas;
    String series;
    String ambas;
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

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
        datosPreferenciasActivity();
        datosActivityMain();
        datosDuracionActivity();
    }

    private void datosDuracionActivity() {
        treintamin=getIntent().getStringExtra("treintamin");
        treintaysesenta=getIntent().getStringExtra("treintaysesenta");
        mayora60=getIntent().getStringExtra("mayora60");
        medaigual=getIntent().getStringExtra("medaigual");
    }

    private void datosActivityMain() {
        comedia=getIntent().getStringExtra("comedia");
        drama=getIntent().getStringExtra("drama");
        terror=getIntent().getStringExtra("terror");
        accion=getIntent().getStringExtra("accion");
        aventura=getIntent().getStringExtra("aventura");
        musicales=getIntent().getStringExtra("musicales");
        suspenso=getIntent().getStringExtra("suspenso");
        cienciaFiccion=getIntent().getStringExtra("cienciaFiccion");
    }

    private void datosPreferenciasActivity() {
        series = getIntent().getStringExtra("series");
        peliculas = getIntent().getStringExtra("peliculas");
        ambas = getIntent().getStringExtra("ambas");
    }
}