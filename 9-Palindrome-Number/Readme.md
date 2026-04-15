# 🔢 Palindrome Number (LeetCode-9)

## 🧩 Problem

Given an integer `x`, return `true` if `x` is a palindrome, and `false` otherwise.
A palindrome number is a number that reads the same backward as forward.

---

## 🧠 Approach

* Store the original number in a variable (`temp`).
* If the number is negative, return `false`.
* Reverse the number:

  * Extract last digit using `x % 10`
  * Build reversed number using `rev = rev * 10 + digit`
  * Remove last digit using `x = x / 10`
* Compare reversed number (`rev`) with original (`temp`).
* If equal → palindrome, else → not a palindrome.

---

## ⚡ Complexity

* **Time Complexity:** O(log₁₀(n))
* **Space Complexity:** O(1)

---

## 🧪 Test Cases

### Test Case 1

Input: `x = 121`
Output: `true`

### Test Case 2

Input: `x = -121`
Output: `false`

### Test Case 3

Input: `x = 10`
Output: `false`

---

## 🏷️ Tags

* Math
* Number Manipulation

---

## 💡 Note

This approach reverses the full number. An optimized solution can reverse only half of the number to avoid overflow.

