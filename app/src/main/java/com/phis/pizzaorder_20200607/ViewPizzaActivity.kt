package com.phis.pizzaorder_20200607

import android.os.Bundle
import android.os.PersistableBundle

class ViewPizzaActivity: BaseActivity() {

    override fun onCreate(savedInstanceState: Bundle?, persistentState: PersistableBundle?) {
        super.onCreate(savedInstanceState, persistentState)
        setContentView(R.layout.activity_main)
        setupEvents()
        setValues()
    }


    override fun setupEvents() {

    }

    override fun setValues() {

    }


}