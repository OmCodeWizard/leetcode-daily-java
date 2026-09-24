# Minimum Operations to Reduce X to Zero

## Pattern

Sliding Window

## Technique

Longest Subarray with Target Sum

## Problem

We need to remove elements from either the left or right side of the array until the sum of the removed elements becomes `x`.

If it is not possible, return `-1`.

## Approach

Instead of directly finding which elements to remove, I look for the longest subarray that can be kept.

The total sum of the array is `totalSum`. If the removed elements must add up to `x`, then the remaining elements must have a sum of:

`totalSum - x`

So, I use a sliding window to find the longest subarray whose sum is exactly `totalSum - x`.

Once I find that longest subarray, the minimum number of operations is:

`n - longestSubarrayLength`

If no such subarray exists, I return `-1`.

## Complexity

* Time: O(n)
* Space: O(1)
