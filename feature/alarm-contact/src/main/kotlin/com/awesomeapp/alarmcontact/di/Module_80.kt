package com.awesomeapp.alarmcontact.di

import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton
import com.awesomeapp.alarmcontact.Viewmodel80_1
import com.awesomeapp.alarmcontact.Activity80_2
import com.awesomeapp.alarmcontact.Activity80_3
import com.awesomeapp.alarmcontact.Fragment80_4
import com.awesomeapp.alarmcontact.Repository80_5
import com.awesomeapp.todo.Api36_6
import com.awesomeapp.report.Api24_6
import com.awesomeapp.identity.Api4_6
import com.awesomeapp.alarmcontact.Api80_6
import com.awesomeapp.alarmcontact.Service80_7
import com.awesomeapp.alarmcontact.Worker80_8

@Module
@InstallIn(SingletonComponent::class)
object Module_80 {
    @Provides
    @Singleton
    fun provideRepository80_5(
        api0: Api36_6 = Api36_6(),
        api1: Api24_6 = Api24_6(),
        api2: Api4_6 = Api4_6()
    ): Repository80_5 {
        return Repository80_5(api0, 
        api1, 
        api2)
    }

    @Provides
    @Singleton
    fun provideApi80_6(): Api80_6 {
        return Api80_6()
    }
}