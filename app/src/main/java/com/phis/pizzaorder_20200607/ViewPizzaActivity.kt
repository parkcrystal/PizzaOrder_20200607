package com.phis.pizzaorder_20200607

import android.Manifest
import android.content.Intent
import android.net.Uri
import android.os.Bundle
import android.os.PersistableBundle
import android.widget.Toast
import com.bumptech.glide.Glide
import com.gun0912.tedpermission.PermissionListener
import com.gun0912.tedpermission.TedPermission
import com.phis.pizzaorder_20200607.datas.PizzaStore
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.pizza_store_list_item.*
import kotlinx.android.synthetic.main.pizza_store_list_item.logoImg

class ViewPizzaActivity: BaseActivity() {

    lateinit var mPizzaStore: PizzaStore

    override fun onCreate(savedInstanceState: Bundle?, persistentState: PersistableBundle?) {
        super.onCreate(savedInstanceState, persistentState)
        setContentView(R.layout.activity_main)
        setupEvents()
        setValues()
    }


    override fun setupEvents() {


        callBtn.setOnClickListener {


            val pl = object : PermissionListener {
                override fun onPermissionGranted() {      //            허가가 난 경우




//            실제로 전화를 거는 코드
                    val myUri = Uri.parse(

                        "tel:${phoneNumTxt.text}"
                    )
                    val myIntent = Intent(Intent.ACTION_CALL, myUri)
                    startActivity(myIntent)
                }

                override fun onPermissionDenied(deniedPermissions: MutableList<String>?) { //            허가가 나지 않은 경우


                }


            }

            TedPermission.with(mContext)
                .setPermissionListener(pl)
                .setPermissions(Manifest.permission.CALL_PHONE)
                .check()



        }

    }

    override fun setValues() {

//       Serializable 첨부된 가게 정보를 받아서  PizzaStore 형태로 변신 (Casting)
//        멤버변수로 있는 피자가게 변수에 대입
        mPizzaStore = intent.getSerializableExtra("store") as PizzaStore


//        대입된 피자 가게 변수의 데이터들을 이용해서 화면에 출력

       // Glide.with(mContext).load(clickPizzalogoUrl).into(logoImg)
        Glide.with(mContext).load(mPizzaStore.logoUrl).into(logoImg)
        storeNameTxt.text = mPizzaStore.name
        phoneNumTxt.text = mPizzaStore.phoneNum

    }


}