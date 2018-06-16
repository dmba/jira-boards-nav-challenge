package me.dmba.jiranav.base.adapter

import android.support.annotation.LayoutRes
import android.support.v7.widget.RecyclerView
import android.view.ViewGroup
import me.dmba.jiranav.base.extensions.inflate

/**
 * Created by dmba on 6/15/18.
 */
abstract class BaseViewHolder<T>(

    @LayoutRes layoutRes: Int,

    parent: ViewGroup

) : RecyclerView.ViewHolder(parent.inflate(layoutRes)) {

    abstract fun bind(model: T)

}
