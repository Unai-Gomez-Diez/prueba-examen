package com.ugdgomezdiez.firstopen.feature.data

interface FirstOpenLocalDataSource {

    fun getFirstOpen():Boolean

    fun setFirstOpen()

    fun setFiveOpen(number: Int)
    fun getFiveOpen(): Int
}