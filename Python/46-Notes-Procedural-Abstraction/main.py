# Name: Derek Tang
# Date: 12/9/20
# 4.6 Procedural Abstraction Notes - Day 1

"""
Lesson Goal: You will learn about the use of procedural abstraction and how it relates to Python.

Lesson Objectives:
- You will explore procedural abstraction by creating user-defined functions
- You will explore modularity and its importance in programming 

"""

import random
import math

#########################################################
##### PART 1: ###########################################
##### WRITING PROCEDURES IN PYTHON WITHOUT A RETURN #####
#########################################################

#EX 1: CREATE A PROCEDURE CALLED AREA THAT PRINTS THE AREA OF A CIRCLE

#Step 1: Define the procedure. (Note, you have to define a procedure before you call it)
def area():
  a=math.pi * math.pow(radius, 2)
  #NO RETURN .+ include a print
  print("the area is: "+str(a))

#Step 2: Call the procedure.
radius = 1
area() #call to area()
radius = 5
area()

#########################################################
##### PART 2: ###########################################
##### WRITING PROCEDURES IN PYTHON WITH A RETURN ########
#########################################################

#EX 2: CREATE A PROCEDURE CALLED CIRCUMFERENCE THAT RETURNS THE VALUE BACK TO THE PROCEDURE CALL

#Step 1: Define the procedure.
def circumference():
  c=2*math.pi*radius
  return c

#Step 2: Call the procedure.
radius = 10
answer = circumference() #value of c above will get stored into answer
print("The circumference is: "+str(answer))

#MODULARITY - SUBDIVIDE A COMPUTER PROGRAM INTO SMALLER PROGRAMS

############################################################
##### PART 3: ##############################################
##### WRITING PROCEDURES IN PYTHON WITH A PARAMETER ########
##### AND WITHOUT A RETURN VALUE ###########################
############################################################

#Step 1: Define add(num1, num2) - num1 & num2 are parameters
def add(num1, num2):
  sum=num1+num2
  print("The sum is: "+str(sum))

#Step 2: Call the procedure.
x=int(input("Enter an integer: "))
y=int(input("Enter a second integer: "))
#try calling the procedure and passing in the two variables
add(x,y)
add(5,10)
############################################################
##### PART 4: ##############################################
##### WRITING PROCEDURES IN PYTHON WITH A PARAMETER ########
##### AND WITH A RETURN VALUE ##############################
############################################################

#Step 1: Define the procedure.
def subtract(val1, val2):
  diff=val1-val2
  return diff

#Step 2: Call the procedure.
caculate = subtract(15,5) # the value of difference from above will be stored into caculate
print("The difference is: "+str(caculate))

