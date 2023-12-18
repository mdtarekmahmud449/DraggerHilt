package com.example.myapplication

import java.lang.annotation.Documented
import java.lang.annotation.Retention
import java.lang.annotation.RetentionPolicy
import javax.inject.Qualifier

@Qualifier
@Documented
@Retention(RetentionPolicy.RUNTIME)
annotation class MessageAnnotation{}

@Qualifier
@Documented
@Retention(RetentionPolicy.RUNTIME)
annotation class EmailAnnotation{}

@Qualifier
@Documented
@Retention(RetentionPolicy.RUNTIME)
annotation class SQLAnnotation{}

@Qualifier
@Documented
@Retention(RetentionPolicy.RUNTIME)
annotation class FirebaseAnnotation{}


