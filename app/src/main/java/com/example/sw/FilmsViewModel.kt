package com.example.sw

import android.app.Application
import android.util.Log
import androidx.lifecycle.AndroidViewModel
import com.example.sw.api.ApiFactory
import com.example.sw.database.AppDataBase
import io.reactivex.android.schedulers.AndroidSchedulers
import io.reactivex.disposables.CompositeDisposable
import io.reactivex.schedulers.Schedulers

class FilmsViewModel(application: Application) : AndroidViewModel(application) {
    private val db = AppDataBase.getInstance(application)
    private val compositeDisposable = CompositeDisposable()
    val films = db.personInfoDao().getOneFilm()

    fun loadData() {
        val disposable = ApiFactory.apiService.getFilm(1)
            .subscribeOn(Schedulers.io())
            .observeOn(AndroidSchedulers.mainThread())
            .subscribe({
                Log.d("TEST OF LOADING DATA_S ", it.toString())
            }, {
                Log.d("TEST OF LOADING DATA_F", it.message.toString())
            })
        compositeDisposable.add(disposable)
    }


    override fun onCleared() {
        super.onCleared()
        compositeDisposable.dispose()
    }


}