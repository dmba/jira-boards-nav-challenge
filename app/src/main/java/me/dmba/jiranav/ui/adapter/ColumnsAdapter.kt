package me.dmba.jiranav.ui.adapter

import android.support.v7.widget.RecyclerView.Adapter
import android.view.ViewGroup
import me.dmba.jiranav.data.model.Column
import me.dmba.jiranav.ui.adapter.viewholder.ColumnViewHolder
import me.dmba.jiranav.ui.adapter.viewholder.TYPE_COLUMN_NORMAL
import me.dmba.jiranav.ui.adapter.viewholder.factory.ColumnViewHolderFactories
import javax.inject.Inject

/**
 * Created by dmba on 6/14/18.
 */
class ColumnsAdapter @Inject constructor(

    private val viewHolderFactories: ColumnViewHolderFactories

) : Adapter<ColumnViewHolder>() {

    private val columns: MutableList<Column> = mutableListOf()

    override fun getItemCount(): Int = columns.size

    override fun getItemViewType(position: Int): Int = TYPE_COLUMN_NORMAL

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ColumnViewHolder {
        return viewHolderFactories[viewType]!!.createViewHolder(parent)
    }

    override fun onBindViewHolder(holder: ColumnViewHolder, position: Int) {
        holder.bind(columns[position])
    }

    fun updateColumns(newColumns: List<Column>) {
        columns.clear()
        columns.addAll(newColumns)
        notifyDataSetChanged()
    }

}
