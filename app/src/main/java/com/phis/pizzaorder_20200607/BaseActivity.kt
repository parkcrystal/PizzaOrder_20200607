package com.phis.pizzaorder_20200607

import androidx.appcompat.app.AppCompatActivity

abstract class BaseActivity: AppCompatActivity() {

    val mContext = this

    abstract fun setupEvents()

    abstract fun setValues()

}