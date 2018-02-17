package com.production.ruslanio.caloriescalculator.data.local.database.base

import android.arch.persistence.room.Delete
import android.arch.persistence.room.Insert
import android.arch.persistence.room.Transaction
import android.arch.persistence.room.Update
import java.util.Arrays.asList

/**
 * Created by Ruslanio on 31.01.2018.
 */
abstract class BaseDao<T : BaseDataObject> {



    @Insert
    abstract fun insert(entity : T) : Long

    @Insert
    abstract fun insert(vararg entity: T) : List<Long>

    @Update
    abstract fun update(entity: T) : Int

    @Update
    abstract fun update(vararg  entity: T) : Int

    @Delete
    abstract fun delete(entity: T) : Int

    @Delete
    abstract fun delete(vararg entity: T) : Int

}