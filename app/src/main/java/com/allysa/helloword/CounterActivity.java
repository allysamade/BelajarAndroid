package com.allysa.helloword;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class CounterActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_counter);
        EditText nm = (EditText) findViewById(R.id.textNama);
        nm.requestFocus();
    }

    public void SendData(View v){
        EditText edit = (EditText) findViewById(R.id.editText);
        String pesan = edit.getText().toString(); // variable pesan

        //create object intent
        Intent intent = new Intent(this, SecondActivity.class);

        //put data
        intent.setData(Uri.parse(pesan));

        //start activity
        startActivity(intent);
    }

    public void sendExtras(View v){
        EditText nm = (EditText) findViewById(R.id.textNama);
        String nama = nm.getText().toString();
        EditText input = (EditText) findViewById(R.id.editText);
        String pesan = input.getText().toString(); // variable pesan

        //create object intent
        Intent intent = new Intent(this, SecondActivity.class);

        //put extras
        intent.putExtra("name", nama); //putExtra(key,value);
        intent.putExtra("msg", pesan); //putExtra(key,value);


        //start activity
        startActivity(intent);

    }

    /*public void sendExtrasBundle(View v){
        EditText nm = (EditText) findViewById(R.id.textNama);
        String nama = nm.getText().toString();
        EditText input = (EditText) findViewById(R.id.editText);
        String pesan = input.getText().toString(); // variable pesan

        //create object intent
        Intent intent = new Intent(this, SecondActivity.class);

        //create bundle
        Bundle data = new Bundle();
        data.putString("name", nama);
        data.putString("msg", pesan);

        //put extras
        intent.putExtras(data);

        //start activity
        startActivity(intent);
    }
*/

}
