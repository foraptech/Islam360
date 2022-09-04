package com.example.islam360;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class images extends AppCompatActivity {
    TextView arrowback;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_images);
        arrowback = (TextView) findViewById(R.id.back3);

        arrowback.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent p = new Intent(images.this,DataShowinRecyclerViewActivity.class);
                startActivity(p);
            }
        });
    }
}