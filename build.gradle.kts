FROM ibm-semeru-runtimes:open-21.0.4.1_7-jre@sha256:8b94f8b14fd1d4660f9dc777b1ad3630f847b8e3dc371203bcb857a5e74d6c39
//val baseImage = "ibm-semeru-runtimes:open-21.0.8_9-jre@sha256:551139c6639d176c9591c2e2eee16b0092b97a31761c8a9202cf9fffc844d845"
//val baseImage: String = file("Dockerfile").readText().removePrefix("FROM").trim()

plugins {
    id("org.springframework.boot") version "3.5.4"
}