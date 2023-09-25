package com.cs407.calculatorapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    public void add(View view) {
        EditText firstNum = (EditText) findViewById((R.id.firstNumField));
        EditText secondNum = (EditText) findViewById(R.id.secondNumField);

        int n1 = Integer.parseInt(firstNum.getText().toString());
        int n2 = Integer.parseInt(secondNum.getText().toString());

        int res = n1 + n2;
        String str = "" + res;

        goToActivity(str);
    }

    public void subtract(View view) {
        EditText firstNum = (EditText) findViewById((R.id.firstNumField));
        EditText secondNum = (EditText) findViewById(R.id.secondNumField);

        int n1 = Integer.parseInt(firstNum.getText().toString());
        int n2 = Integer.parseInt(secondNum.getText().toString());

        int res = n1 - n2;
        String str = "" + res;

        goToActivity(str);
    }

    public void multipy(View view) {
        EditText firstNum = (EditText) findViewById((R.id.firstNumField));
        EditText secondNum = (EditText) findViewById(R.id.secondNumField);

        int n1 = Integer.parseInt(firstNum.getText().toString());
        int n2 = Integer.parseInt(secondNum.getText().toString());

        int res = n1 * n2;
        String str = "" + res;

        goToActivity(str);
    }

    public void divide(View view) {
        EditText firstNum = (EditText) findViewById((R.id.firstNumField));
        EditText secondNum = (EditText) findViewById(R.id.secondNumField);

        float n1 = Integer.parseInt(firstNum.getText().toString());
        float n2 = Integer.parseInt(secondNum.getText().toString());

        String str = "";

        if (n2 == 0) {
            str = "ERROR! Cannot divide by 0";
        } else {
            double res = n1/n2;
            str = "" + res;
        }
        goToActivity(str);
    }

    public void goToActivity(String s) {
        Intent intent = new Intent(this, Result.class);
        intent.putExtra("message", s);
        startActivity(intent);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}