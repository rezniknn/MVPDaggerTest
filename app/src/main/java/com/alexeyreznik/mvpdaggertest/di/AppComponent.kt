package com.alexeyreznik.mvpdaggertest.di

import android.content.Context
import com.alexeyreznik.mvpdaggertest.data.Dependency
import dagger.Component

@ApplicationScope
@Component(modules = [AppModule::class])
interface AppComponent {
    fun context(): Context
    fun dependency(): Dependency
}