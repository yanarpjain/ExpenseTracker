package com.gamefolio.expensetracker

import android.app.Application
import com.gamefolio.expensetracker.di.repositoryModule
import com.gamefolio.expensetracker.di.singleToneModule
import com.gamefolio.expensetracker.di.viewModelModule
import org.koin.android.ext.koin.androidContext
import org.koin.core.context.startKoin

class MyApplication : Application() {
    override fun onCreate() {
        super.onCreate()
        //koin DI++
        val modulesList = listOf(singleToneModule, repositoryModule, viewModelModule)
        startKoin {
            androidContext(this@MyApplication)//private val context: Context by inject() in view model
            modules(modulesList)
        }
        //koin DI--
    }
}