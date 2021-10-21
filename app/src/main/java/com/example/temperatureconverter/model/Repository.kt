package com.example.temperatureconverter.model

object Repository {
    fun temperatureConvert(temperatureValue: String): Double {
        return if (temperatureValue.isEmpty()) {
            0.0
        } else {
            temperatureValue.toDouble().minus(32).div(1.8)
        }
    }
}