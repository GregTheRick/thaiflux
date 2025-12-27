package dev.thaiflux.identity_service.model

import org.springframework.data.annotation.Id
import org.springframework.data.relational.core.mapping.Table

@Table("users")
data class User(
    val username: String,
    val password: String,
    val email: String,
    @Id
    val id: Long? = null,
)