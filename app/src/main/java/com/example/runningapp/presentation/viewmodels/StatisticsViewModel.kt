package com.example.runningapp.presentation.viewmodels

import androidx.lifecycle.ViewModel
import com.example.runningapp.domain.repository.RunningRepository
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject

@HiltViewModel
class StatisticsViewModel @Inject constructor(
    private val runningRepository: RunningRepository
) : ViewModel() {

    val totalTimeRun = runningRepository.getTotalTimeInMillis()
    val totalDistance = runningRepository.getTotalDistance()
    val totalCaloriesBurned = runningRepository.getTotalCaloriesBurned()
    val totalAvgSpeed = runningRepository.getTotalAvgSpeed()

    val runsSortedByDate = runningRepository.getAllRunsSortedByDate()
}