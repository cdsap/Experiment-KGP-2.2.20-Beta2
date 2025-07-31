package com.awesomeapp.searchcheckout

sealed class State208_22 {
    data object Loading : State208_22()
    data class Success(val data: String) : State208_22()
    data class Error(val message: String) : State208_22()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}