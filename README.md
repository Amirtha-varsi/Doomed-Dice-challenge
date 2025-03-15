The Doomed Dice Challenge
Problem Statement:
The below problems must be solved & implemented in Python / Java / Ruby / C++ / Go.

You are given two six-sided dice, Die A and Die B, each with faces numbered from 1 to 6.

You can only roll both dice together, and your turn is guided by the obtained sum.

Example:
If Die A = 6 and Die B = 3, then the sum is: 6+3=9
You may represent the dice as an Array or Array-like structure.
For example:


DieA = [1, 2, 3, 4, 5, 6]
where the indices represent the 6 faces of the die & the values represent the number on each face.


Part A (15-20 Minutes):
Task 1:
How many total combinations are possible?

Show the mathematical calculation along with the code.

Mathematical Calculation for Total Combinations
Each die has 6 faces numbered from 1 to 6.

Since you are rolling two dice (Die A and Die B) together, the total number of possible outcomes is:

Total Combinations
=
(
Number of faces on Die A
)
×
(
Number of faces on Die B
)
Total Combinations=(Number of faces on Die A)×(Number of faces on Die B)
=
6
×
6
=6×6
=
36
=36
Thus, the total number of possible combinations when rolling both dice together is 36.



 Calculate and Display the Distribution of All Possible Combinations
You are given two six-sided dice, Die A and Die B, each with faces numbered from 1 to 6.

When you roll both dice together, the outcome is determined by their sum.

Task2:
Calculate and display the distribution of all possible combinations that can be obtained when rolling both dice together.
Represent the distribution in the form of a 6×6 matrix, where:
Rows represent the values on Die A (1 to 6)
Columns represent the values on Die B (1 to 6)
Each cell contains the sum of the corresponding values from Die A and Die B

Mathematical Calculation for Distribution of All Possible Combinations
Each die (Die A and Die B) has 6 faces, numbered from 1 to 6.

When rolling both dice together, the result is a sum of the numbers on both dice.

The possible sums range from:

Minimum Sum
=
1
+
1
=
2
Minimum Sum=1+1=2
Maximum Sum
=
6
+
6
=
12
Maximum Sum=6+6=12
Since each die has 6 faces, we can represent all possible rolls in a 6×6 matrix.

The matrix represents all sums obtained by rolling Die A (rows) and Die B (columns).



You are given two six-sided dice, Die A and Die B, each with faces numbered from 1 to 6.

When you roll both dice together, the sum of the numbers determines the outcome.

Task3 
Count how many times each possible sum occurs from rolling both dice.
Calculate the probability of each possible sum occurring.
Probability Formula:
𝑃
(
Sum
=
𝑥
)
=
Number of ways to get Sum x
Total combinations
P(Sum=x)= 
Total combinations
Number of ways to get Sum x
​
 
Since there are 6 faces on each die, the total number of possible outcomes = 6 × 6 = 36.
Example Calculation:
For Sum = 2, there is only one possible combination:

(Die A = 1, Die B = 1) → 1 way
So,

𝑃
(
Sum
=
2
)
=
1
36
≈
0.0278
P(Sum=2)= 
36
1
​
 ≈0.0278


