package com.example.myapplication

import dagger.Module
import dagger.Provides
import javax.inject.Named

@Module
class NotificationServiceModule {
    @EmailAnnotation
    @Provides
    fun getEmailService(emailService: EmailService): NotificationService {
        return emailService
    }

    @MessageAnnotation
    @Provides
    fun getMessageService(): NotificationService {
        return MessageService()
    }
}