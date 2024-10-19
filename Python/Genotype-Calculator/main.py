print("Welcome to my application. This application gives the possible offspring genotypes of a monohybrid cross between two parents. \nWhen entering parent genotypes, please enter Homozygous Dominant,  Heterozygous, or Homozygous Recessive")

while 1==1:
  try:
      parent1 = str(input("\nWhat is the genotype of parent #1: "))
      if parent1 != str("Homozygous Dominant") and parent1 != str("Heterozygous") and parent1 != str("Homozygous Recessive"):
       raise ValueError 
      parent2 = str(input("What is the genotype of parent #2: "))
      if parent2 != str("Homozygous Dominant") and parent2 != str("Heterozygous") and parent2 != str("Homozygous Recessive"):
        raise ValueError
      break
  except ValueError:
      print("Invalid input. Please enter either Homozygous Dominant,  Heterozygous, or Homozygous Recessive for the parent genotypes.")


parentList =[]
parentList.append(parent1)
parentList.append(parent2)

parentNumbers = []

def convert (parents):
  for a in parents:
   if a=="Homozygous Dominant":
      parentNumbers.append(int(1))
   if a=="Heterozygous":
      parentNumbers.append(int(2))
   if a=="Homozygous Recessive":
      parentNumbers.append(int(3))

convert(parentList)
cross = parentNumbers[0]*parentNumbers[1]

def outcome(b):
  if b==1:
    return("100% chance of being Homozygous Dominant")
  if b==2:
    return("50% chance of being Homozygous Dominant and 50% chance of being Heterozygous")
  if b==3:
    return("100% chance of being Heterozygous")
  if b==4:
    return("25% chance of being Homozygous Dominant, 50% chance of being Heterozygous, and 25% chance of being Homozygous Recessive")
  if b==6:
    return("50% chance of being Heterozygous and 50% chance of being Homozygous Recessive")
  if b==9:
    return("100% chance of being Homozygous Recessive")



print("\nA cross between two individuals with the genotypes " +str(parentList)+" would result in offspring that have a " +str(outcome(cross)))