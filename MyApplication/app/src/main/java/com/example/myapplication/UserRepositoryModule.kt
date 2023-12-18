package com.example.myapplication

import dagger.Binds
import dagger.Module
import dagger.Provides

@Module
class UserRepositoryModule {
    @SQLAnnotation
    @Provides
    fun getSQLRepository(sqlRepository: SQLRepository) : UserRepository{
        return sqlRepository
    }
    @FirebaseAnnotation
    @Provides
    fun getFirebaseRepository () : UserRepository{
        return FirebaseRepository()
    }
}