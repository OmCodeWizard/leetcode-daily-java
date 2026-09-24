# Smallest Index

## Pattern

Array Traversal

## Technique

Digit Sum

## Problem

We need to find the first index `i` where the sum of the digits of `nums[i]` is equal to `i`.

If no such index exists, return `-1`.

## Approach

I simply traverse the array from left to right.

For every element, I calculate its digit sum using a separate `sum()` method. Then I compare the digit sum with the current index.

If both are equal, I return that index immediately because we need the smallest index.

If I reach the end without finding one, I return `-1`.

## Complexity

* Time: O(n × d), where `d` is the number of digits in the number
* Space: O(1)
