# Derek Tang
# 12.01.2020
# 4.4 Iteration Structures (Class notes)

###################################
#WHILE LOOP
## A while loop is a loop that repeats while the condition is TRUE
## 4 Components of a While Loop:
## 1. Initialization (ex. x = 0 or x = 1)
## 2. Condition (> >= < <= == !=)
## 3. Action inside the loop (ex. print, add, subtract, etc)
## 4. Update x (ex. add 1 to x)
x = 1
while x <= 10:
    print("x = " + str(x))
    x = x + 2

###################################
#INFINITE LOOPS
## Infinite loops are loops that never stop running
## These loops occur when step 4 (update the variable) is missing
y = 0
sum = 0
while y < 10:
    sum = sum + y
    print("sum = " + str(sum))
    y = y + 1

#loop 1 - sum = 0 + 0 = 0
#loop 2 - sum = 0 + 1 = 1
#loop 3 - sum = 1 + 2 = 3
#loop 4 - sum = 3 + 3 = 6
#loop 5 - sum = 6 + 4 = 10
#loop 6 - sum = 10 + 5 = 15
#loop 7 - sum = 15 + 6 = 21
#loop 8 - sum = 21 + 7 = 28
#loop 9 - sum = 28 + 8 = 36
#loop 10 - sum = 36 + 9 = 45
###################################
#FOR LOOP
## A for loop is a loop that will run a set amount of times.
"""
For Loop Structure: 
		range(START, STOP, STEP) - range(START, STOP) - range(STOP)
- START is an optional value that determines where the list of values will begin. By default, if not included, it starts at 0
- STOP is the only mandatory value that determines where the list of values will end (it will end one before this value)
- STEP is an optional value that determines how the list of values will be incremented. By default, if not included, it increments by 1
"""
###################################
# EX 1: Print Hello 5 times
for i in range(5):
  print("Hello "+str(i))

###################################
# EX 2: Print the values 0 to 9
for j in range(0,10):
  print("j = "+str(j))
#option 2
for k in range(10):
  print("k = "+str(k))

###################################
# EX 3: Print the values from 1 to 10
for x1 in range(1,11):
  print("x1 = "+str(x1))
for x2 in range(0,10):
  print("x2 = "+str(x2+1))

###################################
# EX 4: Print the values from 2 to 11, in increments of 2
for y1 in range(2,12,2):
  print("y1 = "+str(y1))

###################################
# EX 5: Print the values from 10 to 0, in increments of -1
for y2 in range(10,-1,-1):
  print("y2 = "+str(y2))

###################################
# EX 6: Print the values from 100 to 0, in increments of -15
for y3 in range(100,-1,-15):
  print("y3 = "+str(y3))

"""
TRY IT OUT 

Using your new-found knowledge on loops, create the following loops: 

Note, for debugging and testing, feel free to comment out loops that you know already work and use comments to label which loop you are working on.
"""
###################################
#1. Using a while loop, output the numbers 1 to 100.
a1 = 0
while a1 <= 100:
  print("a1 = "+str(a1))
  a1=a1+1

###################################
#2. Using a for loop, output the numbers 50 to 65.
for a2 in range(50,66):
  print("a2 = "+ str(a2))

###################################
#3. Using a while loop, output the even numbers from 100 to 147.
a3 = 100
while a3 <=147:
  print("a3 = "+str(a3))
  a3=a3+2

###################################
#4. Using a for loop, output every third number from 0 to 51.
for a4 in range(0,52,3):
  print("a4 = "+ str(a4))

###################################
#5. Using a for loop, output all multiples of 10 from 0 to 1000.
for a5 in range(0,1001,10):
  print("a5 = "+ str(a5))

#########################
#More advanced examples #
#########################

###################################
#EX. PRINTING OUT ALL THE LETTERS OF A STRING
#Lowercase
sentence="hello there"
for f in sentence:
  print(f)
#Uppercase
sentence="hello there"
for f in sentence:
  print(f.upper())

###################################
#EX. Ask for an integer, stop when they enter 0
int1=int(input("Enter an integer, and 0 to stop: "))
count=0
while int1 != 0:
  print("integer = "+str(int1))
  count = count +1
  int1=int(input("Enter an integer, and 0 to stop: "))
print("You entered "+str(count)+" values.")

###################################
#EX. Ask for a word, and stop when they enter "Quit"
word1=input("Enter a word, and enter Quit to stop: ")
while word1 != "Quit":
  print(word1)
  word1=input("Enter a word, and enter Quit to stop: ")
