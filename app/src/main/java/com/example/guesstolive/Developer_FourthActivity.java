package com.example.guesstolive;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class Developer_FourthActivity extends AppCompatActivity implements View.OnClickListener {

    private ImageView dnimage,didimage,dsemimage,mhkimage;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_developer__fourth);
        dnimage = findViewById(R.id.dnimageid);
        didimage = findViewById(R.id.didimageid);
        dsemimage = findViewById(R.id.dsemimageid);
        mhkimage = findViewById(R.id.mhkimageid);
        dnimage.setOnClickListener(this);
        didimage.setOnClickListener(this);
        dsemimage.setOnClickListener(this);
        mhkimage.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        if(v.getId()==R.id.dnimageid)
        {
            didimage.setVisibility(View.VISIBLE);
        }
        else if(v.getId()==R.id.didimageid)
        {
            dsemimage.setVisibility(View.VISIBLE);
        }
        else if(v.getId()==R.id.dsemimageid)
        {
            mhkimage.setVisibility(View.VISIBLE);
        }
        else if(v.getId()==R.id.mhkimageid)
        {
            dnimage.setVisibility(View.VISIBLE);
        }
    }
}
