package com.epicodus.bikeshop;

import android.graphics.Typeface;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import butterknife.Bind;
import butterknife.ButterKnife;

public class MainActivity extends AppCompatActivity {
    @Bind(R.id.bikeShopView) TextView mBikeShopView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ButterKnife.bind(this);

        Typeface blazedFont = Typeface.createFromAsset(getAssets(), "fonts/Blazed.ttf");
        mBikeShopView.setTypeface(blazedFont);

    }

}
