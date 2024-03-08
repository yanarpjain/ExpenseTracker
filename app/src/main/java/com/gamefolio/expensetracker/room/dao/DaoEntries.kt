package com.gamefolio.expensetracker.room.dao

import androidx.room.Dao
import androidx.room.Query
import com.gamefolio.expensetracker.room.entity.EntityEntries

@Dao
interface DaoEntries {
    @Query("SELECT * FROM entries")
    fun getAll(): List<EntityEntries>

//    @Insert
//    suspend fun insertAll(listEntityCargo: List<EntityCargo>)
//
//	@Insert(onConflict = OnConflictStrategy.IGNORE) //<==don't insert duplicate id
//    suspend fun insertCargo(cargo: EntityCargo)
//
//    @Delete
//    suspend fun delete(user: EntityCargo)
//
//    @Query("DELETE FROM cargo")
//    suspend fun deleteAllCargo()
//
//	//no of rows
//    @Query("SELECT COUNT(cargoSeqNo) FROM getCargo")
//    suspend fun getCount(): Integer
}