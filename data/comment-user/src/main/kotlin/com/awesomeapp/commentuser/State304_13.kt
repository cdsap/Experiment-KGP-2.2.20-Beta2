package com.awesomeapp.commentuser

sealed class State304_13 {
    data object Loading : State304_13()
    data class Success(val data: String) : State304_13()
    data class Error(val message: String) : State304_13()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}