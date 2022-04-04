package ru.mirea.pashev_anton_bsbo_04_20.intentapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class MainActivity2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        Intent intent = getIntent();
        String date = intent.getStringExtra("message");

        TextView textView = (TextView)findViewById(R.id.textView);
        textView.setText(date);
    }
}