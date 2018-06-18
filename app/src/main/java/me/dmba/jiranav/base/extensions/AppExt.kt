package me.dmba.jiranav.base.extensions

import android.support.annotation.LayoutRes
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import io.reactivex.Observable
import io.reactivex.android.schedulers.AndroidSchedulers.mainThread
import io.reactivex.disposables.Disposable
import io.reactivex.internal.disposables.DisposableContainer
import io.reactivex.schedulers.Schedulers.io
import java.security.MessageDigest

/**
 * Used to inflate the view from parent view group
 */
fun ViewGroup.inflate(@LayoutRes layoutRes: Int, attachToRoot: Boolean = false): View {
    return LayoutInflater.from(context).inflate(layoutRes, this, attachToRoot)
}

/**
 * Observable operator for app default subscribe/observe operations
 */
fun <T> Observable<T>.withDefaults(): Observable<T> {
    return subscribeOn(io()).observeOn(mainThread())
}

/**
 * Plus-assign operator for disposable container
 */
operator fun DisposableContainer.plusAssign(disposable: Disposable) {
    add(disposable)
}

fun String.md5(): String {
    val md = MessageDigest.getInstance("MD5")
    val digested = md.digest(toByteArray())
    return digested.joinToString("") { String.format("%02x", it) }
}
