package com.production.ruslanio.caloriescalculator.data.local.database.dao

import android.arch.persistence.room.Dao
import com.production.ruslanio.caloriescalculator.data.local.database.base.BaseDao
import com.production.ruslanio.caloriescalculator.data.local.database.model.StatisticObject

/**
 * Created by Ruslanio on 31.01.2018.
 */
@Dao
abstract class StatisticDao : BaseDao<StatisticObject>() {
}