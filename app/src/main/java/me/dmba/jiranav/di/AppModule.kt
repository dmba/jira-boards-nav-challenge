package me.dmba.jiranav.di

import dagger.Binds
import dagger.Module
import me.dmba.jiranav.data.FakeBoardDataSource
import me.dmba.jiranav.data.BoardDataSource

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
    fun bindsDataSource(dataSource: FakeBoardDataSource): BoardDataSource

}
