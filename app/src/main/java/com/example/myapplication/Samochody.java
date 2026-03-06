package com.example.myapplication;

import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.PrimaryKey;

@Entity (tableName = "samochody_tabela")
public class Samochody {
    @PrimaryKey (autoGenerate = true)
    private int id;
    private String marka;
    private String model;

    @ColumnInfo (name = "przebieg")
    private int przebieg;
    @ColumnInfo (name = "rocznik")
    private int rocznik;

    public Samochody(String marka, String model, int przebieg, int rocznik) {
        id = 0;
        this.marka = marka;
        this.model = model;
        this.przebieg = przebieg;
        this.rocznik = rocznik;
    }

    public String getmarka() {
        return marka;
    }

    public void setmarka(String marka) {
        this.marka = marka;
    }

    public String getmodel() {
        return model;
    }

    public void setmodel(String model) {
        this.model = model;
    }

    public int getprzebieg() {
        return przebieg;
    }

    public void setprzebieg(int przebieg) {
        this.przebieg = przebieg;
    }

    public int getrocznik() {
        return rocznik;
    }

    public void setrocznik(int rocznik) {
        this.rocznik = rocznik;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

}