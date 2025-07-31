package com.awesomeapp.alarmcart

sealed class State276_17 {
    data object Loading : State276_17()
    data class Success(val data: String) : State276_17()
    data class Error(val message: String) : State276_17()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}