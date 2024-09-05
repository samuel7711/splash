package com.szs.entrega2;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.util.Log;


import androidx.appcompat.app.AppCompatActivity;


public class MainActivity extends AppCompatActivity {

    String TAG="test";



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);


        Log.d(TAG,"Estoy en el onCreate");
    }

    @Override
    protected void onStart() {
        super.onStart();

        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent s = new Intent(MainActivity.this, inicio.class);
                startActivity(s);
                finish();
            }
        },6000);


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