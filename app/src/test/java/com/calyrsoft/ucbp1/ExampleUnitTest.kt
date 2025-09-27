package com.calyrsoft.ucbp1.features.profile.domain.model

import org.junit.Assert.assertEquals
import org.junit.Test

class ProfileModelTest {

    @Test
    fun `profile model stores correct values`() {
        // Arrange
        val pathUrl = "https://image.com/photo.jpg"
        val name = Name("Alessander Morales")
        val email = Email("USER@DOMAIN.COM")
        val cellphone = Cellphone("70712082")
        val summary = Summary("Estudiante de Ingeniería")

        // Act
        val profile = ProfileModel(
            pathUrl = pathUrl,
            name = name,
            email = email,
            cellphone = cellphone,
            summary = summary
        )

        // Assert
        assertEquals("Alessander Morales", profile.name.value)
        assertEquals("user@domain.com", profile.email.lowerCaseValue)
        assertEquals("70712082", profile.cellphone.value)
        assertEquals("Estudiante de Ingeniería", profile.summary.value)
        assertEquals(pathUrl, profile.pathUrl)
    }
}

