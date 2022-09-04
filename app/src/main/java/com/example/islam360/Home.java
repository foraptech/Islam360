package com.example.islam360;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.content.ContextCompat;
import androidx.fragment.app.Fragment;

import android.os.Bundle;
import android.view.MenuItem;

import com.google.android.material.bottomnavigation.BottomNavigationView;
import com.google.android.material.navigation.NavigationBarView;

public class Home extends AppCompatActivity {

    BottomNavigationView nv;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
        getWindow().setStatusBarColor(ContextCompat.getColor(this,R.color.black));

        nv = (BottomNavigationView) findViewById(R.id.bottomnavigarion);
        Fragment had = new HomeFragment();
        getSupportFragmentManager().beginTransaction().replace(R.id.fram,had).commit();
        nv.setOnItemSelectedListener(new NavigationBarView.OnItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                switch (item.getItemId()){
                    case R.id.one:
                            Fragment ho = new QuranFragment();
                        getSupportFragmentManager().beginTransaction().replace(R.id.fram,ho).commit();

                        break;
                    case R.id.two:
                        Fragment quran = new HadithFragment();
                        getSupportFragmentManager().beginTransaction().replace(R.id.fram,quran).commit();

                        break;
                    case R.id.three:
                        Fragment had = new HomeFragment();
                        getSupportFragmentManager().beginTransaction().replace(R.id.fram,had).commit();
                        break;
                    case R.id.four:
                        Fragment ibadat = new IbaadatFragment();
                        getSupportFragmentManager().beginTransaction().replace(R.id.fram,ibadat).commit();
                        break;
                    case R.id.five:
                        Fragment more = new MoreFragment();
                        getSupportFragmentManager().beginTransaction().replace(R.id.fram,more).commit();
                        break;
                }
                return true;
            }
        });
    }
}