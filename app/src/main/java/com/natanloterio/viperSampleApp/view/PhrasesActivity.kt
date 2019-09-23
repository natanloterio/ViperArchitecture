package com.natanloterio.viperSampleApp.view

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import com.natanloterio.viperSampleApp.R
import com.natanloterio.viperSampleApp.presenter.PhrasePresenter
import com.natanloterio.viperSampleApp.view.utils.phraseActivityComponent
import kotlinx.android.synthetic.main.phrases_activity.btn_new_phrase
import kotlinx.android.synthetic.main.phrases_activity.txt_phrase
import javax.inject.Inject

class PhrasesActivity : AppCompatActivity() {

    @Inject
    lateinit var presenter: PhrasePresenter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.phrases_activity)

        phraseActivityComponent.inject(this)

        presenter.setInitialPhrase()

        btn_new_phrase.setOnClickListener {
            presenter.generateRandomPhrase()
        }
    }



    override fun onDestroy() {
        super.onDestroy()
        presenter.disposeCalls()
    }

    fun setPhraseText(text: String){
        txt_phrase.text = text
    }
}
