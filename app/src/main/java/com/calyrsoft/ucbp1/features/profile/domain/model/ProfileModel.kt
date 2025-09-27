package com.calyrsoft.ucbp1.features.profile.domain.model
import com.calyrsoft.ucbp1.features.profile.domain.model.Name
import com.calyrsoft.ucbp1.features.profile.domain.model.Email
import com.calyrsoft.ucbp1.features.profile.domain.model.Cellphone
import com.calyrsoft.ucbp1.features.profile.domain.model.Summary
data class ProfileModel(
    val pathUrl: String,
    val name: Name,
    val email: Email,
    val cellphone: Cellphone,
    val summary: Summary
)
