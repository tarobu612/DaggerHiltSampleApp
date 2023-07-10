package com.tarobu612.daggerhiltsampleapp.ui.main

import dagger.Binds
import dagger.Module
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
abstract class ViewModelModules {

    @Singleton
    @Binds
    abstract fun bindTaskRepository(repository: TaskRepository): TaskDataSource

}