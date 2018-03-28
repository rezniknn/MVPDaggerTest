package com.alexeyreznik.mvpdaggertest.ui

import com.alexeyreznik.mvpdaggertest.di.ActivityScope
import com.alexeyreznik.mvpdaggertest.di.AppComponent
import com.alexeyreznik.mvpdaggertest.mvp.MVPContract
import dagger.Component

@ActivityScope
@Component(dependencies = [AppComponent::class])
interface TestComponent : MVPContract.Component<TestPresenter.TestView, TestPresenter>