package com.awesomeapp.videocheckout

import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow
import javax.inject.Inject

class Usecase240_8 @Inject constructor() {
    operator fun invoke(): Flow<String> = flow {
        emit("Data from Usecase240_8 UseCase")
    }
}