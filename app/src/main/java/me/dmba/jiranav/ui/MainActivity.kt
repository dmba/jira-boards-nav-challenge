package me.dmba.jiranav.ui

import android.os.Bundle
import android.support.v7.widget.LinearLayoutManager
import dagger.android.support.DaggerAppCompatActivity
import kotlinx.android.synthetic.main.activity_main.*
import me.dmba.jiranav.R
import me.dmba.jiranav.data.ProjectDataSource
import me.dmba.jiranav.ui.adapter.TasksDataAdapter
import me.dmba.jiranav.util.OffsetItemDecoration
import javax.inject.Inject

/**
 * Created by dmba on 6/13/18.
 */
class MainActivity : DaggerAppCompatActivity() {

    @Inject
    lateinit var dataSource: ProjectDataSource

    @Inject
    lateinit var tasksAdapter: TasksDataAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        setupRecyclerView()
        tasksAdapter.updateTasks(dataSource.getProject().tasks)
    }

    private fun setupRecyclerView() = recyclerView.apply {
        adapter = tasksAdapter
        layoutManager = LinearLayoutManager(context)
        setHasFixedSize(true)
        addItemDecoration(OffsetItemDecoration(8))
    }

}
