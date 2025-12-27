package dev.thaiflux.identity_service.service

import kotlinx.coroutines.flow.collect
import kotlinx.coroutines.runBlocking
import org.springframework.boot.context.event.ApplicationReadyEvent
import org.springframework.context.event.EventListener
import org.springframework.stereotype.Component
import dev.thaiflux.identity_service.repository.UserRepository

@Component
class Reporter (
    private val userRepository: UserRepository
) {
    @EventListener(ApplicationReadyEvent::class)
    fun onReady() = runBlocking {
        println("✅ ThaiFlux User Service is now ready!")
        
        println("--- Current Users in DB ---")
        userRepository.findAll().collect { user ->
            println("User: ${user.username} (Email: ${user.email})")
        }
        println("---------------------------")
    }
}