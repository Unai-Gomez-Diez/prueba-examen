package com.ugdgomezdiez.firstopen.feature.data

import android.annotation.SuppressLint
import android.content.Context
import android.content.Context.MODE_PRIVATE
import android.content.SharedPreferences
import com.ugdgomezdiez.firstopen.app.serialization.JsonSerialization
import com.ugdgomezdiez.firstopen.feature.domain.OpenModel

class FirstOpenXmlLocalDataSource(val context: Context,
    val jsonSerialization: JsonSerialization): FirstOpenLocalDataSource {
    val sharedPref = context.getSharedPreferences("FirstOpen",MODE_PRIVATE)
    val sharedPref2 = context.getSharedPreferences("FiveOpen", MODE_PRIVATE)
    val execute = 1
    override fun getFirstOpen(): Boolean {
        return sharedPref.getBoolean("1", false)


    }

    override fun setFirstOpen() {
        sharedPref.edit().putBoolean("1", true).apply()



    }



    override fun setFiveOpen(open: OpenModel) {
        sharedPref2.edit().apply {
            putString(
                open.ejecute.toString(),
                jsonSerialization.toJson(open, OpenModel::class.java)
            )
        }.apply()
    }

    override fun getFiveOpen(): OpenModel? {
        val map = sharedPref2.all as Map<String, String>
        return if (map.isNotEmpty()){
            val list = map.values.toList()
            return jsonSerialization.fromJson(list.last(), OpenModel::class.java)
        }else{
            null
        }

    }

}