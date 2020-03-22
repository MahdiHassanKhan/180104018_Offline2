package com.example.guesstolive;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class StartDetails_ThirdActivity extends AppCompatActivity {

    private Button stgb;
    private Button gdb;
    private Button devb;
    private Button statb;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_start_details__third);
        stgb = findViewById(R.id.stgbid);
        stgb.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent3to4 = new Intent(StartDetails_ThirdActivity.this,InsideGame_FourthActivity.class);
                startActivity(intent3to4);
            }
        });
        gdb = findViewById(R.id.gdbid);
        gdb.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent3to4_2 = new Intent(StartDetails_ThirdActivity.this,GameDetails_FourthActivity.class);
                startActivity(intent3to4_2);
            }
        });
        devb = findViewById(R.id.devbid);
        devb.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent3to4_3 = new Intent(StartDetails_ThirdActivity.this,Developer_FourthActivity.class);
                startActivity(intent3to4_3);
            }
        });

        statb = findViewById(R.id.statbid);
        statb.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent3to4_4 = new Intent(StartDetails_ThirdActivity.this,GamerStat_FourthActivity.class);
                startActivity(intent3to4_4);
            }
        });

    }
}
