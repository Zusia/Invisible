package com.example.a1405178.invisible2;

import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RelativeLayout;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    Button b1,b2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //creating button directly from mainActivity
         b1=(Button)findViewById(R.id.blue);
        //properties of this button defined here
        b2=new Button(getApplicationContext());
        b2.setTextColor(Color.BLACK);
        b2.setBackgroundColor(Color.parseColor("#f29dee"));
        b2.setText("Pink Button");
        RelativeLayout rl=(RelativeLayout)findViewById(R.id.RelativeLayout_mainScreen);
        RelativeLayout.LayoutParams params=new RelativeLayout.LayoutParams(
                RelativeLayout.LayoutParams.MATCH_PARENT,
                RelativeLayout.LayoutParams.WRAP_CONTENT
        );
        params.addRule(RelativeLayout.BELOW,b1.getId());
        rl.addView(b2,params);
        b1.setOnClickListener(this);
        b2.setOnClickListener(this);
  }

    @Override
    public void onClick(View v) {
        if (v.equals(b1)){
            v.setVisibility(View.INVISIBLE);
        }
        if (v.equals(b2)){
            Toast.makeText(getApplicationContext(),"To do",Toast.LENGTH_SHORT).show();
        }
    }
}
