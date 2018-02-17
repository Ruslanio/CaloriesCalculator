package com.production.ruslanio.caloriescalculator.di.activitymodules

import dagger.Module
import dagger.Provides

/**
 * Created by Ruslanio on 16.02.2018.
 */
@Module
class MainActivityModule {

    @Provides
    fun provideTest(): String{
        return "WORKING!!!!!!"
    }
}