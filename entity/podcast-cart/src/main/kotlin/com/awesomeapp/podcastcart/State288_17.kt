package com.awesomeapp.podcastcart

sealed class State288_17 {
    data object Loading : State288_17()
    data class Success(val data: String) : State288_17()
    data class Error(val message: String) : State288_17()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}