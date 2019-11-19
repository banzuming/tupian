package com.example.bzm.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;

import com.bumptech.glide.Glide;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
       ImageView imageView= findViewById(R.id.tu);
        Glide
                .with(this)
                .load("https://i01piccdn.sogoucdn.com/d43fec9e79c6087e")
                .placeholder(R.drawable.ti)
                .error(R.drawable.tv)
                .into(imageView);


    }
}
