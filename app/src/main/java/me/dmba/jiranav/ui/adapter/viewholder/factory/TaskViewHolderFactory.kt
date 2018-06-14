package me.dmba.jiranav.ui.adapter.viewholder.factory

import android.view.ViewGroup
import me.dmba.jiranav.ui.adapter.viewholder.TaskViewHolder

/**
 * Created by dmba on 6/13/18.
 */
interface TaskViewHolderFactory {

    fun createViewHolder(parent: ViewGroup): TaskViewHolder

}
