package me.dmba.jiranav.di.screens

import dagger.Module
import dagger.android.ContributesAndroidInjector
import me.dmba.jiranav.di.ForActivity
import me.dmba.jiranav.ui.MainActivity

/**
 * Created by dmba on 6/13/18.
 */
@Module
interface ActivityBuilderModule {

    @ContributesAndroidInjector(
        modules = [
            MainActivityModule::class
        ]
    )
    @ForActivity
    fun contributeMainActivity(): MainActivity

}
