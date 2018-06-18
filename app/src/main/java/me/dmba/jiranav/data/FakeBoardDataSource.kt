package me.dmba.jiranav.data

import io.reactivex.Observable
import me.dmba.jiranav.base.extensions.md5
import me.dmba.jiranav.base.util.randomId
import me.dmba.jiranav.data.model.Board
import me.dmba.jiranav.data.model.Card
import me.dmba.jiranav.data.model.Column
import javax.inject.Inject

/**
 * Created by dmba on 6/13/18.
 */
class FakeBoardDataSource @Inject constructor() : BoardDataSource {

    private val identiconsApiUrl = "http://identicon-1132.appspot.com"

    private val fakeColumns: List<Column> by lazy {
        listOf(
            Column(
                id = randomId(),
                title = "To Do",
                cards = (0..7).map {
                    Card(
                        id = randomId(),
                        title = "#$it [To Do] Complete Jira nav challenge",
                        userLogoUrl = "$identiconsApiUrl/${randomId().md5()}"
                    )
                }
            ),
            Column(
                id = randomId(),
                title = "In Progress",
                cards = (0..4).map {
                    Card(
                        id = randomId(),
                        title = "#$it [In Progress] Complete Jira nav challenge",
                        userLogoUrl = "$identiconsApiUrl/${randomId().md5()}"
                    )
                }
            ),
            Column(
                id = randomId(),
                title = "Verify",
                cards = (0..13).map {
                    Card(
                        id = randomId(),
                        title = "#$it [Verify] Complete Jira nav challenge",
                        userLogoUrl = "$identiconsApiUrl/${randomId().md5()}"
                    )
                }
            ),
            Column(
                id = randomId(),
                title = "Done",
                cards = (0..5).map {
                    Card(
                        id = randomId(),
                        title = "#$it [Done] Complete Jira nav challenge",
                        userLogoUrl = "$identiconsApiUrl/${randomId().md5()}"
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

    override fun getBoard(): Observable<Board> = Observable.just(fakeBoard)

    override fun getBoardColumns(): Observable<List<Column>> = getBoard().map { it.columns }

}
