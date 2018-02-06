package com.production.ruslanio.caloriescalculator.data

import android.arch.lifecycle.LiveData
import android.content.Context
import com.production.ruslanio.caloriescalculator.data.local.database.DBHelper
import com.production.ruslanio.caloriescalculator.data.local.database.model.FoodObject


/**
 * Created by Ruslanio on 05.02.2018.
 */
class DataManager private constructor(context: Context) {

    var dbHelper: DBHelper = DBHelper(context)

    companion object{
        lateinit var instance: DataManager

        fun getInstance(context: Context):DataManager{
            instance = DataManager(context)
            return instance
        }

    }

    fun getAllFoods(): LiveData<List<FoodObject>> {
        return dbHelper.getAllFoods()
    }

}