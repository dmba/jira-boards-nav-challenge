package me.dmba.jiranav.ui.adapter.viewholder

import android.support.annotation.LayoutRes
import android.support.v7.widget.RecyclerView.ViewHolder
import android.view.ViewGroup
import me.dmba.jiranav.data.model.Column
import me.dmba.jiranav.util.inflate

/**
 * Created by dmba on 6/14/18.
 */
abstract class ColumnViewHolder(

    @LayoutRes layoutRes: Int,

    parent: ViewGroup

) : ViewHolder(parent.inflate(layoutRes)) {

    abstract fun bind(column: Column)

}
