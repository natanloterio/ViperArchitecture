package com.natanloterio.viperSampleApp

import android.app.Application
import com.natanloterio.viperSampleApp.di.component.ApplicationComponent
import com.natanloterio.viperSampleApp.di.component.DaggerApplicationComponent
import com.natanloterio.viperSampleApp.di.module.ApplicationModule

class ViperSampleApp: Application() {

    private lateinit var applicationComponent: ApplicationComponent

    override fun onCreate() {
        super.onCreate()

        applicationComponent = DaggerApplicationComponent
                .builder()
                .applicationModule(ApplicationModule(applicationContext))
                .build()
    }

    fun getApplicationComponent(): ApplicationComponent {
        return applicationComponent
    }
}