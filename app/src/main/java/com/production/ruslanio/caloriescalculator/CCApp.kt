package com.production.ruslanio.caloriescalculator

import android.app.Activity
import android.app.Application
import com.production.ruslanio.caloriescalculator.di.AppComponent
import com.production.ruslanio.caloriescalculator.di.DaggerAppComponent
import com.production.ruslanio.caloriescalculator.di.appmodules.ContextModule
import dagger.android.AndroidInjector
import dagger.android.DispatchingAndroidInjector
import dagger.android.HasActivityInjector
import javax.inject.Inject

/**
 * Created by Ruslanio on 06.02.2018.
 */
class CCApp : Application() , HasActivityInjector {

    @Inject lateinit var activityDispatchingAndroidInjector:
            DispatchingAndroidInjector<Activity>

    override fun activityInjector(): AndroidInjector<Activity> = activityDispatchingAndroidInjector

    override fun onCreate() {
        super.onCreate()

        DaggerAppComponent
                .builder()
                .application(this)
                .build()
                .inject(this)

    }

}