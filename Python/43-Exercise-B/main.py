#Derek Tang
#11/18/20
#4.3 Exercise B
name = input("Please Enter Your Name: ")
integer1 = int(input(str(name) + ", Please Enter An Integer: "))
integer2 = int(input(str(name) + ", Please Enter Another Integer: "))
result = integer1 % integer2
if(result == 0):
  print(str(integer1) + " is divisible by " + str(integer2))
else:
  print(str(integer1) + " is not divisible by " + str(integer2))