# Given list of numbers
numList = list(input("Enter a sequence of comma separated values: ").split(", "))
print("User Entered list is ", numList)


# Check if first and last element are equal
if (numList[0] == numList[-1]):
    print(True)
else:
    print(False)