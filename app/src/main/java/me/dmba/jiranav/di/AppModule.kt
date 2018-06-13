package me.dmba.jiranav.di

import dagger.Module

/**
 * Created by dmba on 6/13/18.
 */

@Module(
    includes = [
        AppModuleBindings::class
    ]
)
object AppModule

@Module
interface AppModuleBindings
