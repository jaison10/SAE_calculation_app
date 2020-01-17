package com.example.jaison.aero;

import android.content.Intent;
import android.graphics.Typeface;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class Main2Activity extends AppCompatActivity implements View.OnClickListener{
    Button btnWing;
    Button btnTail;
    Button btnFuse;
    TextView txtViewPlane;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        btnWing=(Button) findViewById(R.id.buttonWing);
        btnTail=(Button) findViewById(R.id.buttonTail);
        btnFuse=(Button) findViewById(R.id.buttonFuse);
        btnWing.setOnClickListener(this);
        btnTail.setOnClickListener(this);
        btnFuse.setOnClickListener(this);

        txtViewPlane=(TextView) findViewById(R.id.textView);
        Typeface myCustomFont= Typeface.createFromAsset(getAssets(),"fonts/Aligantis Font.ttf");
        txtViewPlane.setTypeface(myCustomFont);

        btnWing=(Button) findViewById(R.id.buttonWing);
        Typeface myCustomFont1= Typeface.createFromAsset(getAssets(),"fonts/Chopsic.otf");
        btnWing.setTypeface(myCustomFont1);

        btnTail=(Button) findViewById(R.id.buttonTail);
        Typeface myCustomFont2= Typeface.createFromAsset(getAssets(),"fonts/Chopsic.otf");
        btnTail.setTypeface(myCustomFont2);

        btnFuse=(Button) findViewById(R.id.buttonFuse);
        Typeface myCustomFont3= Typeface.createFromAsset(getAssets(),"fonts/Chopsic.otf");
        btnFuse.setTypeface(myCustomFont3);
    }

    @Override
    public void onClick(View view) {
        if(view.getId()==R.id.buttonWing){
            openWingActivity();
        }
        if(view.getId()==R.id.buttonTail)
        {
            openTaleActivity();
        }
        if(view.getId()==R.id.buttonFuse){
            openFuseActivity();
        }
    }
    public void openWingActivity(){
        Intent intent =new Intent(this, MainWingActivity.class);
        startActivity(intent);
    }
    public void openTaleActivity(){
        Intent intent =new Intent(this, MainTaleActivity.class);
        startActivity(intent);
    }
    public void openFuseActivity(){
        Intent intent =new Intent(this, MainfuseActivity.class);
        startActivity(intent);
    }
}
