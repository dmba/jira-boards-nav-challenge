package me.dmba.jiranav.data.model

/**
 * Created by dmba on 6/14/18.
 */
data class Column(

    val id: String,

    val name: String,

    val tasks: List<Task>

)
