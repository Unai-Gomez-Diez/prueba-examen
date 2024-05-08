package com.ugdgomezdiez.firstopen.feature.data

import com.ugdgomezdiez.firstopen.feature.domain.OpenModel

interface FirstOpenLocalDataSource {

    fun getFirstOpen():Boolean

    fun setFirstOpen()

    fun setFiveOpen(open: OpenModel)
    fun getFiveOpen(): OpenModel?
}