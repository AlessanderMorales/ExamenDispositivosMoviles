package com.calyrsoft.ucbp1.features.profile.domain.model

import org.junit.Test
import kotlin.test.assertFailsWith
import kotlin.test.assertEquals

class ValueObjectTest {

    @Test
    fun `Name should not be blank`() {
        assertFailsWith<IllegalArgumentException> { Name("") }
        val name = Name("Alessander")
        assertEquals("Alessander", name.value)
    }
}