package com.production.ruslanio.caloriescalculator.data.local.database.base

import android.arch.persistence.room.Database
import android.arch.persistence.room.Room
import android.arch.persistence.room.RoomDatabase
import android.content.Context
import com.production.ruslanio.caloriescalculator.data.local.database.dao.FoodDao
import com.production.ruslanio.caloriescalculator.data.local.database.dao.StatisticDao
import com.production.ruslanio.caloriescalculator.data.local.database.model.FoodObject
import com.production.ruslanio.caloriescalculator.data.local.database.model.StatisticObject

/**
 * Created by Ruslanio on 31.01.2018.
 */
@Database(entities = arrayOf(FoodObject::class, StatisticObject::class), version = 1)
abstract class MainDatabase : RoomDatabase() {

    companion object {
        const val DB_NAME = "calc_database";

        fun getInstance(context: Context) = Room.databaseBuilder(context, MainDatabase::class.java, MainDatabase.DB_NAME)
                .allowMainThreadQueries() //TODO remove
                .build()
    }

    abstract fun foodDao(): FoodDao

    abstract fun statisticDao(): StatisticDao
}