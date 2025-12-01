package com.depth.app.data.local.dao

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import com.depth.app.data.local.entity.DepthPointEntity
import kotlinx.coroutines.flow.Flow

@Dao
interface DepthDao {

    @Query("SELECT * FROM depth_points WHERE lakeId = :lakeId")
    fun getDepthsForLake(lakeId: Long?): Flow<List<DepthPointEntity>>

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun insertDepth(point: DepthPointEntity)
}
