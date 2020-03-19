package com.example.chalaka.easyfinder;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class viewVehicle extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_view_vehicle);

        Button goBtn4 = findViewById(R.id.button10);

        goBtn4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(viewVehicle.this, editVehicle.class);
                startActivity(intent);
            }
        });

        Button goBtn5 = findViewById(R.id.button6);

        goBtn5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(viewVehicle.this, Vehicle.class);
                startActivity(intent);
            }
        });
    }
}
