package com.example.motivationalworkoutapp

import org.junit.Test
import org.junit.Assert.*

class ExampleUnitTest {
    @Test
    fun affirmationList_isCorrect() {
        val affirmations = listOf(
            "You are strong!",
            "You can achieve anything!",
            "Stay positive!",
            "Keep pushing forward!"
        )
        assertTrue(affirmations.isNotEmpty())
    }
}