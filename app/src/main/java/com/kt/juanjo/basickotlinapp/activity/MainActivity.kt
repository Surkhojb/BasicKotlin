package com.kt.juanjo.basickotlinapp.activity

import android.app.Activity
import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.kt.juanjo.basickotlinapp.R


class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

    }

    fun onButtonClick(view: View) {
        when (view.id) {
            R.id.bt1 -> goToActivity<ListViewActivity>()
            R.id.bt2 -> goToActivity<RecyclerViewActivity>()
        }
    }

    inline fun <reified T : Activity> goToActivity(){
            startActivity(Intent(applicationContext, T::class.java))
    }


}
