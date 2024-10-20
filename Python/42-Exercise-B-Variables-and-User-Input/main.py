#Derek
#11/13/2020
#4.2 Exercise B - Variables and User Input

name = input("Please enter your name: ")
#The name after this line is dependent on that the user inputs
print("Welcome " + name + ".")

age = int(input("How old are you " + name + "?"))
#I needed to change the input into an integer before I could add 10 to it.
age = age + 10
print(name + ", you will be " + str(age) + " years old in 10 years.")
#I have to make sure that the age is converted to a string before you can print it