package com.gamefolio.expensetracker.dataStore

import android.content.Context
import androidx.datastore.core.DataStore
import androidx.datastore.preferences.core.Preferences
import androidx.datastore.preferences.core.booleanPreferencesKey
import androidx.datastore.preferences.core.edit
import androidx.datastore.preferences.preferencesDataStore
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.map

object ObjDataStore {
    private val Context.dataStore: DataStore<Preferences> by preferencesDataStore(name = "settings")

    private val IS_CURRENCY_SELECTED_KEY = booleanPreferencesKey("is_currency_selected")
    suspend fun isCurrencySelected(context: Context): Flow<Boolean> {
        return context.dataStore.data.map { preferences ->
            preferences[IS_CURRENCY_SELECTED_KEY] ?: false
        }
    }

    suspend fun setIsCurrencySelected(context: Context, isSelected: Boolean) {
        context.dataStore.edit { preferences ->
            preferences[IS_CURRENCY_SELECTED_KEY] = isSelected
        }
    }

}