package com.calyrsoft.ucbp1.features.profile.domain.model

@JvmInline
value class Name(val value: String) {
    init {
        require(value.isNotBlank()) { "Name cannot be empty" }
    }
}