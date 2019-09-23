package com.natanloterio.viperSampleApp.di.module

import com.natanloterio.viperSampleApp.view.PhrasesActivity
import dagger.Module
import dagger.Provides

@Module
class PhraseModule(private val phrasesActivity: PhrasesActivity) {

    @Provides
    fun providesPhrasesActivity(): PhrasesActivity = phrasesActivity

}