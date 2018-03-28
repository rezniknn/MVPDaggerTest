package com.alexeyreznik.mvpdaggertest.mvp

import android.os.Bundle
import android.os.PersistableBundle
import android.support.v7.app.AppCompatActivity

abstract class MVPActivity<in V : MVPContract.View, out P : MVPContract.Presenter<V>, out C : MVPContract.Component<V, P>> : AppCompatActivity(), MVPContract.View {

    protected val presenter: P by lazy { component.presenter() }
    protected val component: C by lazy { createComponent() }

    protected abstract fun createComponent(): C

    @Suppress("UNCHECKED_CAST")
    override fun onCreate(savedInstanceState: Bundle?, persistentState: PersistableBundle?) {
        super.onCreate(savedInstanceState, persistentState)
        createComponent()
        presenter.attachView(this as V)
    }

    override fun onDestroy() {
        super.onDestroy()
        presenter.detachView()
    }
}