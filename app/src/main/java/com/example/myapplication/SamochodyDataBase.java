package com.example.myapplication;

import android.content.Context;

import androidx.room.Database;
import androidx.room.Room;
import androidx.room.RoomDatabase;

@Database(entities = {Samochody.class}, version = 2)
public abstract class SamochodyDataBase extends RoomDatabase {
    public abstract SamochodyDao zwrocSamochodyDao();
    private static SamochodyDataBase instancja;
    public static SamochodyDataBase zwrocInstancjeBazyDanych(Context context){
        if (instancja == null){
            instancja = Room.databaseBuilder(
                            context,
                            SamochodyDataBase.class,
                            "Samochody_db"
                    )
                    .allowMainThreadQueries()
                    .fallbackToDestructiveMigration()
                    .build();
        }

        return instancja;
    }


}

