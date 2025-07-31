package com.awesomeapp.documentuser

sealed class State328_13 {
    data object Loading : State328_13()
    data class Success(val data: String) : State328_13()
    data class Error(val message: String) : State328_13()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}