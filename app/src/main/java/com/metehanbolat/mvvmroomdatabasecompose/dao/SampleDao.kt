package com.metehanbolat.mvvmroomdatabasecompose.dao

import androidx.lifecycle.LiveData
import androidx.room.*
import com.metehanbolat.mvvmroomdatabasecompose.entity.SampleEntity

@Dao
interface SampleDao {

    @Query("SELECT * FROM SampleData")
    fun getAllData(): LiveData<List<SampleEntity>>

    @Insert
    suspend fun insert(item: List<SampleEntity>)

    @Update
    suspend fun update(item: SampleEntity)

    @Delete
    suspend fun delete(item: SampleEntity)

    @Query("DELETE FROM SampleData")
    suspend fun deleteAllRecord()
}