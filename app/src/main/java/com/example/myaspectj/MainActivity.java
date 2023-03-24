package com.example.myaspectj;

import androidx.appcompat.app.AppCompatActivity;

import android.Manifest;
import android.os.Bundle;
import android.util.Log;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @AspectJAnnotation(value = Manifest.permission.CAMERA)
    public void checkPermission() {
        Log.i("tag", "检查权限");
    }

    public void btClick(View view){
        checkPermission();
    }
}