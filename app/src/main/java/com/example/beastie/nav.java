package com.example.beastie;

import android.os.Bundle;
import android.view.MenuItem;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;

import com.google.android.material.bottomnavigation.BottomNavigationView;

public class nav extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.nav);

        loadfragment (new HomeFragment());
        BottomNavigationView bottomNavigationView = findViewById(R.id.bottomNavigationView3);
        bottomNavigationView.setOnNavigationItemSelectedListener((BottomNavigationView.OnNavigationItemSelectedListener) this);
    }

    private  boolean loadfragment(Fragment fragment) {
        if (fragment != null) {
            getSupportFragmentManager().beginTransaction()
                    .replace(R.id.frame_layout, fragment)
                    .commit();
            return true;
        }
        return false;
    }


    public boolean onNavigationItemSelected(@NonNull MenuItem item) {
        Fragment fragment = null;
        switch (item.getItemId()) {
            case R.id.home_nav:
                fragment = new HomeFragment();
                break;
            case R.id.people_nav:
                fragment = new PeopleFragment();
                break;
            case R.id.location_nav:
                fragment = new LocationFragment();
                break;
            case R.id.dm_nav:
                fragment = new DMFragment();
                break;
        }
        return loadfragment(fragment);
    }
}
