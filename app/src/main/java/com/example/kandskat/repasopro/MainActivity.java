package com.example.kandskat.repasopro;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    //creando la variable en .java
    TextView texto;
    Button boton;
    Button btn_ir;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //enlazando el Btn_Aceptar creando en .xml con el boton creado en .java
        boton = (Button)findViewById(R.id.Btn_Aceptar);
        texto = (TextView) findViewById(R.id.Txt_Saludo);
        btn_ir= (Button) findViewById(R.id.Btn_Ir_A_Segunda);


        //habilitando el setonclick como regla para la activacion de todos los button
        boton.setOnClickListener(this);
        btn_ir.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.Btn_Aceptar:
                texto.setText("Este texto cambio cuando le di click al Btn aceptar");
                Toast.makeText(getApplicationContext(),"Esto es un Toast", Toast.LENGTH_SHORT).show();
                break;
            case R.id.Btn_Ir_A_Segunda:
                //primera parametro en new Intent(contexto, nombre de la segunda actividad a donde ir)
                //se hace referencias las CLASES no a los archivos XML
                Intent intento = new Intent(this,ActividadSecond.class);
                //para iniciar usar strt con el nombre del Intent dentro
                startActivity(intento);

                //recordar registrar los Intents dentro del manifest
                break;
            default:
                break;
        }
    }
}
