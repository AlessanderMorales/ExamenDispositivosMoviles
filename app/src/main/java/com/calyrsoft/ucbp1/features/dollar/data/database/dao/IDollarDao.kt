package com.calyrsoft.ucbp1.features.dollar.data.database.dao

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import com.calyrsoft.ucbp1.features.dollar.data.database.entity.DollarEntity

interface IDollarDao {

    @Query("SELECT * FROM dollars")
    suspend fun getList(): List<DollarEntity>

    @Insert(onConflict = OnConflictStrategy.IGNORE)
    suspend fun insert(dollar: DollarEntity)

    @Insert(onConflict = OnConflictStrategy.IGNORE)
    suspend fun insertDollars(lists: List<DollarEntity>)

    @Query("DELETE FROM dollars")
    suspend fun deleteAll()

    @Query("SELECT * FROM dollars ORDER BY timestamp DESC")
    suspend fun getAllOrderedByDate(): List<DollarEntity>

    @Query("DELETE FROM dollars WHERE id = :id")
    suspend fun deleteById(id: Int)
}