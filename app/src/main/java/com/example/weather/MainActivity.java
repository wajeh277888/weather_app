package com.example.weather;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private TextView textview[]=new TextView[20];
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        textview[0]=findViewById(R.id.degree1);
        textview[1]=findViewById(R.id.degree2);
        textview[2]=findViewById(R.id.degree3);
        textview[3]=findViewById(R.id.degree4);
        textview[4]=findViewById(R.id.degree5);
        textview[5]=findViewById(R.id.degree6);
        textview[6]=findViewById(R.id.city1);
        textview[7]=findViewById(R.id.city2);
        textview[8]=findViewById(R.id.city3);
        textview[9]=findViewById(R.id.city4);
        textview[10]=findViewById(R.id.city5);
        textview[11]=findViewById(R.id.city6);
        textview[12]=findViewById(R.id.state1);
        textview[13]=findViewById(R.id.state2);
        textview[14]=findViewById(R.id.state3);
        textview[15]=findViewById(R.id.state4);
        textview[16]=findViewById(R.id.state5);
        textview[17]=findViewById(R.id.state6);



    }
}