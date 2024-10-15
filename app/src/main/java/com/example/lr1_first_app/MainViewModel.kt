package com.example.lr1_first_app

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class MainViewModel : ViewModel() {

    private val _text =  MutableLiveData<String>()
    val text: LiveData<String>
        get() = _text

    fun changeText(newText: String){
        _text.value = newText
    }
}