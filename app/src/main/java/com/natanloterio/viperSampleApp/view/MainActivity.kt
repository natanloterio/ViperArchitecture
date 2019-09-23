package com.natanloterio.viperSampleApp.view

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import com.natanloterio.viperSampleApp.R
import com.natanloterio.viperSampleApp.presenter.MainPresenter
import com.natanloterio.viperSampleApp.view.utils.mainActivityComponent

import kotlinx.android.synthetic.main.main_activity.btn_main_new_phrase
import javax.inject.Inject

class MainActivity : AppCompatActivity() {

    @Inject
    lateinit var presenter: MainPresenter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.main_activity)

        mainActivityComponent.inject(this)

        btn_main_new_phrase.setOnClickListener {
            presenter.onSeePhraseClicked()
        }
    }

    override fun onDestroy() {
        super.onDestroy()
        presenter.disposeCalls()
    }
}
