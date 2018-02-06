package com.production.ruslanio.caloriescalculator.di

import com.production.ruslanio.caloriescalculator.MainActivity
import com.production.ruslanio.caloriescalculator.data.local.database.base.MainDatabase
import com.production.ruslanio.caloriescalculator.di.modules.ContextModule
import com.production.ruslanio.caloriescalculator.di.modules.DataModule
import dagger.Component

/**
 * Created by Ruslanio on 05.02.2018.
 */
@Component(modules = arrayOf(ContextModule::class, DataModule::class))
interface MainComponent {

    fun inject(mainActivity: MainActivity)
}