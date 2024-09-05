package com.szs.entrega2;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import java.sql.Array;
import java.util.ArrayList;

public class registro extends AppCompatActivity {

    String TAG="test",nuevosusuarios,nuevacontrase;
    public ArrayList<String> usuarios;
    public ArrayList<String>contrase;
    Button register;
    EditText user, password;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);

        register = findViewById(R.id.register);
        user = findViewById(R.id.user);
        password =findViewById(R.id.password);
    }



    @Override
    protected void onStart() {
        super.onStart();
        Log.d(TAG,"Estoy en el onStart");

        register.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                nuevosusuarios = user.getText().toString();
                usuarios.add(nuevosusuarios);
                nuevacontrase = password.getText().toString();
                contrase.add(nuevacontrase);

                user.setText("");
                password.setText("");

                Intent l = new Intent(registro.this, login.class);
                startActivity(l);
            }
        });

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
