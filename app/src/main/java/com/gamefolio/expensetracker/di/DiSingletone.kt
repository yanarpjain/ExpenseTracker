package com.gamefolio.expensetracker.di

import androidx.room.Room
import com.gamefolio.expensetracker.room.RoomDb
import org.koin.android.ext.koin.androidContext
import org.koin.dsl.module

val singleToneModule = module {
    single {
        Room.databaseBuilder(
            androidContext(),
            RoomDb::class.java,
            "expense"
        ).fallbackToDestructiveMigration() //if version change it will clear all tables;
            .build()
    }
}