package com.alexeyreznik.mvpdaggertest.ui

import com.alexeyreznik.mvpdaggertest.mvp.MVPActivity

class TestActivity : MVPActivity<TestPresenter.TestView, TestPresenter, TestComponent>(), TestPresenter.TestView {

    override fun createComponent(): TestComponent =
            DaggerTestComponent.builder()
                    .appComponent((application as TestApp).component)
                    .build()
}