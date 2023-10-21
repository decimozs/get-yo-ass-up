#     Create a program that will get the cube root of the given
#     number. (5 pts)

import math

def cubeRoot(number):
    return round(math.pow(number, 1/3), 2)

def main():
    number = float(input("Please enter a number: "))
    result = cubeRoot(number)
    print(f"The cube root of {number} is approximately {result}.")

if __name__ == "__main__":
    main()
