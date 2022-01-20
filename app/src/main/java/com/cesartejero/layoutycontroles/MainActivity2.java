package com.cesartejero.layoutycontroles;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RatingBar;
import android.widget.TextView;

public class MainActivity2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.ratebars);
        RatingBar corazones = findViewById(R.id.HeartRating);
        TextView corazonesTexto = findViewById(R.id.HeartText);
        RatingBar balones = findViewById(R.id.BaloonRating);
        TextView balonesTexto = findViewById(R.id.BaloonText);

        corazonesTexto.setText(String.valueOf(corazones.getRating()));
        balonesTexto.setText(String.valueOf(balones.getRating()));

        corazones.setOnRatingBarChangeListener(new RatingBar.OnRatingBarChangeListener() {
            @Override
            public void onRatingChanged(RatingBar ratingBar, float v, boolean b) {
                corazonesTexto.setText(String.valueOf(v));
            }
        });

        balones.setOnRatingBarChangeListener(new RatingBar.OnRatingBarChangeListener() {
            @Override
            public void onRatingChanged(RatingBar ratingBar, float v, boolean b) {
                balonesTexto.setText(String.valueOf(v));
            }
        });

        Button miBoton = findViewById(R.id.btndegradado);
        Intent degradado = new Intent(this, MainActivity3.class);

        miBoton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(degradado);
            }
        });
    }
}