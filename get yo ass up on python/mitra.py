import mysql.connector

database="client_information_db"

mydb = mysql.connector.connect(
    host="localhost",
    user="root",
    password="admin",
    
)

mycursor = mydb.cursor()

mycursor.execute(f"use {database}")

# Create a clients table if it doesn't exist

createTable = """
CREATE TABLE IF NOT EXISTS clients (
    ClientID INT AUTO_INCREMENT PRIMARY KEY,
    firstname VARCHAR(255),
    lastname VARCHAR(255),
    email VARCHAR(255),
    phonenumber VARCHAR(20),
    address VARCHAR(255)
)
"""

mycursor.execute(createTable)

mydb.commit()

def create_record():
    ClientID = int(input("Enter ClientID: "))
    firstname = input("Enter First Name: ")
    lastname = input("Enter Last Name: ")
    email = input("Enter Email: ")
    phonenumber = input("Enter Phone Number: ")
    address = input("Enter Address: ")

    sql = "INSERT INTO clients (ClientID, firstname, lastname, email, phonenumber, address) VALUES (%s, %s, %s, %s, %s, %s)"
    val = (ClientID, firstname, lastname, email, phonenumber, address)

    mycursor.execute(sql, val)
    mydb.commit()
    print("Record added!")

def read_records():
    mycursor.execute("SELECT * FROM clients")
    records = mycursor.fetchall()
    for record in records:
        print(f"ClientID: {record[0]}, firstname: {record[1]}, lastname: {record[2]}, email: {record[3]}, phonenumber: {record[4]}, address: {record[5]}")

def update_record():
    ClientID = int(input("Enter ClientID to update: "))
    firstname = input("Enter new First Name: ")
    lastname = input("Enter new Last Name: ")
    email = input("Enter new Email: ")
    phonenumber = input("Enter new Phone Number: ")
    address = input("Enter new Address: ")

    sql = "UPDATE clients SET firstname = %s, lastname = %s, email = %s, phonenumber = %s, address = %s WHERE ClientID = %s"
    val = (firstname, lastname, email, phonenumber, address, ClientID)

    mycursor.execute(sql, val)
    mydb.commit()

    if mycursor.rowcount == 1:
        print("Record updated successfully!")
    else:
        print("Record not found.")

def delete_record():
    ClientID = int(input("Enter ClientID to delete: "))

    sql = "DELETE FROM clients WHERE ClientID = %s"
    val = (ClientID,)

    mycursor.execute(sql, val)
    mydb.commit()

    if mycursor.rowcount == 1:
        print("Record deleted successfully!")
    else:
        print("Record not found.")

def main():
    while True:
        print("CRUD MENU:")
        print("1. Create Record")
        print("2. Read Records")
        print("3. Update Record")
        print("4. Delete Record")
        print("5. Exit")

        choice = input("Enter your choice: ")

        if choice == "1":
            create_record()
        elif choice == "2":
            read_records()
        elif choice == "3":
            update_record()
        elif choice == "4":
            delete_record()
        elif choice == "5":
            print("Program ended.")
            break
        else:
            print("Invalid choice. Please select a valid option.")

mydb.close()

if __name__ == '__main__':
    main()