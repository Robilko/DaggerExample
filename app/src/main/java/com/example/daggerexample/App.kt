package com.example.daggerexample

import android.app.Application
import com.example.daggerexample.di.AppComponent

class App: Application() {

    lateinit var appComponent: AppComponent

    override fun onCreate() {
        super.onCreate()
        appComponent = DaggerAppComponent.create()
    }
}