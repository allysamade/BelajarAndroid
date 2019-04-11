package com.allysa.helloword;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class SecondActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        //get Intent
        Intent intent = getIntent();

        //get Data
        //String pesanData = intent.getData().toString();

        //getExtras
        String nama = intent.getStringExtra("name");
        String pesanExtras = intent.getStringExtra("msg");



        /*//get Extras with Bundle
        Bundle data = intent.getExtras();
        String nama = data.getString("name");
        String pesanExtra = data.getString("msg");
        */


        //give data to textView
        TextView nm = (TextView) findViewById(R.id.textNama);
        nm.setText(nama);

        TextView txt = (TextView) findViewById(R.id.textPswrd);
        txt.setText(pesanExtras);
    }

}
