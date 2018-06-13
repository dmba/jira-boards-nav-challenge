package me.dmba.jiranav.ui.adapter

import android.support.v7.widget.RecyclerView.ViewHolder
import android.view.LayoutInflater
import android.view.ViewGroup
import android.widget.TextView
import me.dmba.jiranav.R
import me.dmba.jiranav.data.model.Task
import javax.inject.Inject

/**
 * Created by dmba on 6/13/18.
 */
class TaskViewHolder @Inject constructor(

    inflater: LayoutInflater,

    parent: ViewGroup

) : ViewHolder(inflater.inflate(R.layout.card_task_item, parent, false)) {

    private val taskTitle by lazy { itemView.findViewById(R.id.taskTitle) as TextView }
    private val taskDescription by lazy { itemView.findViewById(R.id.taskDescription) as TextView }

    fun bindModel(task: Task) {
        taskTitle.text = task.title
        taskDescription.text = task.id
    }

}
