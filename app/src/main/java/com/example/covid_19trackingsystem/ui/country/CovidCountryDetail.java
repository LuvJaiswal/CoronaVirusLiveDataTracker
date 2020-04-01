package com.example.covid_19trackingsystem.ui.country;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

import com.example.covid_19trackingsystem.R;

public class CovidCountryDetail extends AppCompatActivity {

    TextView tvDetailCountryName, tvDetailTotalCase,tvDetailTodayCases, tvDetailTotalDeaths,
             tvDetailTodayDeaths,tvDetailTotalRecovered, tvDetailTotalActive, tvDetailTotalCritical;





    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_covid_country);

    //call View

        tvDetailCountryName = findViewById(R.id.tvDetailCountryName);
        tvDetailTotalCase = findViewById(R.id.tvDetailTotalCases);
        tvDetailTodayCases = findViewById(R.id.tvDetailTodayCases);
        tvDetailTotalDeaths = findViewById(R.id.tvDetailTotalDeaths);
        tvDetailTodayDeaths = findViewById(R.id.tvDetailTodayDeaths);
        tvDetailTotalRecovered = findViewById(R.id.tvDetailTotalRecovered);
        tvDetailTotalActive = findViewById(R.id.tvDetailTotalActive);
        tvDetailTotalCritical = findViewById(R.id.tvDetailTotalCritical);


        //call Covid Country

        CovidCountry covidCountry = getIntent().getParcelableExtra("EXTRA COVID");


        //SET TEXT VIEW
        tvDetailCountryName.setText(covidCountry.getmCovidCountry());
        tvDetailTotalCase.setText(covidCountry.getmCases());
        tvDetailTodayCases.setText(covidCountry.getmTodayCases());
        tvDetailTotalDeaths.setText(covidCountry.getmDeaths());
        tvDetailTodayDeaths.setText(covidCountry.getmTodayDeaths());
        tvDetailTotalRecovered.setText(covidCountry.getmRecovered());
        tvDetailTotalActive.setText(covidCountry.getmActive());
        tvDetailTotalCritical.setText(covidCountry.getmCritical());



    }
}
