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

import java.util.ArrayList;
import java.util.List;

import butterknife.Bind;
import butterknife.ButterKnife;

public class ServicesActivity extends AppCompatActivity  {
    @Bind(R.id.ourServices) EditText mOurServices;
    @Bind(R.id.servicesListView) ListView mServicesListView;
    private String[] services = new String[] {"Tune Up", "Tire Repair", "Frame Repair", "Paint", "Chain Replacement", "Gear Integration", "Inspection"};


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_services);

            ButterKnife.bind(this);

            Typeface blazedFont = Typeface.createFromAsset(getAssets(), "fonts/Blazed.ttf");
            mOurServices.setTypeface(blazedFont);


            ArrayAdapter showServicesList = new ArrayAdapter(this, android.R.layout.simple_expandable_list_item_1, services);
            mServicesListView.setAdapter(showServicesList);

            mServicesListView.setOnItemClickListener(new AdapterView.OnItemClickListener() {

                @Override
                public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                    String service = ((TextView)view).getText().toString();
                    Toast.makeText(ServicesActivity.this, service, Toast.LENGTH_LONG).show();
                }
            });


    }

}
