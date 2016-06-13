package com.example.kandskat.repasopro;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;

public class ActividadTrcera extends AppCompatActivity implements View.OnClickListener{

    TextView Txt_Recibir_Dato;
    RadioGroup RadioGroup01;
    Button Btn_Siguiente;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_actividad_trcera);

        //enlazando variables creadas en este clase Java con la parte grafica XML
        RadioGroup01 = (RadioGroup)findViewById(R.id.RadioGroup_01);
        Txt_Recibir_Dato = (TextView) findViewById(R.id.Txt_Saludo_Tercera_Actividad);
        Btn_Siguiente = (Button)findViewById(R.id.Btn_Aceptar_Tercera_Actividad);


        //Habilitar el button Btn_siguiente para que funcione el OnclickListener
        Btn_Siguiente.setOnClickListener(this);


        //recibiendo lo que se envia desde la actividad ActividadSecond con el Intent y el Bundle
        //el Bundle maneja los extras
        Intent intento_recivir = getIntent();
        Bundle bundle_recivir = intento_recivir.getExtras();

        if(bundle_recivir!=null){
            //recuerda que dentro del get de bundl_recibr se necesita el mismo nombre del putextra
            //en este caso DATOALMACENADO que se encuentra dentro de ActividadSecond putextr
            String dato = (String) bundle_recivir.get("DATOALMACENADO");
            Txt_Recibir_Dato.setText(dato);

        }



        //usando un metodo ya existente para enlazar el radiogroup
        //detecta cambio en el grupo de botones
        //en este caso usaremos un toas para poder enviar un mensaje
        //y saber cual radio button se esta pulzando

        RadioGroup01.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                if (checkedId == R.id.Rbtn_01_G01){
                    Toast.makeText(getApplicationContext(),"pulsando 1",Toast.LENGTH_SHORT).show();
                }
                else if (checkedId == R.id.Rbtn_02_G01){
                    Toast.makeText(getApplicationContext(),"pulsando 2",Toast.LENGTH_SHORT).show();
                }
                else if (checkedId == R.id.Rbtn_03_G01){
                    Toast.makeText(getApplicationContext(),"pulsando 3",Toast.LENGTH_SHORT).show();
                }
            }
        });


    }

    @Override
    public void onClick(View v) {

        switch (v.getId()){
            case R.id.Btn_Aceptar_Tercera_Actividad:
                //Creando un Intent (contexto, nombre de la actividad a donde ir)
                //Iniciar el Intent y registrar en el manisfest
                Intent Intento_TAC = new Intent(this, ActividadCuart.class);
                startActivity(Intento_TAC);
                break;
        }

    }
}
