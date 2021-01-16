# 3.8. Studio: Counting Characters
In this studio, you will write a program to count the number of times each character occurs in a string and then print the results to the console.

## 3.8.1. Some Items to Ponder Before Starting
There are multiple ways to approach this task, but one way involves the following steps:
Loop through the string one character at a time,
Store and/or update the count for a given character using an appropriate data structure.
Loop through the data structure to print the results (one character and its count per line).
You’ll need to initialize the counts for the characters in some fashion. It’s probably better to do this as you go through the string instead of doing so before you loop through it. 

## 3.8.2. Sample Output
For the example string above, your output should look something like:

I: 1
O: 1
S: 1
’: 2
 : 66
a: 20
b: 2
c: 7
d: 7
e: 32
f: 9
g: 2
h: 13
i: 11
l: 6
,: 2
m: 8
n: 12
.: 3
o: 31
p: 3
q: 3
r: 18
s: 16
t: 38
u: 8
v: 3
w: 5
y: 5
z: 3

## 3.8.3. Bonus Missions
Try these modifications on your code:

Prompt the user to enter the string in the command line.
Make the character counts case-insensitive.
Exclude non-alphabetic characters.

