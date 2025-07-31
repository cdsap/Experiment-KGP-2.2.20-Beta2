package com.awesomeapp.fileidentity

sealed class State180_13 {
    data object Loading : State180_13()
    data class Success(val data: String) : State180_13()
    data class Error(val message: String) : State180_13()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}