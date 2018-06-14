package me.dmba.jiranav.ui.adapter.viewholder

import android.support.v7.widget.LinearLayoutManager
import android.support.v7.widget.RecyclerView.RecycledViewPool
import android.view.ViewGroup
import com.google.auto.factory.AutoFactory
import com.google.auto.factory.Provided
import kotlinx.android.synthetic.main.card_column_item.view.*
import me.dmba.jiranav.R
import me.dmba.jiranav.data.model.Column
import me.dmba.jiranav.ui.adapter.TasksAdapter
import me.dmba.jiranav.ui.adapter.viewholder.factory.ColumnViewHolderFactory
import me.dmba.jiranav.util.OffsetItemDecoration

/**
 * Created by dmba on 6/14/18.
 */

const val TYPE_COLUMN_NORMAL = 0

@AutoFactory(
    implementing = [
        ColumnViewHolderFactory::class
    ]
)
class ColumnViewHolderNormal(

    @Provided private val tasksAdapter: TasksAdapter,

    @Provided private val sharedRecycledViewPool: RecycledViewPool,

    parent: ViewGroup

) : ColumnViewHolder(R.layout.card_column_item, parent) {

    init {
        itemView.recyclerView.apply {
            adapter = tasksAdapter
            recycledViewPool = sharedRecycledViewPool
            layoutManager = LinearLayoutManager(context)
            setHasFixedSize(true)
            addItemDecoration(OffsetItemDecoration(8))
        }
    }

    override fun bind(column: Column) {
        itemView.columnTitle.text = column.title
        tasksAdapter.updateTasks(column.tasks)
    }

}
