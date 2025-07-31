package com.awesomeapp.accountidentity

import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow
import javax.inject.Inject

class Usecase168_6 @Inject constructor() {
    operator fun invoke(): Flow<String> = flow {
        emit("Data from Usecase168_6 UseCase")
    }
}