package com.szs.entrega2;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;


import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;


public class inicio extends AppCompatActivity {

    Button boton1, boton2;
    String TAG="test";



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_inicio);

        boton1 = (Button) findViewById(R.id.boton1);
        boton2 =(Button)findViewById(R.id.boton2);


        Log.d(TAG,"Estoy en el onCreate");

        boton1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent splash = new Intent(inicio.this, login.class);
                startActivity(splash);
            }
        });


        boton2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent r = new Intent(inicio.this, registro.class);
                startActivity(r);
            }


        });
    }

    @Override
    protected void onStart() {
        super.onStart();



        Log.d(TAG,"Estoy en el onStart");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.d(TAG,"Estoy en el onResume");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.d(TAG,"Estoy en el onPause");
    }


    @Override
    protected void onDestroy(){
        super.onDestroy();
        Log.d(TAG,"Estoy en el onDestroy");
    }
}