package com.remya.customtailor;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MenAlterationActivity extends AppCompatActivity {

    Button menEthnicButton,menFormalButton,boysUniformButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_men_alteration);
        menEthnicButton=findViewById(R.id.menEthnicButton);
        menFormalButton=findViewById(R.id.menFormalButton);
        boysUniformButton=findViewById(R.id.boysUniformAlterationButton);
        menEthnicButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(MenAlterationActivity.this,MeasurementActivity.class));
            }
        });
        menFormalButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(MenAlterationActivity.this,MeasurementActivity.class));
            }
        });
        boysUniformButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(MenAlterationActivity.this,MeasurementActivity.class));
            }
        });
    }
}