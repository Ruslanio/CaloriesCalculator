package com.production.ruslanio.caloriescalculator.di

import android.app.Application
import com.production.ruslanio.caloriescalculator.CCApp
import com.production.ruslanio.caloriescalculator.di.appmodules.ActivityBuilder
import com.production.ruslanio.caloriescalculator.di.appmodules.AppModule
import com.production.ruslanio.caloriescalculator.di.appmodules.ContextModule
import dagger.BindsInstance
import dagger.Component
import dagger.android.AndroidInjectionModule

/**
 * Created by Ruslanio on 16.02.2018.
 */
@Component(modules = arrayOf(AppModule::class, ActivityBuilder::class, AndroidInjectionModule::class))
interface AppComponent {

    @Component.Builder
    interface Builder {
        @BindsInstance
        fun application(app: Application): Builder

        fun build(): AppComponent
    }

    fun inject(app: CCApp)
}