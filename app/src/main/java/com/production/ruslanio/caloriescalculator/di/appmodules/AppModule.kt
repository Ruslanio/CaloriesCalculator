package com.production.ruslanio.caloriescalculator.di.appmodules

import com.production.ruslanio.caloriescalculator.data.DataManager
import com.production.ruslanio.caloriescalculator.data.local.database.DBHelper
import dagger.Module
import dagger.Provides
import javax.inject.Singleton

/**
 * Created by Ruslanio on 16.02.2018.
 */
@Module(includes = arrayOf(DataModule::class))
class AppModule {

    @Provides
    @Singleton
    fun provideDataManager(dbHelper: DBHelper) :DataManager{
        return DataManager(dbHelper)
    }
}