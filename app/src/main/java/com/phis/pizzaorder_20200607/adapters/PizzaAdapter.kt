package com.phis.pizzaorder_20200607.adapters

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ArrayAdapter
import com.phis.pizzaorder_20200607.R
import com.phis.pizzaorder_20200607.datas.PizzaStore

class PizzaAdapter(context: Context, resId: Int, storeList: List<PizzaStore>): ArrayAdapter<PizzaStore>(context, resId, storeList) {

    val mContext = context
    val mList = storeList
    val inf = LayoutInflater.from(mContext)

    override fun getView(position: Int, convertView: View?, parent: ViewGroup): View {
        var tempRow = convertView
        tempRow?.let {
            tempRow = inf.inflate(R.layout.pizza_store_list_item, null)
        }
        val row = tempRow!!

        return row
    }

}