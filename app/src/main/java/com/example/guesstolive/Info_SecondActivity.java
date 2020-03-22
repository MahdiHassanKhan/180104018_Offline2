package com.example.guesstolive;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class Info_SecondActivity extends AppCompatActivity {

    private Button db;
    private EditText nt;
    private EditText at;
    private EditText ct;
    private EditText grg;
    String name,country;
    int id;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_info__second);
        db = findViewById(R.id.dbid);
        db.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent2to3 = new Intent(Info_SecondActivity.this,StartDetails_ThirdActivity.class);
                name = nt.getText().toString();
                intent2to3.putExtra("Name",name);
                startActivity(intent2to3);
            }
        });
        nt = findViewById(R.id.ntid);

    }
}
