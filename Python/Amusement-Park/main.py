#Name: Derek Tang
#Date: 12/17/2020
#Fall Final Exam - APCSP - Amusement Park
import random
print("|------------------- Amusement Park -------------------|")
Parks=["Disney Land", "California Adventure", "Walt Disney World", "Universal Studios", "Knotts Berry Farm", "Magic Kingdom Park", "Cedar Point"]
random.shuffle(Parks)
print("You arrive at: "+Parks[1])
Food=[]
Price=[]
count1=0
for x in range(1,5):
  food=input("Enter food item #"+str(x)+": ")
  Food.append(food)
  price=float(input("Enter the price of "+str(Food[count1]+": $")))
  Price.append(price)
  count1=count1+1
print("List of food items:")
print(Food)
print("Price of food items:")
print(Price)
count2=0
Total=0
for x in range(1,5):
  Total=Total+float(Price[count2])
  count2=count2+1
print("Total price of food: $"+str(Total))
cash=15
def spending(num):
  if(Total<=cash):
    left=num-Total
    print("You didn't spend all your money! You have $"+str(left)+" left over.")
  else:
    borrow=Total-num
    print("You spent all your money, so you had to borrow $"+str(borrow)+" from a friend.")
y=spending(cash)