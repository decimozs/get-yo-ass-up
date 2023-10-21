import sys

def add (number1, number2):
    return number1 + number2

def subtract (number1, number2):
    return number1 - number2

def multiply (number1, number2):
    return number1 * number2

def divide (number1, number2):
    return number1 / number2

while True:
    print("[1] Add ")
    print("[2] Subtract ")
    print("[3] Multiply ")
    print("[4] Divide ")
    print("[5] Exit")

    operation = input("Enter your operations: ")

    if operation == '1':
        number1 = int(input("Enter number 1: ")) 
        number2 = int(input("Enter number 2: ")) 
        sum = add(number1, number2)
        print(f"Result: {sum}")
    elif operation == '2':
        number1 = int(input("Enter number 1: ")) 
        number2 = int(input("Enter number 2: ")) 
        difference = add(number1, number2)
        print(f"Result: {difference}")
    elif operation == '3':
        number1 = int(input("Enter number 1: ")) 
        number2 = int(input("Enter number 2: ")) 
        product = add(number1, number2)
        print(f"Result: {product}")
    elif operation == '4':
        number1 = int(input("Enter number 1: ")) 
        number2 = int(input("Enter number 2: ")) 
        quotient = add(number1, number2)
        print(f"Result: {quotient}")
    elif operation == '5':
        sys.exit()
    else:
        print("Invalid Operation")

