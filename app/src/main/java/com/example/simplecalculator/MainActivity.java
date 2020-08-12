package com.example.simplecalculator;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    EditText e1, e2;
    TextView t1;
    int num1, num2;
    String s1="",s2="";

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_main);
    }
    public boolean getNumbers()
    {
        e1 = (EditText)findViewById(R.id.num1);
        e2 = (EditText)findViewById(R.id.num2);
        t1 = (TextView)findViewById(R.id.result);
        s1 = e1.getText().toString();
        s2 = e2.getText().toString();
        if (s1.equals("") && s2.equals(""))
        {
            String result = "Please enter a value";
            t1.setText(result);

            return false;
        }
        else {
            num1 = Integer.parseInt(e1.getText().toString());
            num2 = Integer.parseInt(e2.getText().toString());
        }

        return true;
    }
    public void Sum(View v)
    {
        if (getNumbers())
        {
            int sum = num1 + num2;
            t1.setText(Integer.toString(sum));
        }
    }
    public void Pow(View v)
    {
        if (getNumbers())
        {
            double sum = Math.pow(num1, num2);
            t1.setText(Double.toString(sum));
        }
    }
    public void Sub(View v)
    {
        if (getNumbers()) {
            int sum = num1 - num2;
            t1.setText(Integer.toString(sum));
        }
    }
    public void Mul(View v)
    {
        if (getNumbers())
        {
            int sum = num1 * num2;
            t1.setText(Integer.toString(sum));
        }
    }
    public void Div(View v)
    {
        if (getNumbers())
        {
            double sum = num1 / (num2 * 1.0);
            t1.setText(Double.toString(sum));
        }
    }
    public void Mod(View v)
    {
        if (getNumbers())
        {
            double sum = num1 % num2;
            t1.setText(Double.toString(sum));
        }
    }
}