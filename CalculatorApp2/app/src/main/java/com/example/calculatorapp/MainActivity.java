package com.example.calculatorapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }

    public void switchScreens(View view) {
        EditText editText = findViewById(R.id.enteredName);
        String name = editText.getText().toString();
        Intent intent = new Intent(this, SecondActivity.class);
        intent.putExtra("NAME", name);
        startActivity(intent);
    }
    public void switchScreens1(View view) {
        EditText editText = findViewById(R.id.enteredName);
        String name = editText.getText().toString();
        Intent intent = new Intent(this, ThirdActivity.class);
        intent.putExtra("NAME", name);
        startActivity(intent);
    }
    public void switchScreens2(View view) {
        EditText editText = findViewById(R.id.enteredName);
        String name = editText.getText().toString();
        Intent intent = new Intent(this, FourthActivity.class);
        intent.putExtra("NAME", name);
        startActivity(intent);

    } public void switchScreens3(View view) {
        EditText editText = findViewById(R.id.enteredName);
        String name = editText.getText().toString();
        Intent intent = new Intent(this, FifthActivity.class);
        intent.putExtra("NAME", name);
        startActivity(intent);
    }


}