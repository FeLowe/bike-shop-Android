package com.epicodus.bikeshop;

import android.graphics.Typeface;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import butterknife.Bind;
import butterknife.ButterKnife;

public class RentalsActivity extends AppCompatActivity {
    @Bind(R.id.rentalsAvailable) EditText mRentalsAvailable;
    @Bind(R.id.rentalsListView) ListView mRentalsListView;
    private String[] rentals = new String[] {"Tune Up", "Tire Repair", "Frame Repair", "Paint", "Chain Replacement", "Gear Integration","Inspection"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_rentals);

        ButterKnife.bind(this);

        Typeface blazedFont = Typeface.createFromAsset(getAssets(), "fonts/Blazed.ttf");
        mRentalsAvailable.setTypeface(blazedFont);

        ArrayAdapter showRentalList = new ArrayAdapter(this, android.R.layout.simple_expandable_list_item_1, rentals);
        mRentalsListView.setAdapter(showRentalList);

        mRentalsListView.setOnItemClickListener(new AdapterView.OnItemClickListener() {

            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                String rental = ((TextView)view).getText().toString();
                Toast.makeText(RentalsActivity.this, rental, Toast.LENGTH_LONG).show();
            }
        });



    }
}
