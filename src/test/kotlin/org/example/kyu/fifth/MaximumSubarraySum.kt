package org.example.kyu.fifth

import org.junit.Test
import kotlin.test.assertEquals

// The maximum sum subarray problem consists in finding the maximum sum of a contiguous subsequence in an array or list of integers:
// Easy case is when the list is made up of only positive numbers and the maximum sum is the sum of the whole array.
// If the list is made up of only negative numbers, return 0 instead.
// Empty list is considered to have zero greatest sum. Note that the empty list or array is also a valid sublist/subarray.
class MaximumSubarraySum {

    @Test
    fun testExample() {
        assertEquals(6, maxSequence(listOf(-2, 1, -3, 4, -1, 2, 1, -5, 4)))
        assertEquals(2, maxSequence(listOf(-47, 2)))
        assertEquals(6, maxSequence(listOf(-2, 1, -3, 4, -1, 2, 1, -5, 4)))
        assertEquals(0, maxSequence(listOf(-47, -2, -32, -21, -425, 0)))
        assertEquals(0, maxSequence(listOf(0, -2, -32, -21, -425, 0)))
        assertEquals(0, maxSequence(listOf(0, -1)))
        assertEquals(0, maxSequence(listOf(-5)))
        assertEquals(0, maxSequence(listOf(-1, -1, -1)))
        assertEquals(0, maxSequence(listOf(-47, -2, -32, -21, -425)))
        assertEquals(0, maxSequence(emptyList()))
    }

    private fun maxSequence(arr: List<Int>): Int {
        return arr.indices.map { first ->
            (first..arr.size).map { last -> arr.subList(first, last).sum() }
        }.flatten().maxOrNull() ?: 0
    }
}