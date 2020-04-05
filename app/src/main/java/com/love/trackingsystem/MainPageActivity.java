package com.love.trackingsystem;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainPageActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_page);
    }


    public void coronaupdates(View view) {
        Intent  intent = new Intent(MainPageActivity.this,MainActivity.class);
        startActivity(intent);

    }




    public void countriesaffected(View view) {
        Intent  intent = new Intent(MainPageActivity.this,CountryActivity.class);
        startActivity(intent);
    }

    public void videoPlay(View view) {
        Intent  intent = new Intent(MainPageActivity.this,VideoActivity.class);
        startActivity(intent);
    }


    public void information(View view) {
        Intent  intent = new Intent(MainPageActivity.this,ImageActivity.class);
        startActivity(intent);
    }
}
