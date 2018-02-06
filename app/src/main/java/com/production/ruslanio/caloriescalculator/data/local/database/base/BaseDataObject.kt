package com.production.ruslanio.caloriescalculator.data.local.database.base

import android.arch.persistence.room.PrimaryKey

/**
 * Created by Ruslanio on 31.01.2018.
 */
abstract class BaseDataObject {

    @PrimaryKey(autoGenerate = true)
    var id: Int = 0
}