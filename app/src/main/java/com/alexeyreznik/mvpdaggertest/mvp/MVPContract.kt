package com.alexeyreznik.mvpdaggertest.mvp

interface MVPContract {
    interface View {}

    interface Presenter<in V : View> {
        fun attachView(view: V)
        fun detachView()
    }

    interface Component<in V : View, out P : Presenter<V>> {
        fun presenter(): P
    }
}