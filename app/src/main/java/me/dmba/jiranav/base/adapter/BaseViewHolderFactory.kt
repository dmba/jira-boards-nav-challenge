package me.dmba.jiranav.base.adapter

import android.view.ViewGroup

/**
 *
 */
typealias BaseViewHolderFactories<VHF> = Map<Int, @JvmSuppressWildcards VHF>

/**
 *
 */
interface BaseViewHolderFactory<VH> {

    fun create(parent: ViewGroup): VH

}
