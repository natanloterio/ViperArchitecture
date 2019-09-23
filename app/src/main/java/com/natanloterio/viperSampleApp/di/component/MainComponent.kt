package com.natanloterio.viperSampleApp.di.component

import com.natanloterio.viperSampleApp.di.module.MainModule
import com.natanloterio.viperSampleApp.view.MainActivity
import dagger.Component

@Component(modules = [MainModule::class], dependencies = [ApplicationComponent::class])
interface MainComponent {
    fun inject(mainActivity: MainActivity)
}