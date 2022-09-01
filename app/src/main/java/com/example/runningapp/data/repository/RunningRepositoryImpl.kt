package com.example.runningapp.data.repository

import com.example.runningapp.data.local.Run
import com.example.runningapp.data.local.RunDAO
import com.example.runningapp.domain.repository.RunningRepository
import javax.inject.Inject

class RunningRepositoryImpl @Inject constructor(
    private val runDAO: RunDAO
) : RunningRepository {

    override suspend fun insertRun(run: Run) =
        runDAO.insertRun(run)


    override suspend fun deleteRun(run: Run) =
        runDAO.deleteRun(run)


    override fun getAllRunsSortedByDate() =
        runDAO.getAllRunsSortedByDate()


    override fun getAllRunsSortedByDistance() =
        runDAO.getAllRunsSortedByDistance()


    override fun getAllRunsSortedByTimeInMillis() =
        runDAO.getAllRunsSortedByTimeInMillis()


    override fun getAllRunsSortedByAvgSpeed() =
        runDAO.getAllRunsSortedByAvgSpeed()


    override fun getAllRunsSortedByCaloriesBurned() =
        runDAO.getAllRunsSortedByCaloriesBurned()


    override fun getTotalAvgSpeed() =
        runDAO.getTotalAvgSpeed()


    override fun getTotalDistance() =
        runDAO.getTotalDistance()


    override fun getTotalCaloriesBurned() =
        runDAO.getTotalCaloriesBurned()


    override fun getTotalTimeInMillis() =
        runDAO.getTotalTimeInMillis()

}