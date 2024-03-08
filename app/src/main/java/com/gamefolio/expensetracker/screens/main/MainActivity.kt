package com.gamefolio.expensetracker.screens.main

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.gamefolio.expensetracker.R
import com.gamefolio.expensetracker.room.RoomDb
import org.koin.android.ext.android.inject

class MainActivity : AppCompatActivity() {

    private val roomDb: RoomDb by inject()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }
}