package com.production.ruslanio.caloriescalculator.data.local.database.dao

import android.arch.lifecycle.LiveData
import android.arch.persistence.room.Dao
import android.arch.persistence.room.Query
import com.production.ruslanio.caloriescalculator.data.local.database.base.BaseDao
import com.production.ruslanio.caloriescalculator.data.local.database.model.FoodObject

/**
 * Created by Ruslanio on 31.01.2018.
 */
@Dao
abstract class FoodDao : BaseDao<FoodObject>() {

    @Query("SELECT * FROM table_food")
    abstract fun selectAll():LiveData<List<FoodObject>>
}