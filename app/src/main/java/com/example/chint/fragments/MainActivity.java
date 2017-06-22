package com.example.chint.fragments;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    Button google;
    Button yahoo;
    Button bing;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        GoogleFragment a = new GoogleFragment();
        getFragmentManager().beginTransaction().add(R.id.frame, a, "Google").commit();
    }

    public void onClick(View v){
        google = (Button)findViewById(R.id.google);
        bing = (Button)findViewById(R.id.bing);
        yahoo = (Button)findViewById(R.id.yahoo);

        GoogleFragment a = new GoogleFragment();
        BingFragment c = new BingFragment();
        YahooFragment b = new YahooFragment();

        int id = v.getId();
        if(id == R.id.google){
            getFragmentManager().beginTransaction().add(R.id.frame, a, "Google").commit();
        }
        if(id == R.id.bing){
            getFragmentManager().beginTransaction().add(R.id.frame, c, "Bing").commit();
        }
        if (id == R.id.yahoo){
            getFragmentManager().beginTransaction().add(R.id.frame, b, "Yahoo").commit();
        }
    }
}
