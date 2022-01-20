package com.cesartejero.layoutycontroles;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity3 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.grid_gradient);

        Button miBoton = findViewById(R.id.btnAnimaciones);
        Intent animaciones = new Intent(this, MainActivity4.class);

        miBoton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(animaciones);
            }
        });
    }
}