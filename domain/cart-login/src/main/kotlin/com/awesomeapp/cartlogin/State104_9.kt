package com.awesomeapp.cartlogin

sealed class State104_9 {
    data object Loading : State104_9()
    data class Success(val data: String) : State104_9()
    data class Error(val message: String) : State104_9()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}