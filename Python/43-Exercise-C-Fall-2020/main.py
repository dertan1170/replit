# Derek Tang
# 11.20.2020
# 4.3 Exercise C - (Fall 2020)
import random
import math

#THIS IS THE START OF PROGRAM 1
smallDec=float(input("Enter a small decimal: "))
largeDec=float(input("Enter a large decimal: "))
radius=(random.uniform(smallDec, largeDec))
volume=(4/3)*math.pi*radius**3
print("If the radius of a sphere is "+str(radius)+ " then the volume is "+str(volume))

#THIS IS THE START OF PROGRAM 2
response=input("Is apple pie delicious? ")
if(response=='True' or response=='true'):
  print("That's correct")
elif(response=='T' or response=='t'):
  print("That's correct")
elif(response=='False' or response=='false'):
  print("That's incorrect")
elif(response=='F' or response=='f'):
  print("That's incorrect")
else:
  print("That's an invalid answer")