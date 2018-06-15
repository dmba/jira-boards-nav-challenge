package me.dmba.jiranav.di.screens

import android.support.v7.widget.RecyclerView.RecycledViewPool
import android.view.LayoutInflater
import dagger.Binds
import dagger.Module
import dagger.Provides
import dagger.multibindings.IntKey
import dagger.multibindings.IntoMap
import me.dmba.jiranav.di.ForActivity
import me.dmba.jiranav.ui.MainActivity
import me.dmba.jiranav.ui.adapter.viewholder.*

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

    @Provides
    @JvmStatic
    @ForActivity
    fun provideRecyclerViewPool(): RecycledViewPool = RecycledViewPool()

}

@Module
interface MainActivityModuleBindings {

    @Binds
    @IntoMap
    @IntKey(TaskType.NORMAL)
    @ForActivity
    fun bindsNormalTaskFactory(factory: TaskViewHolderNormalFactory): TaskViewHolderFactory

    @Binds
    @IntoMap
    @IntKey(ColumnType.NORMAL)
    @ForActivity
    fun bindsNormalColumnFactory(factory: ColumnViewHolderNormalFactory): ColumnViewHolderFactory

}
