package com.example.appl1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ViewFlipper;

import java.lang.annotation.AnnotationTypeMismatchException;

public class MainActivity extends AppCompatActivity {
    ViewFlipper viewFlipper, textFlipper;
    Animation fadeIn, fadeOut;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        viewFlipper = (ViewFlipper)findViewById(R.id.viewFlipper);
        textFlipper = (ViewFlipper)findViewById(R.id.viewFlipper_text);

        fadeIn = AnimationUtils.loadAnimation(this, R.anim.fade_in);
        fadeOut = AnimationUtils.loadAnimation(this, R.anim.fade_out);
        viewFlipper.setAutoStart(true);
        viewFlipper.setFlipInterval(3000);
        viewFlipper.startFlipping();
        textFlipper.setAutoStart(true);
        textFlipper.setFlipInterval(3000);
        textFlipper.startFlipping();
    }
}
