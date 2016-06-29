package com.epicodus.bikeshop;

import android.content.Intent;
import android.graphics.Typeface;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import butterknife.Bind;
import butterknife.ButterKnife;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{
    @Bind(R.id.bikeShopView) TextView mBikeShopView;
    @Bind(R.id.servicesButton) Button mServicesButton;
    @Bind(R.id.rentalsButton) Button mRentalsButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ButterKnife.bind(this);

        Typeface blazedFont = Typeface.createFromAsset(getAssets(), "fonts/Blazed.ttf");
        mBikeShopView.setTypeface(blazedFont);

        mRentalsButton.setOnClickListener(this);
        mServicesButton.setOnClickListener(this);
    }
    @Override
    public void onClick(View v) {
        if(v == mServicesButton) {
            Intent goToServicesPage = new Intent(MainActivity.this, ServicesActivity.class);
            startActivity(goToServicesPage);
        }
        if(v == mRentalsButton) {
            Intent goToRentalsPage = new Intent(MainActivity.this, RentalsActivity.class);
            startActivity(goToRentalsPage);
        }


    }

}

