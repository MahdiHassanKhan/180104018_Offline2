package com.example.guesstolive;

import androidx.appcompat.app.AppCompatActivity;
import java.util.Random;
import android.os.Bundle;

public class InsideGame_FourthActivity extends AppCompatActivity {

    Random dice;
    int min=0;
    int max=9;
    int randomnum;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_inside_game__fourth);
        dice = new Random();
        randomnum = dice.nextInt((max-min)+1)+min;
    }
}
