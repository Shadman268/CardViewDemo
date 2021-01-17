package com.example.mycardview;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private CardView schoolCardView,hospitalCardView,restaurantCardView,airportCardView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        schoolCardView = findViewById(R.id.schoolCardViewId);
        hospitalCardView = findViewById(R.id.hospitalCardViewId);
        restaurantCardView = findViewById(R.id.restaurantCardViewId);
        airportCardView = findViewById(R.id.airportCardViewId);

        schoolCardView.setOnClickListener(this);
        hospitalCardView.setOnClickListener(this);
        restaurantCardView.setOnClickListener(this);
        airportCardView.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {

        if(v.getId()==R.id.schoolCardViewId)
        {
            startActivity(new Intent(MainActivity.this,SchoolActivity.class));
        }
        else if(v.getId()==R.id.hospitalCardViewId)
        {

        }
        else if(v.getId()==R.id.airportCardViewId)
        {

        }
        else if(v.getId()==R.id.restaurantCardViewId)
        {

        }
    }
}