package com.example.a1405178.invisible;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    Button b, p;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        b = (Button) findViewById(R.id.blue);
        p = (Button) findViewById(R.id.pink);
    }

    public void toDo(View view) {
        if (view.equals(b)) {
            view.setVisibility(View.INVISIBLE);
        }
        if (view.equals(p)){
            Toast.makeText(getApplicationContext(),"to do List",Toast.LENGTH_SHORT).show();
        }
    }
}
