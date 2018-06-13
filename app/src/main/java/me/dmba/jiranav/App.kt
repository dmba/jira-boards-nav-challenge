package me.dmba.jiranav

import dagger.android.AndroidInjector
import dagger.android.support.DaggerApplication
import me.dmba.jiranav.di.AppComponent
import me.dmba.jiranav.di.DaggerAppComponent

/**
 * Created by dmba on 6/13/18.
 */
class App : DaggerApplication() {

    private val injector: AppComponent by lazy {
        DaggerAppComponent.builder()
            .app(this)
            .build()
    }

    override fun applicationInjector(): AndroidInjector<out DaggerApplication> = injector

}
