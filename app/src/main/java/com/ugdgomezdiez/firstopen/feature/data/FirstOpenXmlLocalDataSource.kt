package com.ugdgomezdiez.firstopen.feature.data

import android.annotation.SuppressLint
import android.content.Context
import android.content.Context.MODE_PRIVATE
import android.content.SharedPreferences
import com.ugdgomezdiez.firstopen.app.serialization.JsonSerialization

class FirstOpenXmlLocalDataSource(val context: Context): FirstOpenLocalDataSource {
    val sharedPref = context.getSharedPreferences("FirstOpen",MODE_PRIVATE)
    val sharedPref2 = context.getSharedPreferences("FiveOpen", MODE_PRIVATE)
    override fun getFirstOpen(): Boolean {
        return sharedPref.getBoolean("1", false)


    }

    override fun setFirstOpen() {
        sharedPref.edit().putBoolean("1", true).apply()



    }


    override fun setFiveOpen(number: Int) {
        sharedPref.edit().putInt("2",number+1).apply()
    }

    override fun getFiveOpen(): Int {
        return sharedPref.getInt("2",0)
    }

}