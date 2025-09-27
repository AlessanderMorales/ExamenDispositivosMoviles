package com.calyrsoft.ucbp1.features.profile.domain.model

@JvmInline
value class Cellphone(val value: String) {
    init {
        require(value.isNotBlank()) { "Cellphone cannot be empty" }
        require(Regex("^\\+?\\d{7,15}\$").matches(value)) { "Invalid cellphone" }
    }
}
