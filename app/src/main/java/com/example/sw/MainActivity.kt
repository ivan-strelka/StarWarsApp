package com.example.sw

import android.os.Bundle
import android.util.Log
import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.ViewModelProvider
import com.example.sw.FilmsViewModel
import com.example.sw.api.ApiFactory
import com.example.sw.R
import io.reactivex.android.schedulers.AndroidSchedulers
import io.reactivex.disposables.CompositeDisposable
import io.reactivex.schedulers.Schedulers

class MainActivity : AppCompatActivity() {

    //    private lateinit var viewModel: PersonViewModel
    private lateinit var filmsViewModel: FilmsViewModel

//    private val compositeDisposable = CompositeDisposable()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        filmsViewModel = ViewModelProvider(this)[FilmsViewModel::class.java]
        filmsViewModel.loadData()


//        val disposable =   ApiFactory.apiService.getAllFilms()
//            .subscribeOn(Schedulers.io())
//            .observeOn(AndroidSchedulers.mainThread())
//            .subscribe({
//                Log.d("TEST OF LOADING DATA_S ", it.toString())
//            }, {
//                Log.d("TEST OF LOADING DATA_F", it.message.toString())
//            })
//        compositeDisposable.add(disposable)


//        viewModel = ViewModelProvider(this)[PersonViewModel::class.java]
//        viewModel.loadData()

    }

//    override fun onDestroy() {
//        super.onDestroy()
//        compositeDisposable.dispose()
//    }
}