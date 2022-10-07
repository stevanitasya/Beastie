package com.example.beastie;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

public class registerp extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.registerp);
    }

    public void registerP(View view) {
        Intent intent = new Intent(MainActivity.this, photoprofile.class);
        startActivity(intent);
    }
}
