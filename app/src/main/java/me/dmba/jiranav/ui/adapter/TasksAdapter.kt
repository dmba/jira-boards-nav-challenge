package me.dmba.jiranav.ui.adapter

import me.dmba.jiranav.base.adapter.BaseAdapter
import me.dmba.jiranav.data.model.Task
import me.dmba.jiranav.ui.adapter.viewholder.TaskType
import me.dmba.jiranav.ui.adapter.viewholder.TaskViewHolderFactories
import javax.inject.Inject

/**
 * Created by dmba on 6/13/18.
 */
class TasksAdapter @Inject constructor(

    factories: TaskViewHolderFactories

) : BaseAdapter<Task>(factories) {

    override fun getItemViewType(position: Int) = TaskType.NORMAL

}
