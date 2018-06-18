package me.dmba.jiranav.di

import android.content.Context
import com.squareup.picasso.Picasso
import com.squareup.picasso.Picasso.Builder
import dagger.Binds
import dagger.Module
import dagger.Provides
import me.dmba.jiranav.App
import me.dmba.jiranav.data.BoardDataSource
import me.dmba.jiranav.data.FakeBoardDataSource

/**
 * Created by dmba on 6/13/18.
 */

@Module(
    includes = [
        AppModuleBindings::class
    ]
)
object AppModule {

    @Provides
    @JvmStatic
    @ForApplication
    fun providePicasso(context: Context): Picasso = Builder(context).build()

}

@Module
interface AppModuleBindings {

    @Binds
    @ForApplication
    fun bindsContext(app: App): Context

    @Binds
    @ForApplication
    fun bindsDataSource(dataSource: FakeBoardDataSource): BoardDataSource

}
