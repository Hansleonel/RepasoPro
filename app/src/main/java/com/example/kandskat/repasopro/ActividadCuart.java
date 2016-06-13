package com.example.kandskat.repasopro;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.Spinner;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

public class ActividadCuart extends AppCompatActivity implements View.OnClickListener{

    Spinner spinr_01;
    Button btn_ir;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_actividad_cuart);

        //Enlazando varibles creadas en esta clase java con la parte grafica xml
        spinr_01 = (Spinner) findViewById(R.id.Spnr_01);
        btn_ir = (Button) findViewById(R.id.Btn_Ir_A_Quinta);
        //Usando List, crea una lista de elementos que rellenaran el spiner
        List Lista_01 = new ArrayList();
        Lista_01.add("Item 01");
        Lista_01.add("Item 02");
        Lista_01.add("Item 03");
        Lista_01.add("Item 04");
        Lista_01.add("Item 05");
        Lista_01.add("Item 06");
        Lista_01.add("Item 07");
        Lista_01.add("Item 08");

        //Para poder llenar el Spiner tenemos que crear un ArrayAdaptr que es un adaptador para
        //pasar los elementos de la lista y llenar nuestro spinr
        //para crear el arrayadaptr usamos los siguientes parametrs (contexto, estilo o diseño predefinido para mostr, Lista o elemento a pasar)
        ArrayAdapter arrayadaptador = new ArrayAdapter(this, android.R.layout.simple_dropdown_item_1line,Lista_01);
        //Como se mostrara la lista en el spiner este caso en orden hacia abjo
        arrayadaptador.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        //mandato para que se rellene el Spiner en este caso spinr_01 creado previamente
        //en esta linea se realiza la union de la lista con la parte grafica xml
        spinr_01.setAdapter(arrayadaptador);

        //Hasta este puntos solo muestra los elementos de la lista dentro del spiner
        //para realizar alguna accion usamos la siguiente linea

        spinr_01.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {

            //cuando se seleccione algun item de este elemento en este caso del Spiner spiner_01
            //se realizara lo siguiente
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                Toast.makeText(getApplicationContext(),"Position selectd "+String.valueOf(spinr_01.getSelectedItem()),Toast.LENGTH_SHORT).show();
            }

            //en On NothingSelected se realizaran los mandatos dentro de onNothngSelect
            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });






    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.Btn_Ir_A_Quinta:
                //creacion del Intent(contexto, actividad a donde ir en .class) para ir a la actividad quint
                //recordar registrar en el manifest.xml ademas recuerda iniciar la activity con startActivity
                Intent Intento_TQ = new Intent(this,ActividadQuint.class);
                startActivity(Intento_TQ);
                break;
        }
    }
}
