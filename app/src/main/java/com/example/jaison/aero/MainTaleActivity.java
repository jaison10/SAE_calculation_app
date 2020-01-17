package com.example.jaison.aero;

import android.graphics.Typeface;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Button;

public class MainTaleActivity extends AppCompatActivity implements View.OnClickListener{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_tale);
        Button btn;
        TextView txt;
        btn=(Button)findViewById(R.id.button);
        txt=(TextView)findViewById(R.id.textViewTails);
        btn.setOnClickListener(this);

        Typeface t1=Typeface.createFromAsset(getAssets(),"fonts/Aligantis Font.ttf");
        txt.setTypeface(t1);
        Typeface t2=Typeface.createFromAsset(getAssets(),"fonts/Chopsic.ttf");
        btn.setTypeface(t2);
    }
    @Override
    public void onClick(View view){

    }
}
