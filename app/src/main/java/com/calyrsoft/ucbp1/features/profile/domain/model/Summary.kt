package com.calyrsoft.ucbp1.features.profile.domain.model

@JvmInline
value class Summary(val value: String) {
    init {
        require(value.length <= 250) { "Summary too long" }
    }
}
