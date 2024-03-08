package com.gamefolio.expensetracker.room

import androidx.room.Database
import androidx.room.RoomDatabase
import com.gamefolio.expensetracker.room.dao.DaoEntries
import com.gamefolio.expensetracker.room.entity.EntityEntries

@Database(entities = [EntityEntries::class], version = 1, exportSchema = false)
abstract class RoomDb : RoomDatabase() {
    abstract fun daoEntries(): DaoEntries
}