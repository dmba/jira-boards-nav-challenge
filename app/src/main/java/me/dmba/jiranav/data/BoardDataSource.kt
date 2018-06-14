package me.dmba.jiranav.data

import me.dmba.jiranav.data.model.Board

/**
 * Created by dmba on 6/13/18.
 */
interface BoardDataSource {

    fun getBoard(): Board

}

