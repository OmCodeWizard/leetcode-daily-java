# Brace Expansion II

## Pattern

Recursion + Set

## Technique

Parsing and Set Combination

## Problem

Given an expression containing letters, commas, and braces, generate all possible strings that can be formed from the expression.

The final result should contain no duplicates and should be returned in lexicographical order.

## Approach

I used recursion to process the expression one part at a time.

If I find a `{`, I recursively process everything inside it. Commas represent different choices, so I add those results separately.

For normal characters, I treat them as a single possible string.

Whenever two parts need to be joined, I use `combine()` to create all possible combinations between them. A `HashSet` is used to automatically remove duplicate strings.

Finally, I convert the set into a list and sort it before returning the result.

## Complexity

* Time: Depends on the number of strings generated and their lengths
* Space: O(k), where `k` is the number of unique strings generated
