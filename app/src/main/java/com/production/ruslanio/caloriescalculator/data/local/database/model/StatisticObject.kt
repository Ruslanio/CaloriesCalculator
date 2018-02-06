package com.production.ruslanio.caloriescalculator.data.local.database.model

import android.arch.persistence.room.Entity
import com.production.ruslanio.caloriescalculator.data.local.database.base.BaseDataObject

/**
 * Created by Ruslanio on 31.01.2018.
 */
@Entity(tableName = "table_statistic")
class StatisticObject : BaseDataObject() {

    var dailyKkal : Double = 0.0

    var dailyProtein : Double = 0.0

    var dailyFat : Double = 0.0

    var dailyCarbohydrates : Double = 0.0

    var currentWeight : Double = 0.0

    var targetWeight : Double = 0.0

}