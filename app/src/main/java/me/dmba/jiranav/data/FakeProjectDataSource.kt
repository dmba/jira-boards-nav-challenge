package me.dmba.jiranav.data

import me.dmba.jiranav.data.model.Project
import me.dmba.jiranav.data.model.Task
import me.dmba.jiranav.util.randomId
import javax.inject.Inject

/**
 * Created by dmba on 6/13/18.
 */
class FakeProjectDataSource @Inject constructor() : ProjectDataSource {

    private val fakeProject: Project by lazy {
        Project(
            id = randomId(),
            tasks = (0..13).map {
                Task(
                    id = randomId(),
                    title = "#$it Complete Jira nav challenge"
                )
            }
        )
    }

    override fun getProject(): Project = fakeProject

}
