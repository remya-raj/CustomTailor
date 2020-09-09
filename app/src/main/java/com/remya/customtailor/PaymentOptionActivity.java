package com.remya.customtailor;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class PaymentOptionActivity extends AppCompatActivity {

    Button cashOnDeliveryButton,debitCardButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_payment_option);
        cashOnDeliveryButton=findViewById(R.id.CashOnDeliveryButton);
        debitCardButton=findViewById(R.id.DebitCardButton);
        cashOnDeliveryButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(PaymentOptionActivity.this,ThankYouActivity.class));
            }
        });
        debitCardButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(PaymentOptionActivity.this,DebitCardActivity.class));
            }
        });
    }
}