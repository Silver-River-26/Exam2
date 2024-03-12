public class instuctions {
    /*
    Instructions:

Create a Java Project called Exam2. All the programs written as part of this exam should be in this project.
You may attempt all 6 questions, but I will grade based on the best 4 answers.
Create and use more data than that provided below for each problem to test it.
Add a main method in each class
All programs should be submitted into GitHub. Please submit it as a separate repo
Do not change any of the submitted files after test time is over. Points will be deducted if you do.
Please read each problem carefully. Name the class and method
Feel free to google away for help, and to check the class notes, and even your notes!
Run the formatter for each file!!!!!!!!!!!!!
Class 1: StringKnowledge

Use this class for Questions 1 and 2

Question 1:

Write a method named endOther that takes two strings a and b as arguments and returns a boolean. Given the two strings,
 return true if either of the strings appears at the very end of the other string, ignoring upper/lower case
 differences (in other words, the computation should not be "case sensitive").
 Note: "String".toLowerCase() returns the lowercase version of a string.

Examples:
endOther("Hiabc", "abc") --> true
endOther("AbC", "HiaBc") --> true
endOther("abc", "abXabc") --> true
endOther("abc", "xyz") --> false

Question 2:

    •    Write a method named findRepeats that takes one string argument `toTest` and returns a boolean. If any of
     the substrings with length greater than or equal to 2 within `toTest` appear multiple times, findRepeats will
      return true, else returning false. By "substrings within", I mean any possible substring within the given string.
       So for "abc", all of it's substrings are "a", "b", "c", "ab", and "bc". Only "ab" and "bc" have a length greater
        than or equal to 2, so you would only have to search for them.

Examples:
findRepeats("abba") --> false ("a" and "b" both appear multiple times, but only as single characters)
findRepeats("abaaba") --> true ("aba" appears twice)
findRepeats("I love hams in the desert. Just love eating a ham") --> true ("ham" and "love" both appear twice,
but you could return true as soon as you found a single one)

Class 2: LogicKnowledge

Use this class for questions 3 and 4

Question 3:
    •    Write a method named greenTicket that takes three integer arguments: a, b and c and returns an integer.
    You have a green lottery ticket, with ints a, b, and c on it. If the numbers are all different from each other,
    the result is 0. If all of the numbers are the same, the result is 20. If two of the numbers are the same,
    the result is 10.


Examples:
greenTicket(1, 2, 3) → 0
greenTicket(2, 2, 2) → 20
greenTicket(1, 1, 2) → 10

Question 4:
    •    Write a method named makeChocolate that takes three integer arguments: small, large and goal and returns
     an integer. The small argument is the number of 1 pound chocolate bars we have, large is the number of 5 pound
     chocolate bars we have, the goal is the total number of pounds we need to sell. The method should return the
      number of small bars to use, assuming we use as many of the big bars as possible before the small bars.
      Return -1 if it cannot be done.


Examples:
makeChocolate(4, 1, 9) → 4
makeChocolate(4, 1, 10) → -1
makeChocolate(4, 1, 7) → 2
makeChocolate(4, 2, 7) → 2


Class 3: ArrayKnowledge

Use this class for Questions 5 and 6

Question 5

    •    Write a method stringToArray that takes a string argument and returns an array of char where each element
    of the array is the characters of the string in order. The array should be sized to exactly the length of the
    string.

Examples:
stringToArray("Ham") -> ['H', 'a', 'm']
stringToArray("I eat cheddar") -> ['I', ' ', 'e', 'a', 't', ' ', 'c', 'h', 'e', 'd', 'd', 'a', 'r']

Question 6
    •    Write a method named generateArrayWithBounds that takes three integer arguments, start, end, and step
    and returns an array of integers. Given start and end numbers, return a new array containing the sequence
    of integers from start up to but not including end, stepping step numbers in between each number,
     so start=5, end=10, and step=1 yields [5, 6, 7, 8, 9], but with the same start and end but with step=2 would
      yield [5, 7, 9}. You can assume the end number will always be greater than or equal to the start number.
       If step would skip the end number, then do not include it. Note that a length-0 array is valid.


Examples:
generateArrayWithBounds(5, 10, 1) → [5, 6, 7, 8, 9]
generateArrayWithBounds(11, 18, 3) → [11, 14, 17]
generateArrayWithBounds(1, 2, 1000) → [1]

     */
}
