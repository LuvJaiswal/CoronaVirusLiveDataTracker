package com.example.covid_19trackingsystem;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;

import static java.lang.Thread.sleep;

public class SplashActivity extends AppCompatActivity {

    ImageView splashImage;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);

        splashImage = (ImageView) findViewById(R.id.ImageSplash);

        Animation myanim = AnimationUtils.loadAnimation(this,R.anim.myanimation);
        splashImage.startAnimation(myanim);

        Thread myThread = new Thread(new Runnable() {
            @Override
            public void run() {

                try {
                    sleep(1000);
                    Intent i = new Intent(SplashActivity.this,MainPageActivity.class);
                    startActivity(i);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        });

        myThread.start();

    }
}
