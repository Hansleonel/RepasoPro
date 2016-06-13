package com.example.kandskat.repasopro;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CompoundButton;
import android.widget.Toast;
import android.widget.ToggleButton;

public class ActividadQuint extends AppCompatActivity implements View.OnClickListener{

    ToggleButton Tgl_Btn_01;
    Button Btn_ir_sexta;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_actividad_quint);

        //enlazando variables creadas en este documento java con variables del documento xml
        Tgl_Btn_01 = (ToggleButton) findViewById(R.id.ToglBtn_Seleccion);
        Btn_ir_sexta= (Button) findViewById(R.id.Btn_Ir_A_Sexta);
        //Para poder usar el ToggleButton debemos implementar el SetOnChekedChangeListener
        //dicho componente nos permite estar pendiente cuando hay un cambio de estado ON or OFF
        Tgl_Btn_01.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                //usaremos el if para lanzar un mensaje via Toast

                if (isChecked){
                    //el Toas generalmente se usa con .makeText(contexto, texto a mostrar o string creado,
                    //el tiempo que se mostrara dicho texto) ademas de .show para mostrar
                    Toast.makeText(getApplicationContext(),"Se realizo la seleccion esta en textOn",Toast.LENGTH_SHORT).show();
                }else {
                    Toast.makeText(getApplicationContext(),"Se realizo la deselccn es decir esta en textOFF",Toast.LENGTH_SHORT).show();
                }
            }
        });
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            //recuerda que en el case se usa el R.id.Btn para ubicar el elemento con el getId es decir
            //el nombre de la variable dada en el .xml
            case R.id.Btn_Ir_A_Sexta:
                //creacion del Intent(contexto,actividad a donde ir.class)
                //recordar registrar el intent dentro del manifest.xml ademas iniciar activity con StartActivity
                Intent Intento_TS= new Intent(this,ActividadSext.class);
                startActivity(Intento_TS);
                break;
        }

    }
}
