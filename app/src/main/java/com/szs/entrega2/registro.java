package com.szs.entrega2;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;

public class registro extends AppCompatActivity {

    String TAG="test";
    Button registrar;
    EditText user, password;
    String[] datos = new String[2];




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_registro);


    }

    @Override
    protected void onStart() {
        super.onStart();
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_registro);
        Log.d(TAG,"Estoy en el onStart");

        registrar = findViewById(R.id.res);

        registrar.setOnClickListener(view -> {
            regis();
        });

    }

    private void regis(){

        user = findViewById(R.id.user);
        password = findViewById(R.id.password);

        if (user.getText().toString().isEmpty() || password.getText().toString().isEmpty()) {
            Toast.makeText(this,"Completa los campos", Toast.LENGTH_SHORT).show();
        }
        else{
            datos[0]=user.getText().toString();
            datos[1]=password.getText().toString();

            user.setText("");
            password.setText("");

            Intent i = new Intent(registro.this, login.class);
            Bundle bundle = new Bundle();
            bundle.putStringArray("Key",datos);
            i.putExtras(bundle);
            setResult(RESULT_OK,i);
            startActivity(i);

        }
    };

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
