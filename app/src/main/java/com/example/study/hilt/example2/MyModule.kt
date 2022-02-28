package com.example.study.hilt.example2

import com.google.gson.Gson
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.components.ActivityComponent
import dagger.hilt.android.scopes.ActivityScoped
import javax.inject.Qualifier

/*
@InstallIn(ActivityComponent::class) //tablodaki duruma göre(images)
@Module
abstract class MyModule {
    @ActivityScoped
    @Binds
    abstract fun bindingFunction(myImplementor: InterfaceImplementor):MyInterface
}*/

@InstallIn(ActivityComponent::class)
@Module
class MyModule {
    @FirstImplementor
    @ActivityScoped
    @Provides
    fun providerFunction(): MyInterface {
        return InterfaceImplementor()
    }
    @ActivityScoped
    @Provides
    fun gsonProvider():Gson{
        return Gson()
    }
    @SecondImplementor
    @ActivityScoped
    @Provides
    fun secondProvider(): MyInterface {
        return SecondInterfaceImplementor()
    }

}

@Qualifier
@Retention(AnnotationRetention.BINARY)
annotation class FirstImplementor
@Qualifier
@Retention(AnnotationRetention.BINARY)
annotation class SecondImplementor