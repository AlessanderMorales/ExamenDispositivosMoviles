package com.calyrsoft.ucbp1.features.profile.domain.model

@JvmInline
value class Email(val value: String) {
    init {
        require(Regex("^[A-Za-z0-9+_.-]+@[A-Za-z0-9.-]+$").matches(value)) {
            "Invalid email"
        }
    }
}