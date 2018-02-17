package com.production.ruslanio.caloriescalculator.views

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import butterknife.BindView
import com.production.ruslanio.caloriescalculator.R
import com.production.ruslanio.caloriescalculator.data.DataManager
import com.production.ruslanio.caloriescalculator.mvvm.BaseActivity
import com.production.ruslanio.caloriescalculator.viewmodel.UserFomViewModel
import javax.inject.Inject

/**
 * Created by Ruslanio on 07.02.2018.
 */
class UserFormActivity : BaseActivity<UserFomViewModel>() {

    @BindView(R.id.btn_submit)
    lateinit var btnSubmit:Button

    override fun onInit(savedInstanceState: Bundle?) {
        btnSubmit.setOnClickListener {
            val intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
        }
    }

    override fun getLayoutId(): Int {
        return R.layout.activity_user_form
    }

    override fun getViewModelClass(): Class<UserFomViewModel> {
        return UserFomViewModel::class.java
    }
}