package com.production.ruslanio.caloriescalculator.di.appmodules

import com.production.ruslanio.caloriescalculator.di.activitymodules.MainActivityModule
import com.production.ruslanio.caloriescalculator.di.activitymodules.UserFormActivityModule
import com.production.ruslanio.caloriescalculator.views.MainActivity
import com.production.ruslanio.caloriescalculator.views.UserFormActivity
import dagger.Module
import dagger.android.ContributesAndroidInjector

/**
 * Created by Ruslanio on 16.02.2018.
 */
@Module
abstract class ActivityBuilder {
    @ContributesAndroidInjector(modules = arrayOf(MainActivityModule::class))
    abstract fun bindMainActivity(): MainActivity

    @ContributesAndroidInjector(modules = arrayOf(UserFormActivityModule::class))
    abstract fun bindUserFormActivity(): UserFormActivity
}