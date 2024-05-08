package com.ugdgomezdiez.firstopen.feature.data

import android.util.Log
import com.ugdgomezdiez.firstopen.feature.domain.FirstOpenRepository
import com.ugdgomezdiez.firstopen.feature.domain.OpenModel

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

    override fun getFiveOpen(): OpenModel? {
        val value2 = firstOpenLocalDataSource.getFiveOpen()
        return if(value2 == null){
            val open = OpenModel(
                1, System.currentTimeMillis().toString()
            )
            firstOpenLocalDataSource.setFiveOpen(open)
            null
        }else if (value2.ejecute < 5){
            val open = OpenModel(
                value2.ejecute+1, System.currentTimeMillis().toString()
            )
            firstOpenLocalDataSource.setFiveOpen(open)
            null
        }else{
            value2
        }
    }
}