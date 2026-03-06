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

    public String getMarka() {
        return marka;
    }

    public void setMarka(String marka) {
        this.marka = marka;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getPrzebieg() {
        return przebieg;
    }

    public void setPrzebieg(int przebieg) {
        this.przebieg = przebieg;
    }

    public int getRocznik() {
        return rocznik;
    }

    public void setRocznik(int rocznik) {
        this.rocznik = rocznik;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

}