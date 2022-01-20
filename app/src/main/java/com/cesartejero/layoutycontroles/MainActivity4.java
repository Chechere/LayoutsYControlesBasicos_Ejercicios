package com.cesartejero.layoutycontroles;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.view.animation.LayoutAnimationController;
import android.widget.Button;
import android.widget.LinearLayout;

public class MainActivity4 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.animaciones);

        Animation anim = AnimationUtils.loadAnimation(this, R.anim.animacion_rotacion);
        LayoutAnimationController lac = new LayoutAnimationController(anim, 1);

        LinearLayout master = findViewById(R.id.linear);
        master.setLayoutAnimation(lac);

        Button boton1 = findViewById(R.id.button1);
        Button boton2 = findViewById(R.id.button2);
        Button boton3 = findViewById(R.id.button3);
        Button boton4 = findViewById(R.id.button4);

        boton1.startAnimation(anim);
        boton2.startAnimation(anim);
        boton3.startAnimation(anim);
        boton4.startAnimation(anim);
    }
}