package com.londonappbrewery.magiceightball;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final int[] magicImagesArray = {R.drawable.ball1,
                R.drawable.ball2,
                R.drawable.ball3,
                R.drawable.ball4,
                R.drawable.ball5};

        final ImageView eightBall = (ImageView) findViewById(R.id.imageView_eightBall);
        Button ask = (Button) findViewById(R.id.button_ask);
        ask.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Random randomImageGetter = new Random();
                int response = randomImageGetter.nextInt(4);
                eightBall.setImageResource(magicImagesArray[response]);
            }
        });
    }
}
