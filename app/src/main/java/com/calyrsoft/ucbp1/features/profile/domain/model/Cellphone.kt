package com.calyrsoft.ucbp1.features.profile.domain.model

@JvmInline
value class Cellphone(val value: String) {
    init {
        require(value.isNotBlank()) { "Cellphone cannot be empty" }
    }
}
