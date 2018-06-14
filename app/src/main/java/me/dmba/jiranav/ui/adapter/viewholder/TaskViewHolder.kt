package me.dmba.jiranav.ui.adapter.viewholder

import android.support.annotation.LayoutRes
import android.support.v7.widget.RecyclerView.ViewHolder
import android.view.View
import android.view.ViewGroup
import me.dmba.jiranav.data.model.Task
import me.dmba.jiranav.util.inflate

/**
 * Created by dmba on 6/13/18.
 */
abstract class TaskViewHolder(

    @LayoutRes layoutRes: Int,

    parent: ViewGroup

) : ViewHolder(parent.inflate(layoutRes)) {

    abstract fun bind(task: Task): View

}
