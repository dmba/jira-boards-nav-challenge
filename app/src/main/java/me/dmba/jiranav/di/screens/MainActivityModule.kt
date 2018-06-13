package me.dmba.jiranav.di.screens

import android.view.LayoutInflater
import dagger.Module
import dagger.Provides
import me.dmba.jiranav.di.ForActivity
import me.dmba.jiranav.ui.MainActivity

/**
 * Created by dmba on 6/13/18.
 */

@Module(
    includes = [
        MainActivityModuleBindings::class
    ]
)
object MainActivityModule {

    @Provides
    @JvmStatic
    @ForActivity
    fun provideLayoutInflater(mainActivity: MainActivity): LayoutInflater = mainActivity.layoutInflater

}

@Module
interface MainActivityModuleBindings
