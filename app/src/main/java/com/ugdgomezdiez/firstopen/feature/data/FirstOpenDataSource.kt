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

    override fun getFiveOpen(): Boolean {
        val value2 = firstOpenLocalDataSource.getFiveOpen()
        return if(value2 < 5){
            firstOpenLocalDataSource.setFiveOpen(value2)
            return false
        }else{
            return true
        }
    }
}