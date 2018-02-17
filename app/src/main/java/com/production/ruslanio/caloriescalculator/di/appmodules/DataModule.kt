package com.production.ruslanio.caloriescalculator.di.appmodules

import android.arch.persistence.room.Room
import android.content.Context
import com.production.ruslanio.caloriescalculator.data.local.database.DBHelper
import com.production.ruslanio.caloriescalculator.data.local.database.base.MainDatabase
import dagger.Module
import dagger.Provides
import javax.inject.Singleton

/**
 * Created by Ruslanio on 17.02.2018.
 */
@Singleton
@Module(includes = arrayOf(ContextModule::class))
class DataModule {

    @Singleton
    @Provides
    fun provideDBHelper(context: Context): DBHelper {
        val mainDatabase = Room.databaseBuilder(context, MainDatabase::class.java, MainDatabase.DB_NAME)
                .allowMainThreadQueries() //TODO remove
                .build()
        return DBHelper(mainDatabase)
    }

}