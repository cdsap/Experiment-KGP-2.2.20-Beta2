package com.awesomeapp.checkoutidentity

sealed class State152_22 {
    data object Loading : State152_22()
    data class Success(val data: String) : State152_22()
    data class Error(val message: String) : State152_22()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}