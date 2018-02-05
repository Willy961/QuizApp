package com.example.android.quizapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Html;
import android.view.View;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity
{
    public int success = 0;


    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView title1 = (TextView) findViewById(R.id.title1);
        TextView title2 = (TextView) findViewById(R.id.title2);
        TextView title3 = (TextView) findViewById(R.id.title3);
        TextView title4 = (TextView) findViewById(R.id.title4);

        title1.setText(Html.fromHtml("<b>QUESTION 1</b>"));
        title2.setText(Html.fromHtml("<b>QUESTION 2</b>"));
        title3.setText(Html.fromHtml("<b>QUESTION 3</b>"));
        title4.setText(Html.fromHtml("<b>QUESTION 4</b>"));
    }

    public void back(View view)
    {
        //RETURN BACK
        Intent intentBack = new Intent(this, MainActivity.class);
        startActivity(intentBack);
    }

    public void Finish(View view)
    {
        // CHECKED QUESTION 1
        CheckBox cb1 = (CheckBox) findViewById(R.id.checkBox11);
        CheckBox cb2 = (CheckBox) findViewById(R.id.checkBox12);
        if(cb1.isChecked() && cb2.isChecked()) success ++;

        // CHECKED QUESTION 2
        RadioButton button2 = (RadioButton) findViewById(R.id.radioButton22);
        if(button2.isChecked()) success++;

        // CHECKED QUESTION 3
        EditText editT1 = (EditText) findViewById(R.id.editText1);
        if(editT1.getText().toString().equals("38")) success++;

        // CHECKED QUESTION 4
        RadioButton button4 = (RadioButton) findViewById(R.id.radioButton43);
        if(button4.isChecked()) success++;


        //GO TO FINAL PAGE
        Intent intentFinal = new Intent(this, ActivityQuiz.class);
        intentFinal.putExtra("aciertoInt", success);
        startActivity(intentFinal);
    }
}
