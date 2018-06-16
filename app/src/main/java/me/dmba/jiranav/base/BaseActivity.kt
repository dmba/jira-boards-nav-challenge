package me.dmba.jiranav.base

import dagger.android.support.DaggerAppCompatActivity
import io.reactivex.disposables.CompositeDisposable

/**
 * Created by dmba on 6/16/18.
 */
abstract class BaseActivity : DaggerAppCompatActivity() {

    protected val disposables = CompositeDisposable()

    override fun onDestroy() {
        super.onDestroy()
        disposables.dispose()
    }

}
