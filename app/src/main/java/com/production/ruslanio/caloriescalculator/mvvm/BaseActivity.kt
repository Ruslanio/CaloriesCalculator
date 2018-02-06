package com.production.ruslanio.caloriescalculator.mvvm

import android.arch.lifecycle.Lifecycle
import android.arch.lifecycle.LifecycleRegistry
import android.arch.lifecycle.ViewModelProvider
import android.arch.lifecycle.ViewModelProviders
import android.os.Bundle
import android.os.PersistableBundle
import android.support.v7.app.AppCompatActivity
import butterknife.ButterKnife

/**
 * Created by Ruslanio on 28.01.2018.
 */
abstract class BaseActivity<VM : BaseViewModel> : AppCompatActivity() {

    lateinit var viewModel: VM


    private val lifecycleRegistry: LifecycleRegistry = LifecycleRegistry(this)

    @Suppress("UNCHECKED_CAST")
    override fun onCreate(savedInstanceState: Bundle?, persistentState: PersistableBundle?) {
        super.onCreate(savedInstanceState, persistentState)
        ButterKnife.bind(this)
        viewModel = assignViewModel(getViewModelFactory())
    }

    override fun getLifecycle(): Lifecycle {
        return lifecycleRegistry
    }

    override fun onDestroy() {
        super.onDestroy()
    }

    //override this to add factory
    open fun getViewModelFactory() : ViewModelProvider.Factory?{
        return null
    }

    abstract fun getViewModelClass(): Class<VM>

    private fun assignViewModel(factory: ViewModelProvider.Factory?): VM {
        if (factory == null) {
            return ViewModelProviders.of(this).get(getViewModelClass())
        } else {
            return ViewModelProviders.of(this, factory).get(getViewModelClass())
        }
    }
}