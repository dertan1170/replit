# Name: Derek Tang
# Date: 12/9/20
# 4.6 Exercise A
import random
#Procedure
# 1. Define the Procedure
# 2. Call the Procedure

def compare(a,b):
  if (a>b):
    print(str(a)+" is less than "+str(b))
  elif (a<b):
    print(str(b)+" is less than "+str(a))
  else:
    print("The values are equal.")

for x in range(3):
  x=int(input("Enter an integer: "))
  y=int(input("Enter a second integer: "))
  compare(x,y)

def eliminate(num):
  random.shuffle(names)
  for x in range(num):
    names.pop(0)
  return names

names=[]
for x in range(6):
  name=input("Insert a random name: ")
  names.append(name)
print(names)

vote1=int(input("How many people do you want voted off the island? "))
peopleleft=eliminate(vote1)

print("Remaining people: "+str(peopleleft))
print("Remaining people:",names)