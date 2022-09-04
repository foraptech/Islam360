package com.example.islam360;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.content.ContextCompat;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.database.Cursor;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;

public class DataShowinRecyclerViewActivity extends AppCompatActivity {
    RecyclerView rv;
    TextView arrowback;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_data_showin_recycler_view);
        getWindow().setStatusBarColor(ContextCompat.getColor(this,R.color.black));

        rv = (RecyclerView) findViewById(R.id.quranlistRecycleview);
        arrowback = (TextView) findViewById(R.id.back2);
        rv.setLayoutManager(new LinearLayoutManager(this));

        ArrayList<quranlistadaptar> quranlist = new ArrayList<>();
        database dataaya = new database(this);

        Cursor cv = dataaya.idfetchkaro();
        if (cv.getCount() == 0){
            Toast.makeText(this, "No Record", Toast.LENGTH_SHORT).show();
        }
        else {
            while (cv.moveToNext()) {
                int aid = cv.getInt(1);
                int sid = cv.getInt(3);

                String ayat = cv.getString(4);
                String ayatname = cv.getString(5);

                quranlistadaptar qurandataya = new quranlistadaptar(aid, sid,ayat, ayatname);
                quranlist.add(qurandataya);
            }

            HumaraCustomizeAdapter adpt = new HumaraCustomizeAdapter(quranlist);
            rv.setAdapter(adpt);

        }
        arrowback.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent p = new Intent(DataShowinRecyclerViewActivity.this,AyatPage.class);
                startActivity(p);
            }
        });

    }
}