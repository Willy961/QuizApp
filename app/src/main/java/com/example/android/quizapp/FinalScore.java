package com.example.android.quizapp;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

/**
 * Created by eusebiomayorgarcia on 25/1/18.
 */

public class FinalScore extends AppCompatActivity
{
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.final_score);

        /*
        TextView textView = (TextView)findViewById(R.id.textView);
        String message = "CONSEGUIDO!! " ;
        textView.setText(message);
        */
        Intent mIntent = getIntent();
        int acierto = mIntent.getIntExtra("acierto", 0);


        TextView textView = (TextView)findViewById(R.id.textView);
        String message = "CONSEGUIDO!! " + acierto ;
        textView.setText(message);
    }


    public void back(View view)
    {
        //BACK
        Intent intentBack = new Intent(this, MainActivity.class);
        startActivity(intentBack);
    }
}
