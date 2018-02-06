package com.production.ruslanio.caloriescalculator.di.modules

import android.arch.persistence.room.Room
import android.content.Context
import com.production.ruslanio.caloriescalculator.data.local.database.base.MainDatabase
import dagger.Module
import dagger.Provides

/**
 * Created by Ruslanio on 05.02.2018.
 */
@Module(includes = arrayOf(ContextModule::class))
class DataModule {

    @Provides
    fun mainDatabase(context: Context) : MainDatabase{
        return Room.databaseBuilder(context, MainDatabase::class.java, MainDatabase.DB_NAME)
                .allowMainThreadQueries() //TODO remove
                .build()
    }
}