package com.production.ruslanio.caloriescalculator.data.local.database.model

import android.arch.persistence.room.Entity
import com.production.ruslanio.caloriescalculator.data.local.database.base.BaseDataObject

/**
 * Created by Ruslanio on 31.01.2018.
 */
@Entity(tableName = "table_food")
class FoodObject : BaseDataObject() {

    var kkal: Double = 0.0

    var protein: Double = 0.0

    var carbohydrates: Double = 0.0

    var fats: Double = 0.0

}