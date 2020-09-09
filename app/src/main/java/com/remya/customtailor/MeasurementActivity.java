package com.remya.customtailor;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MeasurementActivity extends AppCompatActivity {

    Button buttonGiveMySize,buttonMeasureMe,buttonGetMyTailor;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_measurement);
        buttonGiveMySize=findViewById(R.id.buttonGiveMySize);
        buttonMeasureMe=findViewById(R.id.buttonMeasureMe);
        buttonGetMyTailor=findViewById(R.id.buttonGetMyTailor);
        buttonGiveMySize.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(MeasurementActivity.this,GiveMySizeEntryActivity.class));
            }
        });
        buttonMeasureMe.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(MeasurementActivity.this,MeasureMeActivity.class));
            }
        });
        buttonGetMyTailor.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(MeasurementActivity.this,GetMyTailorActivity.class));
            }
        });
    }
}