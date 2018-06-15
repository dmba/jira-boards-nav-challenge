package me.dmba.jiranav.ui.adapter.viewholder

import me.dmba.jiranav.base.adapter.BaseViewHolder
import me.dmba.jiranav.base.adapter.BaseViewHolderFactories
import me.dmba.jiranav.base.adapter.BaseViewHolderFactory
import me.dmba.jiranav.data.model.Card
import me.dmba.jiranav.data.model.Column

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
 * CardViewHolder
 */
typealias CardViewHolder = BaseViewHolder<Card>

/**
 * CardViewHolderFactory
 */
interface CardViewHolderFactory : BaseViewHolderFactory<CardViewHolder>

/**
 * CardViewHolderFactories
 */
typealias CardViewHolderFactories = BaseViewHolderFactories<CardViewHolderFactory>
