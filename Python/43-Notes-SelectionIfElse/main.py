#Derek Tang
#11.13.2020
#4.3 Notes

#Example 1 - if/else (selection)
score = int(input("Enter the score: "))
if(score>50):
  print("You Won!")
else:
  print("You Lose.")

#Example 2 - if/elif/else (selection)
grade = int(input("Enter the grade"))
if(grade>89):
  print("You got an A.")
elif(grade>79):
  print("You got an B.")
elif(grade>69):
  print("You got an C.")
elif(grade>59):
  print("You got an D.")
else:
  print("You got an F.")

#Logical and Relational Operators
# > < >= <= == !=
# 10 != ->True
# 10 != 10 -> FALSE
# not(TRUE) -> FALSE
# not(FALSE) -> TRUE

"""
AND (&&) (Python - and)
  TRUE and True = TRUE
  TRUE and FALSE = FALSE
  FALSE and TRUE = FALSE
  FALSE and FALSE = TRUE
both conditions needs to be TRUE in order for the expression to be true
"""

"""
OR (||) (Python - and)
  TRUE or True = TRUE
  TRUE or FALSE = TRUE
  FALSE or TRUE = TRUE
  FALSE or FALSE = FALSE
one conditions needs to be TRUE in order for the expression to be true
"""