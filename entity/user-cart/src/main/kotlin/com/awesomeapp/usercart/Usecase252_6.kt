package com.awesomeapp.usercart

import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow
import javax.inject.Inject

class Usecase252_6 @Inject constructor() {
    operator fun invoke(): Flow<String> = flow {
        emit("Data from Usecase252_6 UseCase")
    }
}