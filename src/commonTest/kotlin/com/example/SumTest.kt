package com.example

import kotlin.test.Test
import kotlin.test.assertTrue

class SumTest {
    @Test
    fun should_sum() {
        assertTrue { sum(1,1) == 2 }
    }
}