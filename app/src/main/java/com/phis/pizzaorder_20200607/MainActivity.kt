package com.phis.pizzaorder_20200607

import android.content.Intent
import android.os.Bundle
import com.bumptech.glide.Glide
import com.phis.pizzaorder_20200607.adapters.PizzaAdapter
import com.phis.pizzaorder_20200607.datas.PizzaStore
import kotlinx.android.synthetic.main.pizza_list_item.*
import kotlinx.android.synthetic.main.pizza_store_list_item.*

class MainActivity : BaseActivity() {


    val pizzaStoreList = ArrayList<PizzaStore>()


    lateinit var pizzaAdapter:PizzaAdapter


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.pizza_list_item)
        setupEvents()
        setValues()
    }


    override fun setupEvents() {

        pizzaStoreListView.setOnItemClickListener { parent, view, position, id ->


//            눌린 가게가 어디인지
            val clickPizza = pizzaStoreList.get(position)
            //val clickPizzalogoUrl= pizzaStoreList.get(position).logoUrl
            val myIntent = Intent(mContext, ViewPizzaActivity::class.java)
            myIntent.putExtra("store", clickPizza)
           // myIntent.putExtra("logoImg", clickPizzalogoUrl)
            startActivity(myIntent)







        }



    }

    override fun setValues() {
//       가게를 직접 추가하는 코드를 따로 모아두고 setValues는 실행만 시킨다.
        addStores()

//        리스트뷰에 목록을 뿌려주는 역학을 담당할 어댑터를 생성.
        pizzaAdapter = PizzaAdapter(mContext, R.layout.pizza_store_list_item, pizzaStoreList)
        
//        만들어낸 어댑터를 실제 리스트뷰와 연결
        pizzaStoreListView.adapter = pizzaAdapter




    }

//    가게를 추가하는 코드가 모인 함수
    fun addStores(){

    pizzaStoreList.add(PizzaStore(
        "피자헛",
        "https://img1.daumcdn.net/thumb/R800x0/?scode=mtistory2&fname=https%3A%2F%2Fk.kakaocdn.net%2Fdn%2FnkQca%2FbtqwVT4rrZo%2FymhFqW9uRbzrmZTxUU1QC1%2Fimg.jpg",
        "1588-5588")
    )

    pizzaStoreList.add(PizzaStore(
        "파파존스",
        "http://mblogthumb2.phinf.naver.net/20160530_65/ppanppane_1464617766007O9b5u_PNG/%C6%C4%C6%C4%C1%B8%BD%BA_%C7%C7%C0%DA_%B7%CE%B0%ED_%284%29.png?type=w800",
        "1577-8080")
    )

    pizzaStoreList.add(PizzaStore(
        "미스터피자",
        "https://post-phinf.pstatic.net/MjAxODEyMDVfMzYg/MDAxNTQzOTYxOTA4NjM3.8gsStnhxz7eEc9zpt5nmSRZmI-Pzpl4NJvHYU-Dlgmcg.7Vpgk0lopJ5GoTav3CUDqmXi2-_67S5AXD0AGbbR6J4g.JPEG/IMG_1641.jpg?type=w1200",
        "1577-0077")
    )

    pizzaStoreList.add(PizzaStore(
        "도미노피자",
        "https://pbs.twimg.com/profile_images/1098371010548555776/trCrCTDN_400x400.png",
        "1577-3082")
    )


}

}
