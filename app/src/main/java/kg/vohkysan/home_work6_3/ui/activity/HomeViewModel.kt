package kg.vohkysan.home_work6_3.ui.activity

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class HomeViewModel : ViewModel() {
    private var counter = 0
    private var operation = ""

    val counterMutableLiveData = MutableLiveData<Int>()
    val operationMutableLiveData = MutableLiveData<String>()

    fun increment() {
        counter++
        counterMutableLiveData.value = counter
        operation = "\n + ${operation}"
        operationMutableLiveData.value = operation
    }

    fun decrement() {
        counter--
        counterMutableLiveData.value = counter
        operation = "\n -${operation}"
        operationMutableLiveData.value = operation
    }
}