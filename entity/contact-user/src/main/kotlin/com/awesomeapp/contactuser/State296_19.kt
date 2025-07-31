package com.awesomeapp.contactuser

sealed class State296_19 {
    data object Loading : State296_19()
    data class Success(val data: String) : State296_19()
    data class Error(val message: String) : State296_19()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}