# Derek Tang
# 12.01.2020
# 4.4 Exercise A

#1
number=int(input("Input a number from 1 to 100: "))
while int(number) <1 or int(number) >100:
  print("The number entered is invalid")
  number=input("Input a number from 1 to 100: ")
print("Thank You")
#2
color=input("Guess my Favorite Color: ")
guess=0
while color != "blue":
  print("That's not my Favorite Color")
  guess=guess+1
  color=input("Guess my Favorite Color: ")
print("That's Correct.")
print("It took you "+str(guess)+" guess(es).")
#3
Sum=0
number1=int(input("How many numbers do you want to add? "))
for x in range(number1):
  number2=input("Input One of the Numbers: ")
  Sum=Sum+int(number2)
print("The sum is: "+str(Sum))