package com.natanloterio.viperSampleApp.di.module

import android.content.Context
import dagger.Module
import dagger.Provides

@Module
class ApplicationModule(private val context: Context) {

    @Provides
    fun providesContext(): Context = context

}