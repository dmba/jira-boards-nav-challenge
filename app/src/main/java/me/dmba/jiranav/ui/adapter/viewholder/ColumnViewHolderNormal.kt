package me.dmba.jiranav.ui.adapter.viewholder

import android.support.v7.widget.LinearLayoutManager
import android.support.v7.widget.RecyclerView.RecycledViewPool
import android.view.ViewGroup
import com.google.auto.factory.AutoFactory
import com.google.auto.factory.Provided
import kotlinx.android.synthetic.main.card_column_item.view.*
import me.dmba.jiranav.R
import me.dmba.jiranav.base.decoration.OffsetItemDecoration
import me.dmba.jiranav.data.model.Column
import me.dmba.jiranav.ui.adapter.TasksAdapter

/**
 * Created by dmba on 6/14/18.
 */
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

    override fun bind(model: Column) {
        itemView.columnTitle.text = model.title
        tasksAdapter.update(model.tasks)
    }

}
