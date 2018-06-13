package me.dmba.jiranav.ui.adapter.viewholder.factory

import android.view.ViewGroup
import me.dmba.jiranav.ui.adapter.viewholder.ColumnViewHolder

/**
 * Created by dmba on 6/14/18.
 */
interface ColumnViewHolderFactory {

    fun createViewHolder(parent: ViewGroup): ColumnViewHolder

}
