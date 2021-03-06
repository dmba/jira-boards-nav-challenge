package me.dmba.jiranav.ui.adapter.viewholder

import android.support.v7.widget.LinearLayoutManager
import android.support.v7.widget.RecyclerView.RecycledViewPool
import android.support.v7.widget.helper.ItemTouchHelper
import android.view.ViewGroup
import com.google.auto.factory.AutoFactory
import com.google.auto.factory.Provided
import kotlinx.android.synthetic.main.view_item_column.view.*
import me.dmba.jiranav.R
import me.dmba.jiranav.base.decoration.OffsetItemDecoration
import me.dmba.jiranav.base.recycler.SimpleItemTouchHelperCallback
import me.dmba.jiranav.data.model.Column
import me.dmba.jiranav.ui.adapter.CardsAdapter

/**
 * Created by dmba on 6/14/18.
 */
@AutoFactory(
    implementing = [
        ColumnViewHolderFactory::class
    ]
)
class ColumnViewHolderNormal(

    @Provided private val tasksAdapter: CardsAdapter,

    @Provided private val sharedRecycledViewPool: RecycledViewPool,

    parent: ViewGroup

) : ColumnViewHolder(R.layout.view_item_column, parent) {

    init {
        itemView.recyclerView.apply {
            adapter = tasksAdapter
            recycledViewPool = sharedRecycledViewPool
            layoutManager = LinearLayoutManager(context)
            setHasFixedSize(true)
            addItemDecoration(OffsetItemDecoration(8))
            ItemTouchHelper(SimpleItemTouchHelperCallback(tasksAdapter)).attachToRecyclerView(this)
        }
    }

    override fun bind(model: Column) {
        itemView.title.text = model.title
        tasksAdapter.update(model.cards)
    }

}
