package com.remya.customtailor;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class WomenAlterationActivity extends AppCompatActivity {

    Button womenEthnicButton,womenFormalButton,girlsUniformButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_women_alteration);
        womenEthnicButton=findViewById(R.id.womenEthnicButton);
        womenFormalButton=findViewById(R.id.womenFormalButton);
        girlsUniformButton=findViewById(R.id.girlsUniformButton);
        womenEthnicButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(WomenAlterationActivity.this,MeasurementActivity.class));
            }
        });
        womenFormalButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(WomenAlterationActivity.this,MeasurementActivity.class));
            }
        });
        girlsUniformButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(WomenAlterationActivity.this,MeasurementActivity.class));
            }
        });
    }
}