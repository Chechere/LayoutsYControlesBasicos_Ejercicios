package com.cesartejero.layoutycontroles;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.view.animation.LayoutAnimationController;
import android.widget.Button;
import android.widget.CompoundButton;
import android.widget.LinearLayout;
import android.widget.RadioButton;
import android.widget.RadioGroup;

public class MainActivity extends AppCompatActivity implements CompoundButton.OnCheckedChangeListener {
    RadioGroup PCGroup;
    RadioGroup PhoneGroup;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        PCGroup = findViewById(R.id.OSPCGroup);
        RadioButton WindowsButton = findViewById(R.id.WindowsButton);
        RadioButton UbuntuButton = findViewById(R.id.UbuntuButton);

        PhoneGroup = findViewById(R.id.OSPhoneGroup);
        RadioButton androidButton = findViewById(R.id.AndroidButton);
        RadioButton appleButton = findViewById(R.id.AppleButton);
        RadioButton symbiamButton = findViewById(R.id.SymbiamButton);

        WindowsButton.setOnCheckedChangeListener(this);
        UbuntuButton.setOnCheckedChangeListener(this);

        androidButton.setOnCheckedChangeListener(this);
        appleButton.setOnCheckedChangeListener(this);
        symbiamButton.setOnCheckedChangeListener(this);

        PCGroup.clearCheck();
        PhoneGroup.clearCheck();

        PCGroup.check(WindowsButton.getId());
        PhoneGroup.check(androidButton.getId());

        Button miBoton = findViewById(R.id.btnRateBars);
        Intent ratebars = new Intent(this, MainActivity2.class);
        miBoton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(ratebars);
            }
        });
    }

    @Override
    public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
        if (compoundButton.getParent() == PCGroup) {
            if (b) {
                compoundButton.setBackgroundColor(getResources().getColor(R.color.CheckedPC));
            } else {
                compoundButton.setBackgroundColor(getResources().getColor(R.color.UnCheckedPC));
            }
        } else if (compoundButton.getParent() == PhoneGroup) {
            if (b) {
                compoundButton.setBackgroundColor(getResources().getColor(R.color.CheckedPhone));
                compoundButton.setTextColor(Color.WHITE);
            } else {
                compoundButton.setBackground(getResources().getDrawable(R.drawable.phone_border));
                compoundButton.setTextColor(getResources().getColor(R.color.CheckedPhone));
            }
        }
    }
}