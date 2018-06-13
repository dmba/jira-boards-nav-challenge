package me.dmba.jiranav.di

import dagger.Binds
import dagger.Module
import me.dmba.jiranav.data.FakeProjectDataSource
import me.dmba.jiranav.data.ProjectDataSource

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
interface AppModuleBindings {

    @Binds
    @ForApplication
    fun bindsDataSource(dataSource: FakeProjectDataSource): ProjectDataSource

}
