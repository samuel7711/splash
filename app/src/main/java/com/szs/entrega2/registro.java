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

        registrar =(Button) findViewById(R.id.registrar);
        user =(EditText) findViewById(R.id.user);
        password =(EditText) findViewById(R.id.password);
    }

    private void regis(){
        if (user.getText().toString().isEmpty() || password.getText().toString().isEmpty()) {
            Toast.makeText(this,"Completa los campos", Toast.LENGTH_SHORT).show();
        }else{
            datos[0]=user.getText().toString();
            datos[1]=password.getText().toString();

            Intent i = new Intent(registro.this, login.class);
            Bundle bundle = new Bundle();
            bundle.putStringArray("Key",datos);
            i.putExtras(bundle);
            setResult(RESULT_OK, i);
            finish();
        }
    };

    @Override
    protected void onStart() {
        super.onStart();
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_registro);
        Log.d(TAG,"Estoy en el onStart");

        registrar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                regis();

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
