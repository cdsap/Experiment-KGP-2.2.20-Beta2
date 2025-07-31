package com.awesomeapp.checkoutprofile

import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow
import javax.inject.Inject

class Usecase348_6 @Inject constructor() {
    operator fun invoke(): Flow<String> = flow {
        emit("Data from Usecase348_6 UseCase")
    }
}