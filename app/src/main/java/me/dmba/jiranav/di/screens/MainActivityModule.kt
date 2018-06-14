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
import me.dmba.jiranav.ui.adapter.viewholder.ColumnViewHolderNormalFactory
import me.dmba.jiranav.ui.adapter.viewholder.TYPE_COLUMN_NORMAL
import me.dmba.jiranav.ui.adapter.viewholder.TYPE_TASK_NORMAL
import me.dmba.jiranav.ui.adapter.viewholder.TaskViewHolderNormalFactory
import me.dmba.jiranav.ui.adapter.viewholder.factory.ColumnViewHolderFactory
import me.dmba.jiranav.ui.adapter.viewholder.factory.TaskViewHolderFactory


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
    @IntKey(TYPE_TASK_NORMAL)
    @ForActivity
    fun bindsNormalTaskFactory(factory: TaskViewHolderNormalFactory): TaskViewHolderFactory

    @Binds
    @IntoMap
    @IntKey(TYPE_COLUMN_NORMAL)
    @ForActivity
    fun bindsNormalColumnFactory(factory: ColumnViewHolderNormalFactory): ColumnViewHolderFactory

}
