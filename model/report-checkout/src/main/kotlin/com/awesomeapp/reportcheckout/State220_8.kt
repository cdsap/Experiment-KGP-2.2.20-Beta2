package com.awesomeapp.reportcheckout

sealed class State220_8 {
    data object Loading : State220_8()
    data class Success(val data: String) : State220_8()
    data class Error(val message: String) : State220_8()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}