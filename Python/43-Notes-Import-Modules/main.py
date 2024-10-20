# Derek Tang
# 11.20.2020
# 4.3 Day 2 - Import Modules

#In order to use the math and random library - use the appropriate import statements
import math
import random
##############################################
#PART 1 - MATH FUNCTIONS IN THE PYTHON LIBRARY
##############################################
print("PART 1 - MATH FUNCTIONS IN THE PYTHON LIBRARY")

#ceil(x) - Return the ceiling of x, the smallest integer greater than or equal to x.
a=math.ceil(4.2)
print(a)
#fabs(x) - Return the absolute value of x.
b=math.fabs(-32)
print(b)
#floor(x) - Return the floor of x, the largest integer less than or equal to x.
c=math.floor(4.2)
print(c)
#factorial(x) - Return x factorial as an integer. 
print(math.factorial(4))#4*3*2*1=24
#pow(x, y) - Return x raised to the power y.
x=2
y=3
print(math.pow(x, y))#2^3=2*2*2=8
#sqrt(x) - Return the square root of x.
print(math.sqrt(26))
#cos(x) - Return the cosine of x radians.
print(math.cos(math.pi))
#sin(x) - Return the sine of x radians.
print(math.sin(math.pi / 2))
#tan(x) - Return the tangent of x radians.
print(math.tan(3 * math.pi / 2))

radius = 3.2 #floating-point
area=math.pi * math.pow(radius, 2)
print("The area of a circle with radius "+str(radius) + " is equal to " +str(area))

#dist(p, q) - Return the Euclidean distance between two points p and q, each given as a sequence (or iterable) of coordinates.
print(math.dist([5],[3])) #2.0

################################################
#PART 2 - RANDOM FUNCTIONS IN THE PYTHON LIBRARY
################################################
print("\nPART 2 - RANDOM FUNCTIONS IN THE PYTHON LIBRARY")

#randint(start, end) - Returns a random integer in range [start, end] including the end points.
print(random.randint(3, 13))
#choice() - Returns a random item. 
list1 = [1,2,3,4,5,6]
print(random.choice(list1))
print(random.choice("computer"))
print(random.choice(["hello", "there"]))
#shuffle([...]) - Shuffles a list of items
random.shuffle(list1)
print(list1)
#random() - Returns a random floating number between 0 and 1.
print(random.random())
#uniform(x, y) - Returns a random floating number between x and y.
print(random.uniform(30, 60))
#randrange() - Returns a random number from a specified range and also allowing rooms for steps to be included
# Using randrange() to generate numbers from 0-100
print(random.randrange(100))
# Using randrange() to generate numbers from 50-100
print(random.randrange(50, 100))
# Using randrange() to generate numbers from 50-100,  in steps of 5
print(random.randrange(50, 100, 5))
# 50,55,60,65,75,80,85,90,95
# 50 is inclusive or included
# 100 is exclusive or excluded