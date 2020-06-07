package com.phis.pizzaorder_20200607

import android.os.Bundle
import com.phis.pizzaorder_20200607.datas.PizzaStore

class MainActivity : BaseActivity() {


    val pizza = ArrayList<PizzaStore>()


    lateinit var pizzaAdapter:PizzaAdapter


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        setupEvents()
        setValues()
    }


    override fun setupEvents() {

    }

    override fun setValues() {

    }

}
