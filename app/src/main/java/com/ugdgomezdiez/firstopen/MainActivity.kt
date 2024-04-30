package com.ugdgomezdiez.firstopen

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.google.gson.Gson
import com.ugdgomezdiez.firstopen.app.serialization.GsonSerialization
import com.ugdgomezdiez.firstopen.feature.data.FirstOpenDataSource
import com.ugdgomezdiez.firstopen.feature.data.FirstOpenXmlLocalDataSource
import com.ugdgomezdiez.firstopen.feature.domain.FirstOpenRepository

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        initAplication()
    }
    private fun initAplication(){
        val firstOpenRepository = FirstOpenDataSource(FirstOpenXmlLocalDataSource(this,GsonSerialization(
            Gson()
        )))
        firstOpenRepository.getFirstOpen()
    }
}