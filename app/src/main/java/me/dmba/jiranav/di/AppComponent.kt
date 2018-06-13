package me.dmba.jiranav.di

import dagger.BindsInstance
import dagger.Component
import dagger.android.AndroidInjector
import dagger.android.support.AndroidSupportInjectionModule
import me.dmba.jiranav.App
import me.dmba.jiranav.di.screens.ActivityBuilderModule

/**
 * Created by dmba on 6/13/18.
 */
@Component(
    modules = [
        AndroidSupportInjectionModule::class,
        ActivityBuilderModule::class,
        AppModule::class
    ]
)
@ForApplication
interface AppComponent : AndroidInjector<App> {

    @Component.Builder
    interface Builder {

        @BindsInstance
        fun app(app: App): Builder

        fun build(): AppComponent

    }

}
