package com.example.myapplication;

import androidx.room.Dao;
import androidx.room.Delete;
import androidx.room.Insert;
import androidx.room.Query;
import androidx.room.Update;

import java.util.List;

@Dao
public interface SamochodyDao {
    @Insert
    public void wstawSamochodDoBazy(Samochody samochody);
    @Insert
    public void wstawKilkaSamochodow(Samochody ...samochodies);

    @Delete
    public void usunZBazy(Samochody samochody);

    @Update
    public void zaktualizuj(Samochody samochody);

    @Query("Select * from samochody_tabela")
    List<Samochody> zwrocWszystkieSamochodyZBazy();

}

