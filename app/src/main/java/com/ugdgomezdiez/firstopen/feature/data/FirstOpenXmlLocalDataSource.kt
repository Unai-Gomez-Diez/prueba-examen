package com.ugdgomezdiez.firstopen.feature.data

import android.content.Context
import android.content.Context.MODE_PRIVATE
import android.content.SharedPreferences
import com.ugdgomezdiez.firstopen.app.serialization.JsonSerialization

class FirstOpenXmlLocalDataSource(val context: Context,
    val jsonSerialization: JsonSerialization): FirstOpenLocalDataSource {
    val sharedPref = context.getSharedPreferences("FirstOpen",MODE_PRIVATE)
    override fun getFirstOpen(): Boolean {
        val value = sharedPref.all as Map<Boolean,String>
        return if (value == null){
            jsonSerialization.fromJson(value, Boolean::class.java)
        }else{
            false
        }
    }

    override fun setFirstOpen() {
        sharedPref.edit().apply{
            "1"
            jsonSerialization.toJson(true,Boolean::class.java)
        }.apply()
    }

}