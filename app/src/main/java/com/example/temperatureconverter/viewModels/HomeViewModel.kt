package com.example.temperatureconverter.viewModels

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.example.temperatureconverter.model.Repository

class HomeViewModel : ViewModel() {
    private val _celsiusTemperature = MutableLiveData<String>()
    val celsiusTemperature: LiveData<String>
        get() = _celsiusTemperature

    fun changeTemperature(fahrenheitTemperature: CharSequence) {
        Repository.temperatureConvert(fahrenheitTemperature.toString()).apply {
            _celsiusTemperature.postValue(String.format("%.1f", this))
        }
    }
}