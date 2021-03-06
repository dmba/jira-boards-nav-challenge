package me.dmba.jiranav.ui.adapter

import me.dmba.jiranav.base.adapter.BaseAdapter
import me.dmba.jiranav.base.recycler.ItemTouchHelperAdapter
import me.dmba.jiranav.data.model.Card
import me.dmba.jiranav.ui.adapter.viewholder.CardType
import me.dmba.jiranav.ui.adapter.viewholder.CardViewHolderFactories
import javax.inject.Inject

/**
 * Created by dmba on 6/13/18.
 */
class CardsAdapter @Inject constructor(

    factories: CardViewHolderFactories

) : BaseAdapter<Card>(factories), ItemTouchHelperAdapter {

    override fun getItemViewType(position: Int) = CardType.NORMAL

    override fun onItemMove(fromPosition: Int, toPosition: Int) {
        val prev = data.removeAt(fromPosition)
        data.add(toPosition, prev)
        notifyItemMoved(fromPosition, toPosition)
    }

}
