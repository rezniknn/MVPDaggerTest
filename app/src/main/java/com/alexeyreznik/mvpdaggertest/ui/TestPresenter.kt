package com.alexeyreznik.mvpdaggertest.ui

import com.alexeyreznik.mvpdaggertest.data.Dependency
import com.alexeyreznik.mvpdaggertest.mvp.MVPContract
import com.alexeyreznik.mvpdaggertest.mvp.MVPPresenter
import javax.inject.Inject

class TestPresenter @Inject constructor(private val dependency: Dependency) : MVPPresenter<TestPresenter.TestView>() {

    interface TestView : MVPContract.View {

    }
}