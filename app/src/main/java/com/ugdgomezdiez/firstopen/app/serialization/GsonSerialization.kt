package com.ugdgomezdiez.firstopen.app.serialization

import android.content.Context
import com.google.gson.Gson

class GsonSerialization(val gson: Gson): JsonSerialization {
    override fun <T> fromJson(json: String, typeClass: Class<T>): T {
        return gson.fromJson(json, typeClass)
    }

    override fun <T> toJson(obj: T, typeClass: Class<T>): String {
        return gson.toJson(obj,typeClass)
    }
}