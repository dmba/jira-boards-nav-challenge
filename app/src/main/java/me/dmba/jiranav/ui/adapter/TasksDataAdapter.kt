package me.dmba.jiranav.ui.adapter

import android.support.v7.widget.RecyclerView.Adapter
import android.view.ViewGroup
import me.dmba.jiranav.data.model.Task
import me.dmba.jiranav.ui.adapter.viewholder.TYPE_NORMAL
import me.dmba.jiranav.ui.adapter.viewholder.TaskViewHolder
import me.dmba.jiranav.ui.adapter.viewholder.factory.TaskViewHolderFactories
import javax.inject.Inject

/**
 * Created by dmba on 6/13/18.
 */
class TasksDataAdapter @Inject constructor(

    private val viewHolderFactories: TaskViewHolderFactories

) : Adapter<TaskViewHolder>() {

    private val tasks: MutableList<Task> = mutableListOf()

    override fun getItemCount(): Int = tasks.size

    override fun getItemViewType(position: Int): Int = TYPE_NORMAL

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): TaskViewHolder {
        return viewHolderFactories[viewType]!!.createViewHolder(parent)
    }

    override fun onBindViewHolder(holder: TaskViewHolder, position: Int) {
        holder.bind(tasks[position])
    }

    fun updateTasks(newTasks: List<Task>) {
        tasks.clear()
        tasks.addAll(newTasks)
        notifyDataSetChanged()
    }

}
