package me.dmba.jiranav.di.screens

import dagger.Module

/**
 * Created by dmba on 6/13/18.
 */

@Module(
    includes = [
        MainActivityModuleBindings::class
    ]
)
object MainActivityModule

@Module
interface MainActivityModuleBindings
