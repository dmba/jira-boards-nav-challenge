package me.dmba.jiranav.ui

import android.os.Bundle
import android.util.Log
import dagger.android.support.DaggerAppCompatActivity
import me.dmba.jiranav.R
import me.dmba.jiranav.data.ProjectDataSource
import javax.inject.Inject

class MainActivity : DaggerAppCompatActivity() {

    @Inject
    lateinit var dataSource: ProjectDataSource

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        dataSource.getProject().tasks.forEachIndexed { index, task ->
            Log.i("APP", "$index -> $task")
        }
    }

}
