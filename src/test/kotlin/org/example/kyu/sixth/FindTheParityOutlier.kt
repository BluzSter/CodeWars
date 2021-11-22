package org.example.kyu.sixth

import org.junit.Test
import kotlin.test.assertEquals

//You are given an array (which will have a length of at least 3, but could be very large) containing integers.
//The array is either entirely comprised of odd integers or entirely comprised of even integers except for a single integer N.
//Write a method that takes the array as an argument and returns this "outlier" N.
class FindTheParityOutlier {

    @Test
    fun testExample() {
        val exampleTest1 = arrayOf(2, 6, 8, -10, 3)
        val exampleTest2 = arrayOf(206847684, 1056521, 7, 17, 1901, 21104421, 7, 1, 35521, 1, 7781)
        val exampleTest3 = arrayOf(Integer.MAX_VALUE, 0, 1)
        assertEquals(3, find(exampleTest1))
        assertEquals(206847684, find(exampleTest2))
        assertEquals(0, find(exampleTest3))
    }

    private fun find(integers: Array<Int>): Int {
        val isEvenArray = (integers[0] % 2 == 0 && integers[1] % 2 == 0)
                || (integers[1] % 2 == 0 && integers[2] % 2 == 0)
                || (integers[0] % 2 == 0 && integers[2] % 2 == 0)

        return if (isEvenArray) integers.first { it % 2 != 0 } else integers.first { it % 2 == 0 }
    }
}
