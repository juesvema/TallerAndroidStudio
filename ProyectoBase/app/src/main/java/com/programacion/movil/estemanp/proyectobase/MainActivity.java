package com.programacion.movil.estemanp.proyectobase;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    TextView text;
        @Override
        public void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_main);
            text = (TextView)findViewById(R.id.texto);
        }

        public void onStart() {
            super.onStart();
            text.setText("Paso por el onStart");
        }

        public void onRestart() {
            super.onRestart();
            text.setText("Paso por el onRestart");
        }

        public void onResume() {
            super.onResume();
            text.setText("Paso por el onResume");
        }

        public void onPause() {
            super.onPause();
            text.setText("Paso por el onPause");
        }

        public void onStop() {
            super.onStop();
            text.setText("Paso por el onStop");
        }

        public void onDestroy() {
            super.onStop();
            text.setText("Paso por el onDestroy");
        }
}
