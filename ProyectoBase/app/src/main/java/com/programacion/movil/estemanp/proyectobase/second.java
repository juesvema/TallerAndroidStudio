package com.programacion.movil.estemanp.proyectobase;

import android.content.Intent;
import android.graphics.Color;
import android.support.constraint.ConstraintLayout;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class second extends AppCompatActivity {

    TextView text;
    TextView check;
    TextView numero;
    EditText userNumber;
    ConstraintLayout layout;
    Button compare;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        text = (TextView)findViewById(R.id.texto);
        numero = (TextView)findViewById(R.id.numRan);
        check = (TextView)findViewById(R.id.check);
        userNumber = (EditText)findViewById(R.id.numeroUser);
        layout =  (ConstraintLayout) findViewById(R.id.layout2);
        compare=(Button)findViewById(R.id.compare);
        compare.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int ran = (int) ((Math.random() * 9) + 0);
                String random = String.valueOf(ran);
                numero.setText("Numero del sistema: "+random);
                String dato = userNumber.getText().toString();
                if (dato.equals(random)){
                    layout.setBackgroundColor(Color.GREEN);
                    check.setText("Adivino");
                }else{
                    layout.setBackgroundColor(Color.RED);
                    check.setText("Fallo, Volver a intentar");
                }
            }
        });
    }
    @Override
    public void onStart() {
        super.onStart();
        text.setText("Paso por el onStart");
    }

    @Override
    public void onRestart() {
        super.onRestart();
        text.setText("Paso por el onRestart");
    }

    @Override
    public void onResume() {
        super.onResume();
        text.setText("Paso por el onResume");

    }

    @Override
    public void onPause() {
        super.onPause();
        text.setText("Paso por el onPause");
    }

    @Override
    public void onStop() {
        super.onStop();
        text.setText("Paso por el onStop");
    }

    @Override
    public void onDestroy() {
        super.onDestroy();
        text.setText("Paso por el onDestroy");
    }
}
