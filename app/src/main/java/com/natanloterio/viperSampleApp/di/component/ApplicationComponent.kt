package com.natanloterio.viperSampleApp.di.component

import android.content.Context
import com.natanloterio.viperSampleApp.di.module.ApplicationModule
import com.natanloterio.viperSampleApp.di.module.ServiceModule
import com.natanloterio.viperSampleApp.interactor.service.PhrasesService
import dagger.Component

@Component(modules = [ApplicationModule::class, ServiceModule::class])
interface ApplicationComponent {
    fun getContext(): Context
    fun getPhrasesService(): PhrasesService
}