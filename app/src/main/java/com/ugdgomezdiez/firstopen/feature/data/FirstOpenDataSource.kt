package com.ugdgomezdiez.firstopen.feature.data

import android.util.Log
import com.ugdgomezdiez.firstopen.feature.domain.FirstOpenRepository

class FirstOpenDataSource(
    private val firstOpenLocalDataSource: FirstOpenLocalDataSource
): FirstOpenRepository {
    override fun getFirstOpen(): Boolean {
        val value = firstOpenLocalDataSource.getFirstOpen()
        return if(value == false){
            firstOpenLocalDataSource.setFirstOpen()
            Log.d("@dev", value.toString())
            value
        }else{
            Log.d("@dev", value.toString())
            value
        }
    }
}