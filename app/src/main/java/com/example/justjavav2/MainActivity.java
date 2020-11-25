package com.example.justjavav2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.text.NumberFormat;

public class MainActivity extends AppCompatActivity {

    int quantity = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }

    public void submitOrder(View view){
        //int numberOfCoffees = 2;
        //display(numberOfCoffees);
        displayPrice(quantity*2);
    }

    public void display (int number){
        TextView quantityTextView = (TextView)findViewById(R.id.quantity_text_view);
        quantityTextView.setText(""+number);
    }

    public void displayPrice (int number){
        TextView priceTextView = (TextView)findViewById(R.id.price_text_view);
        priceTextView.setText(NumberFormat.getCurrencyInstance().format(number));
    }

    public void increment (View view){
        quantity+=1;
        display(quantity);
    }
    public void decrement (View view){
        if(quantity>0){
            quantity-=1;}
        display(quantity);
    }
}