package com.allysa.helloword;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void changeText(View view){
        TextView helloText = (TextView) findViewById(R.id.helloText);
        helloText.setText("Welcome:)");
    }

    public void goToCounter(View v){
        Intent counter = new Intent(this, CounterActivity.class);
        startActivity(counter);
    }

    }
