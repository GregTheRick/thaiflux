package dev.thaiflux.identity_service.repository

import dev.thaiflux.identity_service.model.User
import org.springframework.data.repository.kotlin.CoroutineCrudRepository

interface UserRepository : CoroutineCrudRepository<User, Long> {
    suspend fun findByUsername(username: String): User?

    suspend fun findByEmail(email: String): User?
}
