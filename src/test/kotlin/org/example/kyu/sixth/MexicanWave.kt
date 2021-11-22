package org.example.kyu.sixth

import org.junit.Test
import kotlin.test.assertEquals

// In this simple Kata your task is to create a function that turns a string into a Mexican Wave.
// You will be passed a string and you must return that string in an array where an uppercase letter is a person standing up.
class MexicanWave {

    @Test
    fun testExample() {
        assertEquals(listOf("A       b    ", "a       B    "), wave("a       b    "))
        assertEquals(listOf("This is a few words", "tHis is a few words", "thIs is a few words", "thiS is a few words", "this Is a few words", "this iS a few words", "this is A few words", "this is a Few words", "this is a fEw words", "this is a feW words", "this is a few Words", "this is a few wOrds", "this is a few woRds", "this is a few worDs", "this is a few wordS"), wave("this is a few words"))
        assertEquals(listOf<String>(), wave(""))
        assertEquals(listOf(" Gap ", " gAp ", " gaP "), wave(" gap "))
    }

    private fun wave(str: String) = str.mapIndexedNotNull { index, _ ->
        if (str[index].isLetter()) StringBuilder(str).also { it.setCharAt(index, it[index].uppercaseChar()) }.toString() else null
    }
}
