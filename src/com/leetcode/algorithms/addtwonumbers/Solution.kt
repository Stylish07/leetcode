package com.leetcode.algorithms.addtwonumbers

/**
 * https://leetcode.com/problems/add-two-numbers
 */
class Solution {

    fun addTwoNumbers(l1: ListNode?, l2: ListNode?): ListNode? {
        val dummyHead = ListNode(0)
        var current = dummyHead
        var carry = 0

        var p1 = l1
        var p2 = l2

        while (p1 != null || p2 != null || carry != 0) {
            val x = p1?.value ?: 0
            val y = p2?.value ?: 0

            val sum = x + y + carry
            carry = sum / 10

            current.next = ListNode(sum % 10)
            current = current.next!!

            if (p1 != null) p1 = p1.next
            if (p2 != null) p2 = p2.next
        }

        return dummyHead.next
    }

}