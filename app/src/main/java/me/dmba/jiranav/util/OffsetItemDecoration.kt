package me.dmba.jiranav.util

import android.graphics.Rect
import android.support.v7.widget.RecyclerView
import android.view.View

/**
 * Created by dmba on 6/13/18.
 */
class OffsetItemDecoration(

    private val offset: Int

) : RecyclerView.ItemDecoration() {

    override fun getItemOffsets(outRect: Rect, view: View, parent: RecyclerView, state: RecyclerView.State) {
        super.getItemOffsets(outRect, view, parent, state)
        outRect.set(offset, offset, offset, 0)

        val params = view.layoutParams as RecyclerView.LayoutParams

        val isLastItem = params.viewAdapterPosition == state.itemCount - 1

        outRect.set(offset, offset, offset, if (isLastItem) offset else 0)
    }

}
