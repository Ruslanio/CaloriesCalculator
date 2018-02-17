package com.production.ruslanio.caloriescalculator.mvvm

import android.arch.lifecycle.Lifecycle
import android.arch.lifecycle.LifecycleRegistry
import android.arch.lifecycle.ViewModelProvider
import android.arch.lifecycle.ViewModelProviders
import android.content.Context
import android.os.Bundle

import android.support.annotation.LayoutRes
import android.support.annotation.StringRes
import android.support.design.widget.Snackbar
import android.support.v7.app.AppCompatActivity
import android.widget.Toast
import butterknife.ButterKnife
import dagger.android.AndroidInjection

/**
 * Created by Ruslanio on 28.01.2018.
 */
abstract class BaseActivity<VM : BaseViewModel> : AppCompatActivity() {

    lateinit var viewModel: VM
        private set

    var context: Context = this
        private set


    private val lifecycleRegistry: LifecycleRegistry = LifecycleRegistry(this)

    @Suppress("UNCHECKED_CAST")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        AndroidInjection.inject(this)
        setContentView(getLayoutId())
        ButterKnife.bind(this)
        viewModel = assignViewModel(getViewModelFactory())
        onInit(savedInstanceState)
    }

    abstract fun onInit(savedInstanceState: Bundle?)

    @LayoutRes
    abstract fun getLayoutId(): Int

    override fun getLifecycle(): Lifecycle {
        return lifecycleRegistry
    }

    override fun onDestroy() {
        super.onDestroy()
    }

    //override this to add factory
    open fun getViewModelFactory(): ViewModelProvider.Factory? {
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

    fun BaseActivity<VM>.showToast(message: String) {
        Toast.makeText(context, message, Toast.LENGTH_SHORT).show()
    }

    fun BaseActivity<VM>.showToast(@StringRes messageId: Int) {
        Toast.makeText(context, messageId, Toast.LENGTH_SHORT).show()
    }

    fun BaseActivity<VM>.showSnackBar(message: String) {
        Snackbar.make(window.decorView, message, Snackbar.LENGTH_LONG).show()
    }

    fun BaseActivity<VM>.showSnackBar(@StringRes messageId: Int) {
        Snackbar.make(window.decorView, messageId, Snackbar.LENGTH_LONG).show()
    }

}