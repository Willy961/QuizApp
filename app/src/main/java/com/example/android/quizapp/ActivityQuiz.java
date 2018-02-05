package com.example.android.quizapp;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class ActivityQuiz extends AppCompatActivity
{
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.final_score);

        //Get success
        Intent mIntent = getIntent();
        int success = mIntent.getIntExtra("aciertoInt", 0);

        TextView textView = (TextView)findViewById(R.id.textView);
        String message = "";

        if (success == 4) message = "CONSEGUIDO!! /n Has conseguido el máximo de aciertos posibles!";
        else message = "Has conseguido " + success + " aciertos, puedes mejorar.";

        textView.setText(message);
    }


    public void Start(View view)
    {
        //BACK
        Intent intentBack = new Intent(this, MainActivity.class);
        startActivity(intentBack);
    }
}
