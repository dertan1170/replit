#Name: Derek Tang
#Date: 12/4/20
#Assignment Title: 4.5 Exercise
"""
Question: Include an explanation to describe how the use of this data abstraction (using a list to store the names and a list to store the numbers) manages complexity in the program code. Explain how your code would be different if every name and number were a different variable instead of being stored as one unit in  the two lists. You may submit your response on a separate piece of paper or in the top comment section of your program code.

Answer:
Using a list manages complexity in the code since it stores all of the names and numbers in a single place. This not only makes it very esay for the programer to see what they're working with. But it also removes the neccesity of using a different variable for every name/number. The code would be different if I couldn't use lists in the sense that it would require a variable for every name/number. This in turn would make the program extremely long if we're using many different names and numbers in the code. 
"""
#lists
names=["Peter", "Bruce", "Steve", "Tony", "Natasha", "Clint", "Wanda", "Hope", "Danny", "Carol"]
numbers=[100, 50, 10, 1, 2, 7, 11, 17, 53, -8, -4, -9, -72, -64, -80]
#1
index = 0
for x in names:
  if index % 2 == 0:
    print(x)
  index=index+1
#2
for y in numbers:
  if y>0:
    print("Positive Numbers: "+ str(y))
#3
sum=0
for y in numbers:
  sum=sum+y
print("Sum: "+str(sum))
#4
for y in numbers:
  if y % 2 == 1:
    print("Odd Numbers: " + str(y))
#5
for n in names:
  if n < "Thor":
    print("Names that come before Thor: "+n)
#6
#maximum
x=numbers[1]
#the number in [] can be an number from 0-14
for y in numbers:
  if x <= y:
    x=y
print("The Maximum Value is: " + str(x))