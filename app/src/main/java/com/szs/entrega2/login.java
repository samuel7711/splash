package com.szs.entrega2;

import android.os.Bundle;
import android.util.Log;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;


public class login extends AppCompatActivity {

    String TAG="test";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_login);
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.d(TAG,"Estoy en el onStart");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.d(TAG,"Estoy en el onStop");
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