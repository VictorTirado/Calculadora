package com.example.victortf2.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class CalculadoraActivity extends AppCompatActivity {


    private TextView numview;
    private String num = ""; // Això és el numero actual (el "Model")
    private String operator ="";
    private String prev_num="";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calculadora);

        numview = findViewById(R.id.curr_num);
        numview.setText(num);
    }
    public void onClickDigit(View view)
    {
        Button b = (Button)view;
        num += b.getText().toString().charAt(0);
        numview.setText(num);

    }

    public void OnClickOperator(View view)
    {
        Button b = (Button)view;
        operator = b.getText().toString();
        prev_num = num;
        numview.setText("");

    }

    public void onClickEqual(View view)
    {
        if(operator.equals("+"))
        {

        }
        if(operator.equals("-"))
        {

        }
        if(operator.equals("*"))
        {

        }
        if(operator == "/")
        {

        }
    }

    public void onClickDot(View view)
    {

    }
}
