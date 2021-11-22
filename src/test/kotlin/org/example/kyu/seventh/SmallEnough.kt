package org.example.kyu.seventh

import org.junit.Test
import kotlin.test.assertEquals

// You will be given an array and a limit value.
// You must check that all values in the array are below or equal to the limit value.
// If they are, return true. Else, return false.
class SmallEnough {

    @Test
    fun testExample() {
        assertEquals(true, smallEnough(intArrayOf(66, 101), 200))
        assertEquals(false, smallEnough(intArrayOf(78, 117, 110, 99, 104, 117, 107, 115), 100))
        assertEquals(true, smallEnough(intArrayOf(101, 45, 75, 105, 99, 107), 107))
        assertEquals(true, smallEnough(intArrayOf(80, 117, 115, 104, 45, 85, 112, 115), 120))
    }

    fun smallEnough(array : IntArray, limit : Int) : Boolean = array.all { it <= limit}
}
