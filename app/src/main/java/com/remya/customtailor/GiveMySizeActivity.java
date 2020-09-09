package com.remya.customtailor;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class GiveMySizeActivity extends AppCompatActivity {

    Button buttonS,buttonM,buttonL,buttonXL,buttonXXL;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_give_my_size);
        buttonS=findViewById(R.id.buttonS);
        buttonM=findViewById(R.id.buttonM);
        buttonL=findViewById(R.id.buttonL);
        buttonXL=findViewById(R.id.buttonXL);
        buttonXXL=findViewById(R.id.buttonXXL);
        buttonS.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(GiveMySizeActivity.this,AddressActivity.class));
            }
        });
        buttonM.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(GiveMySizeActivity.this,AddressActivity.class));
            }
        });
        buttonL.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(GiveMySizeActivity.this,AddressActivity.class));
            }
        });
        buttonXL.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(GiveMySizeActivity.this,AddressActivity.class));
            }
        });
        buttonXXL.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(GiveMySizeActivity.this,AddressActivity.class));
            }
        });
    }
}