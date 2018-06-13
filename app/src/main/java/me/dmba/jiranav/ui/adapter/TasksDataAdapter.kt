package me.dmba.jiranav.ui.adapter

import android.support.v7.widget.RecyclerView.Adapter
import android.view.LayoutInflater
import android.view.ViewGroup
import me.dmba.jiranav.data.model.Task
import javax.inject.Inject

/**
 * Created by dmba on 6/13/18.
 */
class TasksDataAdapter @Inject constructor(

    private val inflater: LayoutInflater

) : Adapter<TaskViewHolder>() {

    private val tasks: MutableList<Task> = mutableListOf()

    override fun getItemCount(): Int = tasks.size

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): TaskViewHolder {
        return TaskViewHolder(inflater, parent)
    }

    override fun onBindViewHolder(holder: TaskViewHolder, position: Int) {
        holder.bindModel(tasks[position])
    }

    fun updateTasks(newTasks: List<Task>) {
        tasks.clear()
        tasks.addAll(newTasks)
        notifyDataSetChanged()
    }

}
