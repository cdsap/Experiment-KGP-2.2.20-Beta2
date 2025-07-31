package com.awesomeapp.fileidentity

import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow
import javax.inject.Inject

class Usecase180_8 @Inject constructor() {
    operator fun invoke(): Flow<String> = flow {
        emit("Data from Usecase180_8 UseCase")
    }
}