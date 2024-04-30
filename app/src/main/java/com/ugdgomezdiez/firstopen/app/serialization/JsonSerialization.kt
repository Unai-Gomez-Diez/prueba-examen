package com.ugdgomezdiez.firstopen.app.serialization

interface JsonSerialization {
    fun <T> fromJson(json:String, typeClass: Class<T>): T
    fun <T> toJson(obj:T, typeClass: Class<T>):String
}