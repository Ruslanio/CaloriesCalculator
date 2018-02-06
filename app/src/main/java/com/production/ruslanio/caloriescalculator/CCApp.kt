package com.production.ruslanio.caloriescalculator

import android.app.Application
import com.production.ruslanio.caloriescalculator.di.MainComponent
import com.production.ruslanio.caloriescalculator.di.modules.ContextModule

/**
 * Created by Ruslanio on 06.02.2018.
 */
class CCApp : Application() {

    lateinit var mainComponent : MainComponent

    override fun onCreate() {
        super.onCreate()
//        mainComponent = DaggerMainComponent
//                .builder()
//                .appModule(ContextModule(this))
//                .build()

    }

}