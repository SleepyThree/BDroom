package com.example.myapplication;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    SamochodyDataBase przepisyDataBase;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        przepisyDataBase = SamochodyDataBase.zwrocInstancjeBazyDanych(MainActivity.this);

        przepisyDataBase.zwrocSamochodyDao().wstawSamochodDoBazy(
                new Samochody("Toyota", "Yaris", 240000, 2008)
        );

        przepisyDataBase.zwrocSamochodyDao().wstawSamochodDoBazy(
                new Samochody("Seat", "Cordoba", 147000, 2003)
        );

        przepisyDataBase.zwrocSamochodyDao().wstawSamochodDoBazy(
                new Samochody("BMW", "E90", 200000, 2010)
        );
    }
}