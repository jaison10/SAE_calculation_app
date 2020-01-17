package com.example.jaison.aero;

import android.content.Intent;
import android.graphics.Typeface;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class MainSplash extends AppCompatActivity {

    TextView t;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_splash);

        t=(TextView) findViewById(R.id.my_text);
        Typeface myCustomFont= Typeface.createFromAsset(getAssets(),"fonts/Good Brush.ttf");
        t.setTypeface(myCustomFont);

        Thread mythread= new Thread(){
            @Override
            public void run(){
              try{
                  sleep(3000);
                  Intent intent= new Intent(getApplicationContext(),MainActivity.class);
                  startActivity(intent);
                  finish();
              }
                catch (InterruptedException e){
                  e.printStackTrace();
                }
            }
        };
        mythread.start();
    }
}
