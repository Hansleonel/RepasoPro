package com.example.kandskat.repasopro;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class ActividadSecond extends AppCompatActivity implements View.OnClickListener{



    Button btn;
    EditText EdTxt_Texto_Pasar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_actividad_second);

        //relacionar variables
        btn = (Button) findViewById(R.id.Btn_Aceptar_Segunda_Actividad);
        EdTxt_Texto_Pasar = (EditText) findViewById(R.id.EdTxt_Texto_Enviar);


        //siempre habilitar el button con SetOnClick

        btn.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {

        switch (v.getId()){
            case R.id.Btn_Aceptar_Segunda_Actividad:
                //creando un Intent
                Intent intentWE = new Intent(this, ActividadTrcera.class);
                //almacenando dentro de un string en este caso dato lo escrito en el edtTxt
                //recordar usar el getText y toString para la transfrmcn a caracteres
                String dato = EdTxt_Texto_Pasar.getText().toString();
                //para almacenar datos dentro de un intent usamos el putExtra
                intentWE.putExtra("DATOALMACENADO",dato);
                //iniciando el Intent en este caso inicia la actividad ActividadTrcera
                startActivity(intentWE);
                break;
            case 2:
                break;
            case 3:
                break;
            default:
                break;
        }

    }
}
