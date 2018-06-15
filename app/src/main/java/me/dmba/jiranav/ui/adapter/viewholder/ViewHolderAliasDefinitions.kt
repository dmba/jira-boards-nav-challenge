package me.dmba.jiranav.ui.adapter.viewholder

import me.dmba.jiranav.base.adapter.BaseViewHolder
import me.dmba.jiranav.base.adapter.BaseViewHolderFactories
import me.dmba.jiranav.base.adapter.BaseViewHolderFactory
import me.dmba.jiranav.data.model.Column
import me.dmba.jiranav.data.model.Task

/**
 * ColumnViewHolder
 */
typealias ColumnViewHolder = BaseViewHolder<Column>

/**
 * ColumnViewHolderFactory
 */
interface ColumnViewHolderFactory : BaseViewHolderFactory<ColumnViewHolder>

/**
 * ColumnViewHolderFactories
 */
typealias ColumnViewHolderFactories = BaseViewHolderFactories<ColumnViewHolderFactory>

/**
 * TaskViewHolder
 */
typealias TaskViewHolder = BaseViewHolder<Task>

/**
 * TaskViewHolderFactory
 */
interface TaskViewHolderFactory : BaseViewHolderFactory<TaskViewHolder>

/**
 * TaskViewHolderFactories
 */
typealias TaskViewHolderFactories = BaseViewHolderFactories<TaskViewHolderFactory>
