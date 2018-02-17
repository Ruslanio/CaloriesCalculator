package com.production.ruslanio.caloriescalculator.viewmodel

import com.production.ruslanio.caloriescalculator.data.DataManager
import com.production.ruslanio.caloriescalculator.mvvm.BaseViewModel
import javax.inject.Inject

/**
 * Created by Ruslanio on 07.02.2018.
 */
class UserFomViewModel : BaseViewModel() {

    @Inject
    lateinit var dataManager : DataManager
}