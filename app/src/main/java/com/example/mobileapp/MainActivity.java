package com.example.mobileapp;

import android.os.Bundle;
import android.widget.Button;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    TextView textName;
    TextView textGroup;
    ImageView pic;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);

        textName = findViewById(R.id.name);
        textGroup = findViewById(R.id.group);
        findViewById(R.id.textButton).setOnClickListener((view)->toggleTextVision());

        pic = findViewById(R.id.pic);
        findViewById(R.id.picButton).setOnClickListener((view) -> togglePicVision());
    }


    public void toggleTextVision() {
        if (textName.getVisibility() == View.VISIBLE) {
            textName.setVisibility(View.INVISIBLE);
            textGroup.setVisibility(View.INVISIBLE);
        } else {
            textName.setVisibility(View.VISIBLE);
            textGroup.setVisibility(View.VISIBLE);
        }
    }

    public void togglePicVision() {
        if (pic.getVisibility() == View.VISIBLE) {
            pic.setVisibility(View.INVISIBLE);
        } else {
            pic.setVisibility(View.VISIBLE);
        }
    }


}