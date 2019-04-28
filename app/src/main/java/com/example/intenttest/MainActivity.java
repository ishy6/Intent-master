package com.example.intenttest;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.content.Intent;
import android.net.Uri;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    //private Button b1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }

    public void onClick(View view){

        TextView tv1 = findViewById(R.id.tv1);

        String s = tv1.getText().toString();

        Intent intent = new Intent();

        //intent.setAction(Intent.ACTION_VIEW);
        intent.setAction("android.intent.action.VIEW");

        intent.putExtra("url",s);

        startActivity(intent);


    }
}
