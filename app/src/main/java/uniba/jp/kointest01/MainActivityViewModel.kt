package uniba.jp.kointest01

import androidx.lifecycle.LifecycleObserver
import androidx.lifecycle.ViewModel
import timber.log.Timber


class MainActivityViewModel(private val repo : HelloRepository) : ViewModel(), LifecycleObserver {

    fun onClick(): String {
        return repo.giveHello()
    }

}