package me.dmba.jiranav.di.screens

import dagger.Module
import dagger.android.ContributesAndroidInjector
import me.dmba.jiranav.screens.MainActivity
import me.dmba.jiranav.di.ForActivity

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
