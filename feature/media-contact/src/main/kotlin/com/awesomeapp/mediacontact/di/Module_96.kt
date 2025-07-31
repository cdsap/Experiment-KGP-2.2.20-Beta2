package com.awesomeapp.mediacontact.di

import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton
import com.awesomeapp.mediacontact.Viewmodel96_1
import com.awesomeapp.mediacontact.Activity96_2
import com.awesomeapp.mediacontact.Activity96_3
import com.awesomeapp.mediacontact.Fragment96_4
import com.awesomeapp.mediacontact.Repository96_5
import com.awesomeapp.identity.Api4_6
import com.awesomeapp.share.Api16_6
import com.awesomeapp.mediacontact.Api96_6
import com.awesomeapp.mediacontact.Usecase96_7
import com.awesomeapp.mediacontact.Model96_9
import com.awesomeapp.mediacontact.Model96_10
import com.awesomeapp.mediacontact.Activity96_11
import com.awesomeapp.mediacontact.Model96_13
import com.awesomeapp.mediacontact.Activity96_14
import com.awesomeapp.mediacontact.Model96_16
import com.awesomeapp.mediacontact.Activity96_17

@Module
@InstallIn(SingletonComponent::class)
object Module_96 {
    @Provides
    @Singleton
    fun provideRepository96_5(
        api0: Api4_6 = Api4_6(),
        api1: Api16_6 = Api16_6()
    ): Repository96_5 {
        return Repository96_5(api0, 
        api1)
    }

    @Provides
    @Singleton
    fun provideApi96_6(): Api96_6 {
        return Api96_6()
    }
}