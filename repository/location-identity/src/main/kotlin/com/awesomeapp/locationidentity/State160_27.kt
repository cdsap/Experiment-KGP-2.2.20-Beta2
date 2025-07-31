package com.awesomeapp.locationidentity

sealed class State160_27 {
    data object Loading : State160_27()
    data class Success(val data: String) : State160_27()
    data class Error(val message: String) : State160_27()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}