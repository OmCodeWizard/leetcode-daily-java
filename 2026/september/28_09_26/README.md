# Maximum Nesting Depth of the Parentheses

## Pattern

String Traversal

## Technique

Counting Open and Close Parentheses

## Problem

We need to find the maximum depth of nested parentheses in a string.

For example, in `(a+(b*c))`, the maximum depth is `2`.

## Approach

I keep a counter `cnt` to track how many open parentheses are currently active.

Whenever I see `(`, I increase the counter.

Whenever I see `)`, I decrease it.

After each character, I update `res` with the maximum value of `cnt`.

The maximum value reached by `cnt` is the maximum nesting depth.

## Complexity

* Time: O(n)
* Space: O(1)
