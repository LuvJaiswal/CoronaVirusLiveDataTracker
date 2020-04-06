package com.love.trackingsystem;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Bundle;
import android.widget.Toast;

public class CountryActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_country);
//        BottomNavigationView navView = findViewById(R.id.nav_view);
//
//        navView.setItemIconTintList(null);
//
//        NavController navController = Navigation.findNavController(this, R.id.nav_host_fragment);
//
//
//        NavigationUI.setupWithNavController(navView, navController);

        checkConnection();
    }

    public void checkConnection(){
        ConnectivityManager manager = (ConnectivityManager)getApplicationContext().getSystemService(Context.CONNECTIVITY_SERVICE);
        NetworkInfo activeNetwork = manager.getActiveNetworkInfo();
        if (null==activeNetwork){
            Toast.makeText(this, "No internet Connection", Toast.LENGTH_SHORT).show();
        }

    }


}
