package com.remya.customtailor;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class WomenActivity extends AppCompatActivity {

    Button womenCustom,womenAlteration;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_women);
        womenCustom=findViewById(R.id.womenCustomButton);
        womenAlteration=findViewById(R.id.womenAlterationButton);
        womenCustom.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(WomenActivity.this,WomenAlterationActivity.class));
            }
        });
        womenAlteration.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(WomenActivity.this,WomenAlterationActivity.class));
            }
        });
    }
}