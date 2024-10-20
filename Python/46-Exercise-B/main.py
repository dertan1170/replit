# Name: Derek Tang
# Date: 12/11/20
# 4.6 Exercise B

def GPAcalc(grade):
  if grade=="A" or grade=="a":
    return "4"
  elif grade=="B" or grade=="b":
    return "3"
  elif grade=="C" or grade=="c":
    return "2"
  elif grade=="D" or grade=="d":
    return "1"
  elif grade=="F" or grade=="f":
    return "0"
  else:
    return "Invalid"

Grade=input("Input your letter grade: ")
x=GPAcalc(Grade)
print("Your GPA is: " + str(x))