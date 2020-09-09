package com.remya.customtailor;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.widget.Button;

public class MenActivity extends AppCompatActivity {

    Button menCustom,menAlteration;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_men);
        menCustom=findViewById(R.id.menCustomButton);
        menAlteration=findViewById(R.id.menAlterationButton);
        menCustom.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(MenActivity.this, MenAlterationActivity.class));
            }
        });
        menAlteration.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(MenActivity.this,MenAlterationActivity.class));
            }
        });
    }
}