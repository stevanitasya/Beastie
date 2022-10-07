package com.example.beastie;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.content.Intent;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void registerP(View view) {
        Intent intent = new Intent(MainActivity.this, registerp.class);
        startActivity(intent);
    }

    public void loginp(View view) {
        Intent intent = new Intent(MainActivity.this, loginpf.class);
        startActivity(intent);
    }
}



