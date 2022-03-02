package com.metehanbolat.mvvmroomdatabasecompose.repository

import androidx.lifecycle.LiveData
import com.metehanbolat.mvvmroomdatabasecompose.dao.SampleDao
import com.metehanbolat.mvvmroomdatabasecompose.entity.SampleEntity

class SampleRepository(private val sampleDao: SampleDao) {

    val readAllData: LiveData<List<SampleEntity>> = sampleDao.getAllData()

    suspend fun addSample(item: List<SampleEntity>) = sampleDao.insert(item = item)

    suspend fun updateSample(item: SampleEntity) = sampleDao.update(item = item)

    suspend fun deleteSample(item: SampleEntity) = sampleDao.delete(item = item)

    suspend fun deleteAllRecord() = sampleDao.deleteAllRecord()
}