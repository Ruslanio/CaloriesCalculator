package com.production.ruslanio.caloriescalculator.data.local.database

import android.arch.lifecycle.LiveData
import android.content.Context
import com.production.ruslanio.caloriescalculator.data.local.database.base.MainDatabase
import com.production.ruslanio.caloriescalculator.data.local.database.model.FoodObject
import com.production.ruslanio.caloriescalculator.data.local.database.model.StatisticObject
import javax.inject.Inject

/**
 * Created by Ruslanio on 06.02.2018.
 */
class DBHelper(private var mainDatabase: MainDatabase) {


    fun getAllFoods(): LiveData<List<FoodObject>>{
        return mainDatabase.foodDao().selectAll()
    }

    fun updateStatistic(statisticObject: StatisticObject){
        mainDatabase.statisticDao().cleanAndInsert(statisticObject)
    }
}