package com.example.ejciclodevida;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toast.makeText(this, "Estamos en onCreate", Toast.LENGTH_LONG).show();
        Log.i("ciclo","Estamos en onCreate");
    }

    @Override
    protected void onStart() {
        super.onStart();
        Toast.makeText(this, "Estamos en onStart", Toast.LENGTH_LONG).show();
        Log.i("ciclo","Estamos en onStart");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Toast.makeText(this, "Estamos en onResume", Toast.LENGTH_LONG).show();
        Log.i("ciclo","Estamos en onResume");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Toast.makeText(this, "Estamos en onPause", Toast.LENGTH_LONG).show();
        Log.i("ciclo","Estamos en onPause");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Toast.makeText(this, "Estamos en onStop", Toast.LENGTH_LONG).show();
        Log.i("ciclo","Estamos en onStop");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Toast.makeText(this, "Estamos en onRestart", Toast.LENGTH_LONG).show();
        Log.i("ciclo","Estamos en onRestart");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Toast.makeText(this, "Estamos en onDestroy", Toast.LENGTH_LONG).show();
        Log.i("ciclo","Estamos en onDestroy");
    }
}