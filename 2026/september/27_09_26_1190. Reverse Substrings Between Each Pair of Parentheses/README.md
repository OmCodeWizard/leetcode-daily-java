# Reverse Substrings Between Each Pair of Parentheses

## Pattern

Stack

## Technique

StringBuilder + Stack

## Problem

We have a string containing parentheses. For every pair of parentheses, the characters inside them need to be reversed.

The parentheses themselves should not be included in the final answer.

## Approach

I used a stack to keep track of the string built before each opening parenthesis.

Whenever I see `(`, I push the current string into the stack and start building a new string.

When I see `)`, I reverse the current string and append it to the previous string from the stack.

For normal characters, I simply add them to the current `StringBuilder`.

At the end, `current` contains the final result.

## Complexity

* Time: O(n)
* Space: O(n)
