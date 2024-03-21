package com.example.mysurahapp.ui.Surah


import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class SurahViewModel : ViewModel() {

    private val _text = MutableLiveData<String>().apply {
        value = "This is home Fragment"
    }
}