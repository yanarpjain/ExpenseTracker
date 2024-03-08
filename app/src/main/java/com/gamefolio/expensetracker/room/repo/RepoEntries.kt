package com.gamefolio.expensetracker.room.repo

import com.gamefolio.expensetracker.room.dao.DaoEntries
import com.gamefolio.expensetracker.room.entity.EntityEntries

class RepoEntries(private val daoEntries: DaoEntries) {

    suspend fun getAllEntries(): List<EntityEntries> {
        return daoEntries.getAll()
    }
}