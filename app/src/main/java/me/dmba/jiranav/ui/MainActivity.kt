package me.dmba.jiranav.ui

import android.os.Bundle
import android.support.v7.widget.LinearLayoutManager
import android.support.v7.widget.LinearLayoutManager.HORIZONTAL
import cz.intik.overflowindicator.SimpleSnapHelper
import io.reactivex.android.schedulers.AndroidSchedulers.mainThread
import io.reactivex.schedulers.Schedulers.io
import kotlinx.android.synthetic.main.activity_main.*
import me.dmba.jiranav.R
import me.dmba.jiranav.base.BaseActivity
import me.dmba.jiranav.base.decoration.OffsetItemDecoration
import me.dmba.jiranav.base.extensions.plusAssign
import me.dmba.jiranav.data.BoardDataSource
import me.dmba.jiranav.ui.adapter.ColumnsAdapter
import javax.inject.Inject

/**
 * Created by dmba on 6/13/18.
 */
class MainActivity : BaseActivity() {

    @Inject
    lateinit var dataSource: BoardDataSource

    @Inject
    lateinit var columnsAdapter: ColumnsAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        setupRecyclerView()
        loadData()
    }

    private fun setupRecyclerView() = recyclerView.apply {
        adapter = columnsAdapter
        layoutManager = LinearLayoutManager(context, HORIZONTAL, false)
        setHasFixedSize(true)
        addItemDecoration(OffsetItemDecoration(8))
        SimpleSnapHelper(pagerIndicator).attachToRecyclerView(this)
        pagerIndicator.attachToRecyclerView(this)
    }

    private fun loadData() {
        disposables += dataSource.getBoardColumns()
            .subscribeOn(io())
            .observeOn(mainThread())
            .subscribe(columnsAdapter::update)
    }

}
