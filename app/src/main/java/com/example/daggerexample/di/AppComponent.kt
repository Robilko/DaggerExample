package com.example.daggerexample.di

import com.example.daggerexample.MainActivity
import dagger.Component

@Component
interface AppComponent {
    fun injectMainActivity(mainActivity: MainActivity)
}