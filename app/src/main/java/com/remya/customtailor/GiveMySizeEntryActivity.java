package com.remya.customtailor;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class GiveMySizeEntryActivity extends AppCompatActivity {

    Button chooseSize,giveSpecificMeasurement;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_give_my_size_entry);
        chooseSize=findViewById(R.id.buttonChooseSize);
        giveSpecificMeasurement=findViewById(R.id.buttonGiveSpecificMeasurement);
        chooseSize.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(GiveMySizeEntryActivity.this,GiveMySizeActivity.class));
            }
        });
        giveSpecificMeasurement.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(GiveMySizeEntryActivity.this,GiveSpecificMeasurementActivity.class));
            }
        });
    }
}