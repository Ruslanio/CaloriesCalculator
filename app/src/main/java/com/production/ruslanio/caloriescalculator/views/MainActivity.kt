package com.production.ruslanio.caloriescalculator.views

import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import butterknife.BindView
import com.production.ruslanio.caloriescalculator.R
import com.production.ruslanio.caloriescalculator.aspects.annotations.LogThis
import com.production.ruslanio.caloriescalculator.mvvm.BaseActivity
import com.production.ruslanio.caloriescalculator.viewmodel.MainViewModel
import javax.inject.Inject

class MainActivity : BaseActivity<MainViewModel>() {

    @BindView(R.id.btn_add_to_daily)
    lateinit var addToDaily: Button

    @BindView(R.id.btn_add_food)
    lateinit var addFood: Button

    @BindView(R.id.kalories)
    lateinit var dailyKalories: TextView

    @BindView(R.id.protein)
    lateinit var protein: TextView

    @BindView(R.id.fats)
    lateinit var fats: TextView

    @BindView(R.id.carbohydrates)
    lateinit var carbohydrates: TextView

    @BindView(R.id.test)
    lateinit var tvTest: TextView

    @Inject
    lateinit var test:String

    override fun getViewModelClass(): Class<MainViewModel> {
        return MainViewModel::class.java
    }

    @LogThis(tag = "onInit", message = "test")
    override fun onInit(savedInstanceState: Bundle?) {
        addToDaily.setOnClickListener{
            showSnackBar("Working!")
        }

        tvTest.text = test
    }

    override fun getLayoutId(): Int {
        return R.layout.activity_main
    }
}
