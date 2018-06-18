package me.dmba.jiranav.ui.adapter.viewholder

import android.view.ViewGroup
import com.google.auto.factory.AutoFactory
import com.google.auto.factory.Provided
import com.squareup.picasso.Picasso
import kotlinx.android.synthetic.main.view_item_card.view.*
import me.dmba.jiranav.R
import me.dmba.jiranav.data.model.Card

/**
 * Created by dmba on 6/13/18.
 */
@AutoFactory(
    implementing = [
        CardViewHolderFactory::class
    ]
)
class CardViewHolderNormal(

    @Provided private val picasso: Picasso,

    parent: ViewGroup

) : CardViewHolder(R.layout.view_item_card, parent) {

    override fun bind(model: Card) {
        itemView.apply {
            title.text = model.title
            description.text = model.id

            picasso
                .load(model.userLogoUrl)
                .into(userLogo)
        }
    }

}
