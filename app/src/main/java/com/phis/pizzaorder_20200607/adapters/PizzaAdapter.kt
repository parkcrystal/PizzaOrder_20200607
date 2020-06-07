package com.phis.pizzaorder_20200607.adapters

import android.content.Context
import android.opengl.GLES10
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ArrayAdapter
import android.widget.ImageView
import android.widget.TextView
import com.bumptech.glide.Glide
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

//        그려진 XML에 실제 피자가게 데이터를 반영
//        데이터가 반영될 뷰들을 (XML을 담아두는 변수 ROW에서) 가져오는 작업

        val logoImg = row.findViewById<ImageView>(R.id.logoImg)
        val storeNameTxt = row.findViewById<TextView>(R.id.storeNameTxt)

//        뷰에 뿌려질 데이터를 들고 있는 변수를 생성
//        액티비티가 전달해준 목록인  mList에서 꺼내보자.

        val data = mList[position]

//        데이터 안에 있는 가게이름을 = > storeNameTxt의 글자로 설정
        storeNameTxt.text = data.name


//        데이터 안에 있는 로고 Url을 이용해서 = > 이미지를 (웹에서) 다운받아서 -> logoImg에 뿌려주기

        storeNameTxt.text = data.name

        Glide.with(mContext).load(data.logoUrl).into(logoImg)

        return row
    }




}