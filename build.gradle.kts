plugins {
    id("org.jetbrains.kotlin.jvm") version "2.0.0" apply false
    id("org.jetbrains.kotlin.plugin.spring") version "2.0.0" apply false
    id("org.springframework.boot") version "3.3.2" apply false
    id("io.spring.dependency-management") version "1.1.5" apply false
}

allprojects {
    group = "com.greg.thaiflux"
    version = "0.1.0"
}

subprojects {
    repositories {
        mavenCentral()
    }
}
