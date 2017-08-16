package com.programacion.movil.estemanp.proyectobase;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    public Button but1;

    public void init(){
        but1=(Button)findViewById(R.id.but1);
        but1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent toy = new Intent(MainActivity.this,second.class);
                startActivity(toy);
            }
        });
    }
    TextView text;
        @Override
        public void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_main);
            text = (TextView)findViewById(R.id.texto);
            init();
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
