package com.awesomeapp.statuslogin

sealed class State124_25 {
    data object Loading : State124_25()
    data class Success(val data: String) : State124_25()
    data class Error(val message: String) : State124_25()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}