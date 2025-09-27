package com.calyrsoft.ucbp1.features.profile.domain.model

@JvmInline
value class Email(val value: String) {
    init {
        require(value.contains("@")) { "Email must contain @" }
    }
}