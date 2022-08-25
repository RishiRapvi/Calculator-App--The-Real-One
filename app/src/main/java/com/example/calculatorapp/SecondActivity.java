package com.example.calculatorapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class SecondActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        Intent intent = getIntent();
        String nameToShow = intent.getStringExtra("NAME");

        TextView textView = findViewById(R.id.userName);
        textView.setText(nameToShow + ", welcome to your calculator app.");

    }
    public void findSum(View view) {
        EditText number1ET = findViewById(R.id.num1ET);
        EditText number2ET = findViewById(R.id.num2ET);
        TextView numberSumTV = findViewById(R.id.resultTV);
        try {

            int num1 = Integer.parseInt((number1ET.getText().toString()));
            int num2 = Integer.parseInt((number2ET.getText().toString()));
            int sum = num1 + num2;

            numberSumTV.setText("The result of your calculation is: " + sum);
        }catch(Exception e){
            numberSumTV.setText("This cannot be calculated. Please try again.");
        }
    }

    public void switchScreens(View view) {
        EditText editText = findViewById(R.id.enteredName);
        String name = editText.getText().toString();
        Intent intent = new Intent(this, SecondActivity.class);
        intent.putExtra("NAME", name);
        startActivity(intent);
    }

}