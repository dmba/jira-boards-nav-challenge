package me.dmba.jiranav.ui.adapter.viewholder

import android.view.View
import android.view.ViewGroup
import com.google.auto.factory.AutoFactory
import kotlinx.android.synthetic.main.card_task_item.view.*
import me.dmba.jiranav.R
import me.dmba.jiranav.data.model.Task
import me.dmba.jiranav.ui.adapter.viewholder.factory.TaskViewHolderFactory

/**
 * Created by dmba on 6/13/18.
 */

const val TYPE_TASK_NORMAL = 0

@AutoFactory(
    implementing = [
        TaskViewHolderFactory::class
    ]
)
class TaskViewHolderNormal(

    parent: ViewGroup

) : TaskViewHolder(R.layout.card_task_item, parent) {

    override fun bind(task: Task): View = itemView.apply {
        taskTitle.text = task.title
        taskDescription.text = task.id
    }

}
