package com.natanloterio.viperSampleApp.di.module

import com.natanloterio.viperSampleApp.view.MainActivity
import dagger.Module
import dagger.Provides

@Module
class MainModule(private val mainActivity: MainActivity) {

    @Provides
    fun providesMainActivity(): MainActivity = mainActivity

}