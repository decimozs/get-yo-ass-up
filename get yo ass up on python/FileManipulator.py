import os

def readFile():
    print("\nRead File")
    filename = input("\nEnter the filename you want to read: ")
    try:
        with open(filename, 'r') as file:
            content = file.read()
            print("\n")
            print(f"---{filename}------")
            print(content)
            print("--------------------")
    except FileNotFoundError:
        print("\nFile not found!")
        print("Please input a valid filename that exist!")
def writeFile():
    print("\nWrite File")
    filename = input("\nEnter the filename you want to write: ")
    content = input("Enter the content you want to write on the file: ")
    try:
        with open(filename, 'w') as file:
            file.write(content)
            print(content)
    except FileNotFoundError:
        print("\nFile not found!")
        print("Please input a valid filename that exist!")
def appendFile():
    print("\nAppend File")
    filename = input("\nEnter the filename: ")
    if os.path.isfile(filename):
        try:
            content = input("\nEnter the content you want to append: ")
            with open(filename, 'a') as file:
                file.write('\n' + content)
                print(f"\nContent appended to the {filename}")
        except FileNotFoundError:
            print("\nFile not found!")
    else:
        print("\nCannot append, your filename cannot found!")
        print("Please input a valid filename that exist!")

def main():
    while True:
        print("\nMenu")
        print("[1] Read File")
        print("[2] Write File")
        print("[3] Append File")
        print("[4] Exit")

        choice = input("Enter your choice: ")

        if choice == '1':
            readFile()
        elif choice == '2':
            writeFile()
        elif choice == '3':
            appendFile()
        elif choice == '4':
            print("Program Terminated!")
            print("Exiting Program...")
            break
        else:
            print("Invalid Choice")
            print("Please input a valid choice!")

if __name__ == '__main__':
    main()
