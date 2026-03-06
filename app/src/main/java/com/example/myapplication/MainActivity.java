package com.example.myapplication;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    SamochodyDataBase baza;
    ListView lista;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        SamochodyDataBase baza = SamochodyDataBase.zwrocInstancjeBazyDanych(this);

        baza.zwrocSamochodyDao().wstawSamochodDoBazy(new Samochody("Toyota", "Yaris", 240000, 2008));
        baza.zwrocSamochodyDao().wstawSamochodDoBazy(new Samochody("Seat", "Cordoba", 147000, 2003));
        baza.zwrocSamochodyDao().wstawSamochodDoBazy(new Samochody("BMW", "E90", 200000, 2010));

        lista = findViewById(R.id.listaSamochodow);

        baza = SamochodyDataBase.zwrocInstancjeBazyDanych(this);

        List<Samochody> samochody = baza.zwrocSamochodyDao().pobierzWszystkieSamochody();

        ArrayList<String> dane = new ArrayList<>();

        for(Samochody s : samochody){
            dane.add(s.getMarka() + " " + s.getModel() + " " + s.getRocznik());
        }

        ArrayAdapter<String> adapter = new ArrayAdapter<>(
                this,
                android.R.layout.simple_list_item_1,
                dane
        );

        lista.setAdapter(adapter);
    }
}