package me.dmba.jiranav.ui

import android.os.Bundle
import android.support.v7.widget.LinearLayoutManager
import android.support.v7.widget.LinearLayoutManager.HORIZONTAL
import android.support.v7.widget.PagerSnapHelper
import dagger.android.support.DaggerAppCompatActivity
import kotlinx.android.synthetic.main.activity_main.*
import me.dmba.jiranav.R
import me.dmba.jiranav.data.BoardDataSource
import me.dmba.jiranav.ui.adapter.ColumnsAdapter
import me.dmba.jiranav.util.OffsetItemDecoration
import javax.inject.Inject

/**
 * Created by dmba on 6/13/18.
 */
class MainActivity : DaggerAppCompatActivity() {

    @Inject
    lateinit var dataSource: BoardDataSource

    @Inject
    lateinit var columnsAdapter: ColumnsAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        setupRecyclerView()
        columnsAdapter.updateColumns(dataSource.getBoard().columns)
    }

    private fun setupRecyclerView() = recyclerView.apply {
        adapter = columnsAdapter
        layoutManager = LinearLayoutManager(context, HORIZONTAL, false)
        setHasFixedSize(true)
        addItemDecoration(OffsetItemDecoration(8))
        PagerSnapHelper().attachToRecyclerView(this)
    }

}
