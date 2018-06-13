package me.dmba.jiranav.data

import me.dmba.jiranav.data.model.Board
import me.dmba.jiranav.data.model.Column
import me.dmba.jiranav.data.model.Task
import me.dmba.jiranav.util.randomId
import javax.inject.Inject

/**
 * Created by dmba on 6/13/18.
 */
class FakeBoardDataSource @Inject constructor() : BoardDataSource {

    private val fakeColumns: List<Column> by lazy {
        listOf(
            Column(
                id = randomId(),
                title = "To Do",
                tasks = (0..7).map {
                    Task(
                        id = randomId(),
                        title = "#$it [To Do] Complete Jira nav challenge"
                    )
                }
            ),
            Column(
                id = randomId(),
                title = "In Progress",
                tasks = (0..4).map {
                    Task(
                        id = randomId(),
                        title = "#$it [In Progress] Complete Jira nav challenge"
                    )
                }
            ),
            Column(
                id = randomId(),
                title = "Verify",
                tasks = (0..13).map {
                    Task(
                        id = randomId(),
                        title = "#$it [Verify] Complete Jira nav challenge"
                    )
                }
            ),
            Column(
                id = randomId(),
                title = "Done",
                tasks = (0..5).map {
                    Task(
                        id = randomId(),
                        title = "#$it [Done] Complete Jira nav challenge"
                    )
                }
            )
        )
    }

    private val fakeBoard: Board by lazy {
        Board(
            id = randomId(),
            columns = fakeColumns
        )
    }

    override fun getBoard(): Board = fakeBoard

}
