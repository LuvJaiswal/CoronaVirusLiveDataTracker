package com.love.trackingsystem;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class MainPageActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_page);


        checkConnection();
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

    public void checkConnection(){
        ConnectivityManager manager = (ConnectivityManager)getApplicationContext().getSystemService(Context.CONNECTIVITY_SERVICE);
        NetworkInfo activeNetwork = manager.getActiveNetworkInfo();
        if (null!=activeNetwork){

            if(activeNetwork.getType() == ConnectivityManager.TYPE_WIFI){
                Toast.makeText(this, "Wifi Enabled", Toast.LENGTH_SHORT).show();
            }
            if(activeNetwork.getType() == ConnectivityManager.TYPE_MOBILE){
                Toast.makeText(this, "Data Network Enabled", Toast.LENGTH_SHORT).show();
            }
        }
        else {
            Toast.makeText(this, "No internet Connection", Toast.LENGTH_SHORT).show();
        }
    }
}
