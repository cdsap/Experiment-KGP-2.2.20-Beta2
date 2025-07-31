package com.awesomeapp.taskcheckout

sealed class State224_25 {
    data object Loading : State224_25()
    data class Success(val data: String) : State224_25()
    data class Error(val message: String) : State224_25()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}