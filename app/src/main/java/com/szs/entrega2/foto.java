package com.szs.entrega2;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.graphics.Bitmap;
import android.os.Bundle;
import android.os.Handler;
import android.provider.MediaStore;
import android.util.Log;
import android.widget.ImageView;

import androidx.activity.EdgeToEdge;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;



public class foto extends AppCompatActivity {

    String TAG="test";
    ImageView ImageView;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);

        setContentView(R.layout.activity_foto);
        ImageView =(ImageView) findViewById(R.id.ImageView);
        Intent f = new Intent(MediaStore.ACTION_IMAGE_CAPTURE);
        startActivityForResult(f,0);

    }

    @Override

    public void  onActivityResult(int requestCode, int resultCode,@Nullable Intent data){
        super.onActivityResult(requestCode,resultCode,data);
        Bitmap bitmap =(Bitmap) data.getExtras().get("data");
        ImageView.setImageBitmap(bitmap);
    };

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