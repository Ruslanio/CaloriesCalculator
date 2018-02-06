package com.production.ruslanio.caloriescalculator

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import butterknife.BindView
import com.production.ruslanio.caloriescalculator.mvvm.BaseActivity

class MainActivity : BaseActivity() {

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

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


    }
}
