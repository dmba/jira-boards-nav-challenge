package me.dmba.jiranav.ui.adapter.viewholder

import android.support.annotation.LayoutRes
import android.support.v7.widget.RecyclerView.ViewHolder
import android.view.LayoutInflater
import android.view.ViewGroup
import me.dmba.jiranav.data.model.Task

/**
 * Created by dmba on 6/13/18.
 */
abstract class TaskViewHolder(

    @LayoutRes layoutRes: Int,

    inflater: LayoutInflater,

    parent: ViewGroup

) : ViewHolder(inflater.inflate(layoutRes, parent, false)) {

    abstract fun bind(task: Task)

}
