package com.maxescobar.imagenesenbotones;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    //funcionamiento de boton Mano
    public void mensajeMano(View vista){
        Toast.makeText(this,"Soy una Mano",Toast.LENGTH_SHORT).show();
    }

    //funcionamiento de boton silla
    public void mensajeSilla(View vista){
        Toast.makeText(this,"Esta es la silla de DIOS",Toast.LENGTH_LONG).show();
    }
}