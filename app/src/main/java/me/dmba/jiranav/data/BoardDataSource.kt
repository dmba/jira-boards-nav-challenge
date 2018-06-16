package me.dmba.jiranav.data

import io.reactivex.Observable
import me.dmba.jiranav.data.model.Board
import me.dmba.jiranav.data.model.Column

/**
 * Created by dmba on 6/13/18.
 */
interface BoardDataSource {

    fun getBoard(): Observable<Board>

    fun getBoardColumns(): Observable<List<Column>>

}

