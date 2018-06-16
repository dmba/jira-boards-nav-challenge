package me.dmba.jiranav.ui.adapter

import me.dmba.jiranav.base.adapter.BaseAdapter
import me.dmba.jiranav.data.model.Column
import me.dmba.jiranav.ui.adapter.viewholder.ColumnType
import me.dmba.jiranav.ui.adapter.viewholder.ColumnViewHolderFactories
import javax.inject.Inject

/**
 * Created by dmba on 6/14/18.
 */
class ColumnsAdapter @Inject constructor(

    factories: ColumnViewHolderFactories

) : BaseAdapter<Column>(factories) {

    override fun getItemViewType(position: Int) = ColumnType.NORMAL

}
