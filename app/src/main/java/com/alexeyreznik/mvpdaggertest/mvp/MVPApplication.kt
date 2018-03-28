package com.alexeyreznik.mvpdaggertest.mvp

import android.app.Application
import com.alexeyreznik.mvpdaggertest.di.AppComponent
import com.alexeyreznik.mvpdaggertest.di.AppModule
import com.alexeyreznik.mvpdaggertest.di.DaggerAppComponent

abstract class MVPApplication : Application() {

    lateinit var component: AppComponent

    override fun onCreate() {
        super.onCreate()

        component = DaggerAppComponent.builder()
                .appModule(AppModule(this))
                .build()
    }

}