package com.calyrsoft.ucbp1.features.profile.domain.model

data class ProfileModel(
    val pathUrl: String,
    val name: Name,
    val email: Email,
    val cellphone: Cellphone,
    val summary: Summary
)
