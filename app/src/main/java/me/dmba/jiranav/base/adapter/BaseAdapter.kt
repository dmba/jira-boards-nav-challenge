package me.dmba.jiranav.base.adapter

import android.support.v7.widget.RecyclerView
import android.view.ViewGroup

/**
 *
 */
abstract class BaseAdapter<T>(

    private val factories: BaseViewHolderFactories<BaseViewHolderFactory<BaseViewHolder<T>>>

) : RecyclerView.Adapter<BaseViewHolder<T>>() {

    protected val data: MutableList<T> = mutableListOf()

    override fun getItemCount() = data.size

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int) = factories[viewType]!!.create(parent)

    override fun onBindViewHolder(holder: BaseViewHolder<T>, position: Int) = holder.bind(data[position])

    fun update(newColumns: List<T>) {
        data.clear()
        data.addAll(newColumns)
        notifyDataSetChanged()
    }

}
