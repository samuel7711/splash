package com.szs.entrega2;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import java.util.Objects;


public class login extends AppCompatActivity {

    String TAG="test",strU,strP;
    Button login, registrar ;

    EditText userr,pass;
    String[] datos = new String[2];
    Users user;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_login);



    }



    @Override
    protected void onStart() {
        super.onStart();


        login = (Button) findViewById(R.id.login);
        userr =(EditText) findViewById(R.id.userr);
        pass =(EditText) findViewById(R.id.pass);
        registrar = findViewById(R.id.registrar);

        Log.d(TAG,"Estoy en el onStart");
        user = new Users("admin","admin");

        registrar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // Iniciar la actividad de registro esperando resultado
                Intent intent = new Intent(login.this, registro.class);
                startActivityForResult(intent, 1);  // Usar startActivityForResult()
            }
        });

        login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                strU=userr.getText().toString();
                strP=pass.getText().toString();
                if(Objects.equals(strU, user.User) && Objects.equals(strP, user.Pass)) {
                    viewfoto();
                }else{
                    AlertErrorLogin();
                }
            }
        });


    }

    private void AlertErrorLogin() {
        Toast.makeText(login.this, "Por favor ingresar un usuario valido", Toast.LENGTH_SHORT).show();
        pass.setText("");
    }


    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        if(requestCode==1 && resultCode==RESULT_OK && data!=null){
            datos = data.getStringArrayExtra("key");
            if(datos!=null) {
                //Asignacion de variables
                    user.User = datos[0];
                    user.Pass = datos[1];
            }
        }
    }

    private void viewfoto() {
        //Asignacion de variables
        datos[0]=user.User;
        datos[1]=user.Pass;


        //Limpieza de campos
        userr.setText("");
        pass.setText("");
        Intent i =new Intent(com.szs.entrega2.login.this, foto.class);
        Bundle bundle = new Bundle();
        bundle.putStringArray("key", datos);
        i.putExtras(bundle);
        startActivity(i);
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