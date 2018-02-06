package com.production.ruslanio.caloriescalculator.data.local.database

import android.arch.lifecycle.LiveData
import android.content.Context
import com.production.ruslanio.caloriescalculator.data.local.database.base.MainDatabase
import com.production.ruslanio.caloriescalculator.data.local.database.model.FoodObject
import javax.inject.Inject

/**
 * Created by Ruslanio on 06.02.2018.
 */
class DBHelper {
    lateinit var mainDatabase : MainDatabase

    constructor(context : Context){
        mainDatabase = MainDatabase.getInstance(context)
    }

    fun getAllFoods(): LiveData<List<FoodObject>>{
        return mainDatabase.foodDao().selectAll()
    }

}