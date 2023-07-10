package com.tarobu612.daggerhiltsampleapp.ui.main

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject

@HiltViewModel
class MainViewModel @Inject constructor(
    private val taskRepository: TaskDataSource
) : ViewModel() {
    private var _showMessage: MutableLiveData<String> = MutableLiveData<String>()
    val showMessage: LiveData<String> get() = _showMessage

    fun showMessage() {
        taskRepository.load()
        _showMessage.value = "Changed!!"
    }

}
