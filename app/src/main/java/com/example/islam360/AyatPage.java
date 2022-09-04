package com.example.islam360;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.content.ContextCompat;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentTransaction;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class AyatPage extends AppCompatActivity {

    TextView tl,arrowback;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ayat_page);
        getWindow().setStatusBarColor(ContextCompat.getColor(this,R.color.black));
//        SQLiteImporterExporter sqLiteImporterExporter = new SQLiteImporterExporter(getApplicationContext(), "helloworld.db");

        tl = (TextView) findViewById(R.id.alfatihah);
        arrowback = (TextView) findViewById(R.id.back);
        tl.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent p = new Intent(AyatPage.this,DataShowinRecyclerViewActivity.class);
                startActivity(p);
            }
        });
        arrowback.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                FragmentTransaction fragmentTransaction = getSupportFragmentManager().beginTransaction();
                fragmentTransaction.replace(R.id.container,new QuranFragment()).commit();
            }
        });

    }
}