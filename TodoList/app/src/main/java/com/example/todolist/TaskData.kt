package com.example.todolist

import android.os.Parcelable
import kotlinx.parcelize.Parcelize

@Parcelize
data class TaskData(var taskTitle: String = "", var deadLine: String = "") : Parcelable
