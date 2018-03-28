package com.alexeyreznik.mvpdaggertest.mvp

abstract class MVPPresenter<V : MVPContract.View> : MVPContract.Presenter<V> {

    var view: V? = null
        private set

    override fun attachView(view: V) {
        this.view = view
    }

    override fun detachView() {
        this.view = null
    }
}