package me.dmba.jiranav.ui.adapter.viewholder

import android.view.LayoutInflater
import android.view.ViewGroup
import android.widget.TextView
import com.google.auto.factory.AutoFactory
import com.google.auto.factory.Provided
import me.dmba.jiranav.R
import me.dmba.jiranav.data.model.Task
import me.dmba.jiranav.ui.adapter.viewholder.factory.TaskViewHolderFactory

/**
 * Created by dmba on 6/13/18.
 */

const val TYPE_NORMAL = 0

@AutoFactory(
    implementing = [
        TaskViewHolderFactory::class
    ]
)
class TaskViewHolderNormal(

    @Provided inflater: LayoutInflater,

    parent: ViewGroup

) : TaskViewHolder(R.layout.card_task_item, inflater, parent) {

    private val taskTitle by lazy { itemView.findViewById(R.id.taskTitle) as TextView }
    private val taskDescription by lazy { itemView.findViewById(R.id.taskDescription) as TextView }

    override fun bind(task: Task) {
        taskTitle.text = task.title
        taskDescription.text = task.id
    }

}
