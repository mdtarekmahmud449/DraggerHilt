package com.example.myapplication

import javax.inject.Inject

class UserRegistrationService @Inject constructor(
    @FirebaseAnnotation private val userRepository: UserRepository,
    @EmailAnnotation private val notificationService: NotificationService
) {
    fun registerUser(email: String, password: String){
        userRepository.saveUser(email, password)
        notificationService.send(email, "mdtarekmahmud449@gmail.com", "User-Registered")
    }

}