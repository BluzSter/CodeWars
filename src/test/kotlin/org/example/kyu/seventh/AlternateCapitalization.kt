package org.example.kyu.seventh

import org.junit.Test
import kotlin.test.assertEquals

// Given a string, capitalize the letters that occupy even indexes and odd indexes separately,
// and return as shown below. Index 0 will be considered even.
class AlternateCapitalization {

    @Test
    fun testExample() {
        assertEquals(listOf("AbCdEf", "aBcDeF"), capitalize("abcdef"))
        assertEquals(listOf("CoDeWaRs", "cOdEwArS"), capitalize("codewars"))
        assertEquals(listOf("AbRaCaDaBrA", "aBrAcAdAbRa"), capitalize("abracadabra"))
        assertEquals(listOf("CoDeWaRrIoRs", "cOdEwArRiOrS"), capitalize("codewarriors"))
    }

    private fun capitalize(text: String) = (0..1).map {
        text.indices.map { index ->
            if (index % 2 == it) {
                text[index].uppercaseChar()
            } else text[index]
        }.joinToString("")
    }
}