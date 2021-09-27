package com.example.appl2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.ToggleButton;

public class RemoteActivity extends AppCompatActivity {
    ToggleButton toggleButton;
    ImageView imageView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_remote);

        toggleButton = findViewById(R.id.toogle);
        imageView = findViewById(R.id.imageView);

        imageView.setImageDrawable(getResources().getDrawable(R.drawable.light_off));
        toggleButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (toggleButton.isChecked()){
                    imageView.setImageDrawable(getResources().getDrawable(R.drawable.light_on));
                }else {
                    imageView.setImageDrawable(getResources().getDrawable(R.drawable.light_off));
                }
            }
        });
    }
}
