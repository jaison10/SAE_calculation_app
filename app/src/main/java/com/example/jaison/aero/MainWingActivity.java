package com.example.jaison.aero;

import android.content.Intent;
import android.graphics.Typeface;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Button;

public class MainWingActivity extends AppCompatActivity implements View.OnClickListener{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_wing);

        TextView txtViewWing;
        Button btnTaper;
        Button btnStraight;
        Button btnDelta;
        Button btnDihedral;
        btnTaper=(Button)findViewById(R.id.buttonWing);
        btnStraight=(Button)findViewById(R.id.buttonStraight);
        btnDelta=(Button)findViewById(R.id.buttonDelta);
        btnDihedral=(Button)findViewById(R.id.buttonDihedral);
        btnTaper.setOnClickListener(this);
        btnStraight.setOnClickListener(this);
        btnDelta.setOnClickListener(this);
        btnDihedral.setOnClickListener(this);

        txtViewWing=(TextView) findViewById(R.id.textView);
        Typeface myCustomFont= Typeface.createFromAsset(getAssets(),"fonts/Aligantis Font.ttf");
        txtViewWing.setTypeface(myCustomFont);

        btnTaper=(Button) findViewById(R.id.buttonTaper);
        Typeface myCustomFont2= Typeface.createFromAsset(getAssets(),"fonts/Chopsic.ttf");
        txtViewWing.setTypeface(myCustomFont2);

        btnStraight=(Button) findViewById(R.id.buttonStraight);
        Typeface myCustomFont3= Typeface.createFromAsset(getAssets(),"fonts/Chopsic.ttf");
        txtViewWing.setTypeface(myCustomFont3);

        btnDelta=(Button) findViewById(R.id.buttonDelta);
        Typeface myCustomFont4= Typeface.createFromAsset(getAssets(),"fonts/Chopsic.ttf");
        txtViewWing.setTypeface(myCustomFont4);

        btnDihedral=(Button) findViewById(R.id.buttonDihedral);
        Typeface myCustomFont5= Typeface.createFromAsset(getAssets(),"fonts/Chopsic.ttf");
        txtViewWing.setTypeface(myCustomFont5);
    }
    @Override
    public void onClick(View view){
//        if(view.getId()==R.id.buttonWing){
//            openTaper();
//        }
//        if(view.getId()==R.id.buttonStraight){
//            openStraight();
//        }
//        if(view.getId()==R.id.buttonDelta){
//            openDelta();
//        }
//        if(view.getId()==R.id.buttonFuse){
//            openFuse();
//        }
    }

}
