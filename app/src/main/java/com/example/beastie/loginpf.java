package com.example.beastie;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

public class loginpf extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.loginpf);
    }

    public void loginp(View view) {
        Intent intent = new Intent(MainActivity.this, fragment_home.class);
        startActivity(intent);
    }
}
