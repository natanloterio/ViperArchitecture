package com.natanloterio.viperSampleApp.di.component

import com.natanloterio.viperSampleApp.di.module.PhraseModule
import com.natanloterio.viperSampleApp.view.PhrasesActivity
import dagger.Component

@Component(modules = [PhraseModule::class], dependencies = [ApplicationComponent::class])
interface PhraseComponent {
    fun inject(phrasesActivity: PhrasesActivity)
}