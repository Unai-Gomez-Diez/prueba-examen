package com.ugdgomezdiez.firstopen

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.TextView
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
        val firstOpenRepository = FirstOpenDataSource(FirstOpenXmlLocalDataSource(this, GsonSerialization(Gson())))
        val prueba = firstOpenRepository.getFirstOpen()
        val prueba2 = firstOpenRepository.getFiveOpen()

        val vista = findViewById<TextView>(R.id.primera)
        val vista2 = findViewById<TextView>(R.id.np_primera)
        val vistaFive = findViewById<TextView>(R.id.primera_five)
        val vistaFiveTime = findViewById<TextView>(R.id.time_primera_five)
        if (prueba == true){
            vista.visibility = View.GONE
            vista2.visibility = View.VISIBLE
        }
        if(prueba2 != null){
            vistaFive.visibility = View.VISIBLE
            vistaFiveTime.setText(prueba2.time)
            vistaFiveTime.visibility = View.VISIBLE
            }



    }
}