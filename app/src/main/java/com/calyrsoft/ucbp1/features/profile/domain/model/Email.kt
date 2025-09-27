package com.calyrsoft.ucbp1.features.profile.domain.model

@JvmInline
value class Email(val value: String) {
    init {
        require(value.isNotBlank()) { "Email cannot be empty" }
    }

    val lowerCaseValue: String
        get() = value.lowercase()
}