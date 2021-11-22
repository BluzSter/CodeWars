package org.example.kyu.seventh

import org.junit.Test
import kotlin.test.assertEquals

// King Arthur and his knights are having a New Years party.
// Last year Lancelot was jealous of Arthur, because Arthur had a date and Lancelot did not, and they started a duel.
// To prevent this from happening again, Arthur wants to make sure that there are at least as many women as men at this year's party.
// He gave you a list of integers of all the party goers.
// Arthur needs you to return true if he needs to invite more women or false if he is all set
class InviteMoreWomen {

    @Test
    fun testExample() {
        assertEquals(true, inviteMoreWomen(listOf(1, -1, 1)))
        assertEquals(false, inviteMoreWomen(listOf(-1, -1, -1)))
        assertEquals(false, inviteMoreWomen(listOf(1, -1)))
        assertEquals(true, inviteMoreWomen(listOf(1, 1, 1)))
    }

    private fun inviteMoreWomen(l: List<Int>) = l.sum() > 0
}
