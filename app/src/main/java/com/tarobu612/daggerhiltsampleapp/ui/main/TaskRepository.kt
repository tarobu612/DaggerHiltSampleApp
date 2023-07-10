package com.tarobu612.daggerhiltsampleapp.ui.main

import javax.inject.Inject
import javax.inject.Singleton

@Singleton
class TaskRepository @Inject constructor() : TaskDataSource {

    override fun load() {
        // empty
    }

}
