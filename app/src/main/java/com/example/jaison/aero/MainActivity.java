package com.example.jaison.aero;

import android.content.Intent;
import android.graphics.Typeface;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.ImageButton;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    TextView t;
    ImageButton img1;
    ImageButton img2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    t=(TextView) findViewById(R.id.my_text2);
        Typeface myCustomFont= Typeface.createFromAsset(getAssets(),"fonts/Aligantis Font.ttf");
        t.setTypeface(myCustomFont);

    img1=(ImageButton) findViewById(R.id.ImageButtonPlane);
    img2=(ImageButton) findViewById(R.id.ImageButtonDrone);
    img1.setOnClickListener(this);
    img2.setOnClickListener(this);

    }
    @Override
    public void onClick(View view) {
        if(view.getId()==R.id.ImageButtonPlane){
            openActivityPlane();
        }
        if(view.getId()==R.id.ImageButtonDrone){
            openActivityDrone();
        }
    }

    public void openActivityPlane(){
        Intent intent =new Intent(this, Main2Activity.class);
        startActivity(intent);
    }
    public void openActivityDrone(){
        Intent intent =new Intent(this,MainDroneActivity.class);
        startActivity(intent);
    }
}
