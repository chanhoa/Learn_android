package com.example.animationimageview;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    boolean bartIsShowing = true;

    public void fade(View view) {
        Log.i("Info", "Imageview tapped");
        ImageView bartImageView = findViewById(R.id.bartImageView);
        ImageView animeImageView = findViewById(R.id.animeImageView);
        if (bartIsShowing) {
            bartIsShowing = false;
            bartImageView.animate().alpha(0).setDuration(2000);
            animeImageView.animate().alpha(1).setDuration(2000);
        } else {
            bartIsShowing = true;
            bartImageView.animate().alpha(1).setDuration(2000);
            animeImageView.animate().alpha(0).setDuration(2000);
        }
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}