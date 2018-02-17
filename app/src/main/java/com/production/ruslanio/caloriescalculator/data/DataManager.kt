package com.production.ruslanio.caloriescalculator.data

import android.arch.lifecycle.LiveData
import android.content.Context
import com.production.ruslanio.caloriescalculator.data.local.database.DBHelper
import com.production.ruslanio.caloriescalculator.data.local.database.model.FoodObject
import com.production.ruslanio.caloriescalculator.data.local.database.model.StatisticObject
import javax.inject.Inject


/**
 * Created by Ruslanio on 05.02.2018.
 */
class DataManager  @Inject constructor( var dbHelper: DBHelper) {


    fun getAllFoods(): LiveData<List<FoodObject>> {
        return dbHelper.getAllFoods()
    }

    fun updateStatistic(statisticObject: StatisticObject){
        dbHelper.updateStatistic(statisticObject)
    }

}