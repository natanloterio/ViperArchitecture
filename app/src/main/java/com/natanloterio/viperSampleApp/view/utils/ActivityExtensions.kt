package com.natanloterio.viperSampleApp.view.utils

import android.app.Activity
import com.natanloterio.viperSampleApp.ViperSampleApp
import com.natanloterio.viperSampleApp.di.component.DaggerMainComponent
import com.natanloterio.viperSampleApp.di.component.DaggerPhraseComponent
import com.natanloterio.viperSampleApp.di.module.MainModule
import com.natanloterio.viperSampleApp.di.module.PhraseModule
import com.natanloterio.viperSampleApp.view.MainActivity
import com.natanloterio.viperSampleApp.view.PhrasesActivity

val Activity.applicationComponent get() = (application as ViperSampleApp).getApplicationComponent()
val MainActivity.mainActivityComponent get() = DaggerMainComponent
        .builder()
        .applicationComponent(applicationComponent)
        .mainModule(MainModule(this))
        .build()
val PhrasesActivity.phraseActivityComponent get() = DaggerPhraseComponent
        .builder()
        .applicationComponent(applicationComponent)
        .phraseModule(PhraseModule(this))
        .build()