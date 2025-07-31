package com.awesomeapp.metriccontact.di

import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton
import com.awesomeapp.metriccontact.Viewmodel76_1
import com.awesomeapp.metriccontact.Activity76_2
import com.awesomeapp.metriccontact.Activity76_3
import com.awesomeapp.metriccontact.Fragment76_4
import com.awesomeapp.metriccontact.Repository76_5
import com.awesomeapp.profile.Api8_6
import com.awesomeapp.share.Api16_6
import com.awesomeapp.search.Api12_6
import com.awesomeapp.audio.Api48_6
import com.awesomeapp.setting.Api20_6
import com.awesomeapp.todo.Api36_6
import com.awesomeapp.metriccontact.Api76_6
import com.awesomeapp.metriccontact.Model76_8
import com.awesomeapp.metriccontact.Model76_9
import com.awesomeapp.metriccontact.Activity76_10
import com.awesomeapp.metriccontact.Model76_12
import com.awesomeapp.metriccontact.Activity76_13
import com.awesomeapp.metriccontact.Model76_15
import com.awesomeapp.metriccontact.Activity76_16
import com.awesomeapp.metriccontact.Model76_18
import com.awesomeapp.metriccontact.Activity76_19

@Module
@InstallIn(SingletonComponent::class)
object Module_76 {
    @Provides
    @Singleton
    fun provideRepository76_5(
        api0: Api8_6 = Api8_6(),
        api1: Api16_6 = Api16_6(),
        api2: Api12_6 = Api12_6(),
        api3: Api48_6 = Api48_6(),
        api4: Api20_6 = Api20_6(),
        api5: Api36_6 = Api36_6()
    ): Repository76_5 {
        return Repository76_5(api0, 
        api1, 
        api2, 
        api3, 
        api4, 
        api5)
    }

    @Provides
    @Singleton
    fun provideApi76_6(): Api76_6 {
        return Api76_6()
    }
}