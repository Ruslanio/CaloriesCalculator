package com.production.ruslanio.caloriescalculator.di.modules

import android.content.Context
import dagger.Module
import dagger.Provides

/**
 * Created by Ruslanio on 05.02.2018.
 */
@Module
class ContextModule constructor(var context: Context) {

    @Provides
    fun context() : Context{
        return context.applicationContext
    }
}