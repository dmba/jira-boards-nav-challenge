package me.dmba.jiranav.data

import me.dmba.jiranav.data.model.Project

/**
 * Created by dmba on 6/13/18.
 */
interface ProjectDataSource {

    fun getProject(): Project

}

