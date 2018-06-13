package me.dmba.jiranav.data

import me.dmba.jiranav.data.model.Board
import me.dmba.jiranav.data.model.Task
import me.dmba.jiranav.util.randomId
import javax.inject.Inject

/**
 * Created by dmba on 6/13/18.
 */
class FakeBoardDataSource @Inject constructor() : BoardDataSource {

    private val fakeProject: Board by lazy {
        Board(
            id = randomId(),
            columns = (0..13).map {
                Task(
                    id = randomId(),
                    title = "#$it Complete Jira nav challenge"
                )
            }
        )
    }

    override fun getBoard(): Board = fakeProject

}
