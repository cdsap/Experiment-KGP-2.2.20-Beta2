package com.awesomeapp.usercart

sealed class State252_17 {
    data object Loading : State252_17()
    data class Success(val data: String) : State252_17()
    data class Error(val message: String) : State252_17()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}