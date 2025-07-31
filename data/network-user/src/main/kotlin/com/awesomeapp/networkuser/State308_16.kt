package com.awesomeapp.networkuser

sealed class State308_16 {
    data object Loading : State308_16()
    data class Success(val data: String) : State308_16()
    data class Error(val message: String) : State308_16()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}