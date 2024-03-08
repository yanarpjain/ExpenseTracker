package com.gamefolio.expensetracker.room.entity

import androidx.annotation.Keep
import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey
import org.jetbrains.annotations.NotNull

@Keep
@Entity(tableName = "entries")
data class EntityEntries(
    @PrimaryKey(autoGenerate = true)
    @NotNull
    @ColumnInfo(name = "entryId") val entryId: Int,

    @ColumnInfo(name = "currencyId") val currencyId: Int? = null,
    @ColumnInfo(name = "bankId") val bankId: Int? = null,
    @ColumnInfo(name = "isIncome") val isIncome: Boolean? = null,
    @ColumnInfo(name = "amount") val amount: Double? = null,
    @ColumnInfo(name = "dateTime") val dateTime: String? = null,
)
