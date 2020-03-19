package com.example.chalaka.easyfinder;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Vehicle extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_vehicle);

        Button goBtn = findViewById(R.id.button);

        goBtn.setOnClickListener(new View.OnClickListener() {
                                     @Override
                                     public void onClick(View v) {
                                         Intent intent = new Intent(Vehicle.this, car.class);
                                         startActivity(intent);
                                     }
                                 });
        Button goBtn2 = findViewById(R.id.button8);

        goBtn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Vehicle.this, addVehicle.class);
                startActivity(intent);
            }
        });




    }
}