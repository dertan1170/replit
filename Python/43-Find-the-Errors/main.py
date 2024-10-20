# The purpose of the code below is to calculate the surface area of a sphere using a randomly generated number as the radius.
# Add the random and math modules to use their functions
import random 
import math 

# Prompt the user for the lower and upper bounds
lower = float(input("Enter in a small decimal number: ")) 
upper = float(input("Enter in a large decimal number: "))

# Create a random decimal value and store it into the variable radius
radius=random.uniform(lower, upper)

# Calculates the surface area of a sphere
surfaceArea = 4 * math.pi * math.sqrt(radius)  

# Outputs the solution back to the user
print("The surface area of a sphere with radius, " + str(radius) + ", is: " + str(surfaceArea))

"""
1.The I in "Import random" can't be captilised and should be "import random".
2.Use * instead of x in "surfaceArea = 4 x math.pi x math.sqrt(radius)"
3.Math shoudn't be catpilised in "import Math"
4.Missing an input in this code "upper = float("Enter in a large decimal number: ")" it should be "upper = float(input("Enter in a large decimal number: "))"
5. The random decimal generated isn't set to a variable radius it should be "radius=random.uniform(lower, upper)"
6. The int should be a float since we're asking for a small decimal number in this line of code "lower = int(input("Enter in a small decimal number: ")) "
7. In this line "print("The surface area of a sphere with radius, " + radius + ", is: " + volume)" we're suppose to output the surfaceArea not the volume.
8. In the code mentioned in line 7 the variables also need to be converted to strings.
"""