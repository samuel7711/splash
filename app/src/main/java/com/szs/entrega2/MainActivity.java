package com.szs.entrega2;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.util.Log;
import android.view.View;
import android.widget.Button;

import com.google.android.material.bottomnavigation.BottomNavigationView;

import androidx.appcompat.app.AppCompatActivity;
import androidx.navigation.NavController;
import androidx.navigation.Navigation;
import androidx.navigation.ui.AppBarConfiguration;
import androidx.navigation.ui.NavigationUI;

import com.szs.entrega2.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {

    private ActivityMainBinding binding;

    Button boton1, boton2;
    String TAG="test";



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        boton1 =findViewById(R.id.boton1);
        boton2 =findViewById(R.id.boton2);

        Log.d(TAG,"Estoy en el onCreate");
    }

    @Override
    protected void onStart() {
        super.onStart();

        boton1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent splash = new Intent(MainActivity.this, login.class);
                startActivity(splash);

            }
        });

        boton2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent r = new Intent(MainActivity.this, registro.class);
                startActivity(r);
            }


        });

        Log.d(TAG,"Estoy en el onStart");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.d(TAG,"Estoy en el onResume");
    };

    @Override
    protected void onPause() {
        super.onPause();
        Log.d(TAG,"Estoy en el onPause");
    };


    @Override
    protected void onDestroy(){
        super.onDestroy();
        Log.d(TAG,"Estoy en el onDestroy");
    };
}