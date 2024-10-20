"""
Name: Derek Tang
Date: 12/4/20
Assignment Title: 4.5 Notes - Data Abstraction
"""

#Lesson Goal: You will learn about the use of data abstraction and how it relates to Python.

#Lesson Objectives:
##You will explore data abstraction by using lists
##You will examine how to process a list of values

"""
Data Abstraction: Data abstraction provides a separation between the abstract properties of a data type and the concrete details of its representation. Data abstractions manage complexity in programs by giving a collection of data a name without referencing the specific details of the representation. 

In Python - an example of Data Abstraction is a list
"""

##################################################
##### PART 1: ####################################
##### CREATING LISTS OF DIFFERENT DATATYPES ######
##################################################

#EX 1: Creating an empty list
list1 = []

#EX 2: Creating a list of players
players = ["Winson", "Katrina", "Joyce", 'Vanessa']
print(players)

#EX 3: Creating a list of numbers
scores = [10,15,16,9,20,22,13]

#EX 4: Creating a list of booleans
answers = [True,False,True]

#EX 5: Creating a list of prices
dailySpending=[5.50,3.75,10.12,20.99]

###################################
##### PART 2: #####################
##### USING LOOPS WITH LISTS ######
###################################

#EX 6: Create a for loop that will ask for 3 names. Output the list at the end.
students=[]
for i in range(3):
  name=input("Enter a name: ")
  students.append(name) #adds the name to the end of the list
print(students)

#EX 7: Use a loop to print out every 3rd person in a list.
people = ["Leila", "Kaysen", "Angel", "Eugene", "Cole", "Matthew", "Karen", "Claire", "Carol", "Kaylyn"]
index = 0
for person in people: #for every person in people
  #if index == 0 or index == 3 or index ==6 or index == 9:
  if index % 3 == 0:
    print(person)
  index = index+1

#EX 8: Use a loop to print out all the negative numbers in a list.
nums = [12,14,15,-34,9,-12,42,-99,-89]
for y in nums:
  if y<0:
    print(y)

#EX 9: Use a loop to calculate the sum of the values. Use the list of numbers above.
sum=0
for x in nums:
  sum=sum+x
print("Sum = "+str(sum))

#EX 10: Use a loop to print out all the animals that come after kangaroo
animals = ["zebra", "cat", "dog", "shark"]
for i in animals:
  if i > "kangaroo":
    print(i)

#len() is a helpful method that can be used on strings or lists to determine how "long" they are. For lists, that would mean how many elements are inside and for strings, that would mean how many characters long it is.
print("len: "+ str(len(animals)))

##############################################
##### PART 3: ################################
##### IMPLEMENTING BUILT-IN LIST METHODS #####
##############################################
"""
List Methods:
append() 		clear() 		copy() 			count()
extend() 		index() 		insert() 		pop()
remove() 		reverse() 	sort()

Additional Resources & Examples: https://www.programiz.com/python-programming/methods/list
"""

#EX 11: APPEND() - Adds an element at the end of the list
list2 = [3, 4, 5]
list2.append(6)
print(list2)

#EX 12: CLEAR() - Removes all the elements from the list
list2.clear()
print(list2)

#EX 13: COPY() - Returns a copy of the list
list3 = [0, 1, 2]
list4 =list3.copy()
print(list4)

#EX 14: COUNT() - Returns the number of elements with the specified value
list5 = [0,1,0,1,1,0,1]
print(list5.count(1)) #should print 4

#EX 15: EXTEND() - Add the elements of a list (or any iterable), to the end of the current list
lang1 = ["French", "English"]
lang2 = ["Spanish", "German"]
lang1.extend(lang2)
print(lang1)
#French English Spanish German
#  0       1       2      3   (index values)

#EX 16: INDEX() - Returns the index of the first element with the specified value
print(lang1.index("Spanish")) #should return 2

#16.5 Print out item at index 2
print(lang1[2]) #prints Spanish

#EX 17: INSERT() - Adds an element at the specified position
lang1.insert(2, "Mandarin")
print(lang1)

#EX 18: POP() - Removes the element at the specified position (index value)
lang1.pop(1)
print(lang1)

#EX 19: REMOVE() - Removes the first item with the specified value
lang1.remove("Spanish")
print(lang1)

#EX 20: REVERSE() - Reverses the order of the list
lang1.reverse()
print(lang1)

#EX 21: SORT() - Sorts the list
lang1.sort()
print("Sorted: ", lang1)
