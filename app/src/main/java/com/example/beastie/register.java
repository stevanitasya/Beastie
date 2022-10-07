package com.example.beastie;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

public class register extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.register);
    }

//    public void RegisterP (View view) {
//        Intent intent = new Intent(register.this, registerp.class);
//        startActivity(intent);
//    }
//
//    public void RegisterPF (View view) {
//        Intent intent = new Intent(register.this, registerpf.class);
//        startActivity(intent);
//    }

    public void login(View view) {
        Intent intent = new Intent(register.this, loginp.class);
        startActivity(intent);
    }
}
