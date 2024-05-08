package com.ugdgomezdiez.firstopen.feature.domain

interface FirstOpenRepository {
    fun getFirstOpen(): Boolean
    fun getFiveOpen(): OpenModel?
}