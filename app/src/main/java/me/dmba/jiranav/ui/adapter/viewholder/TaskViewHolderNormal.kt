package me.dmba.jiranav.ui.adapter.viewholder

import android.view.ViewGroup
import com.google.auto.factory.AutoFactory
import kotlinx.android.synthetic.main.card_task_item.view.*
import me.dmba.jiranav.R
import me.dmba.jiranav.data.model.Task

/**
 * Created by dmba on 6/13/18.
 */
@AutoFactory(
    implementing = [
        TaskViewHolderFactory::class
    ]
)
class TaskViewHolderNormal(

    parent: ViewGroup

) : TaskViewHolder(R.layout.card_task_item, parent) {

    override fun bind(model: Task) {
        itemView.apply {
            taskTitle.text = model.title
            taskDescription.text = model.id
        }
    }

}
