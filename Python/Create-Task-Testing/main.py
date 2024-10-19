import random

print("\nWelcome to the BlackJack card game calculator.")
print("This program will inform you of the total card value required to acheive a score of 20, 21, and 22.")
print("\nBefore we start would you like the value of Ace to be 1 or 11?")
AceValue = int(input("Selection: "))
print()
History=[]
Loop=0
while (Loop == 0):
  Cards=["Ace","2","3","4","5","6","7","8","9","10","Jack","Queen","King"]
  print(Cards)
  print("Please input your starting card from the ones listed above or input [Random] for a random card.")
  
  def CardValue(num1):
    if (num1.lower() == "random"):
      Card1=random.randrange(1,11)
      print("The randomly selcted card is "+ str(Card1) + "!")
    elif (num1.lower() == "ace"):
      Card1=AceValue
      print("You have selcted the card Ace!")
    elif (num1.lower() == "jack"):
      Card1=10
      print("You have selcted the card Jack!")
    elif (num1.lower() == "queen"):
      Card1=10
      print("You have selcted the card Queen!")
    elif (num1.lower() == "king"):
      Card1=10
      print("You have selcted the card King!")
    elif (2 <= int(num1) <= 10):
      print("You have selcted a number card!")
      Card1=num1
    else:
      print("You have selected a custom card value!")
      Card1=num1
    return Card1
  Card1=input("Selection: ")
  Card1=CardValue(Card1)
  print("The Black Jack value of this card is: "+str(Card1))
  Result=[]
  def Caculator(num1):
    res1=20-int(num1)
    Result.append(res1)
    res2=21-int(num1)
    Result.append(res2)
    res3=22-int(num1)
    Result.append(res3)
  Caculator(Card1)

  print("To achieve a point total of 20 you need to raise the total value of your cards by "+str(Result[0])+".")
  print("To achieve a perfect score you need to raise the total value of your cards by "+str(Result[1])+".")
  print("To achieve a point total of 22 you need to raise the total value of your cards by "+str(Result[2])+".")

  History.append(Card1)
  print("The values that have been caculated so far are the following: " + str(History) + ".")

  Continue = input("Would you like to continue? [Y]/[N]: ")
  if (Continue.lower() == "y"):
    print()
  elif (Continue.lower() == "n"):
    print()
    print("Thank you for using this caculator!")
    Loop = 1

"""
Result=[]
  def Caculator(num2):
    res=20-int(num2)
    Result.append(res)
  Calc1=Card1
  Caculator(Calc1)
  Calc1=int(Calc1)-1
  Caculator(Calc1)
  Calc1=int(Calc1)-1
  Caculator(Calc1)
  Calc1=int(Calc1)-1
  """