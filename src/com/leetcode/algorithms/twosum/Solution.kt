package com.leetcode.algorithms.twosum

/**
 * https://leetcode.com/problems/two-sum
 */
class Solution {
    fun twoSum(nums: IntArray, target: Int): IntArray {
        // Approach 1: Brute Force
//        for (i in nums.indices) {
//            for (j in i + 1..<nums.size) {
//                if (nums[i] + nums[j] == target) {
//                    return intArrayOf(i, j)
//                }
//            }
//        }
//
//        return intArrayOf()

        // Approach 2: One-pass Hash Table
        val map = mutableMapOf<Int, Int>()

        for ((i, num) in nums.withIndex()) {
            val complement = target - num
            println("i:$i, num:$num, complement: $complement")
            if (map.containsKey(complement)) {
                return intArrayOf(map[complement]!!, i)
            }
            map[num] = i
        }

        return intArrayOf()
    }
}