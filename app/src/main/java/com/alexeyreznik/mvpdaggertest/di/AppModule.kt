package com.alexeyreznik.mvpdaggertest.di

import android.content.Context
import com.alexeyreznik.mvpdaggertest.data.Dependency
import com.alexeyreznik.mvpdaggertest.mvp.MVPApplication
import dagger.Module
import dagger.Provides

@Module
class AppModule(private val app: MVPApplication) {

    @Provides
    @ApplicationScope
    fun provideContext(): Context = app


    @Provides
    @ApplicationScope
    fun provideDependency(context: Context): Dependency = Dependency(context)
}