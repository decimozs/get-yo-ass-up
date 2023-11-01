import mysql.connector
import sys
import os

host = "localhost"
user = "root"
password = "admin"
database = "student_management_system_db"

connection = mysql.connector.connect (
    host = host,
    user = user,
    password = password,
)

cursor = connection.cursor()

cursor.execute(f"use {database}")

create_table = """
create table if not exists students (
    student_id int primary key auto_increment,
    first_name varchar(50),
    last_name varchar(50),
    middle_name varchar(10),
    age int,
    course varchar(50),
    year_and_section varchar(50)
)
"""

cursor.execute(create_table)

connection.commit()

def create_student():
    os.system('cls')
    
    print("[CREATE STUDENT RECORD]\n")
    first_name = input("FIRST NAME: ").upper()
    last_name = input("LAST NAME: ").upper()
    middle_initial = input("MIDDLE INITAL: ").upper()
    
    while True:
        try:
            age = int(input("AGE: "))
            break
        except ValueError:
            print("\n[NOTE] - PLEASE ENTER A VALID INTEGER FOR AGE\n")
    
    course = input("COURSE: ").upper()
    year_and_section = input("YEAR AND SECTION: ").upper()
    
    insert_query = "INSERT INTO students (first_name, last_name, middle_initial, age, course, year_and_section) VALUES (%s, %s, %s, %s, %s, %s)"
    data = (first_name, last_name, middle_initial, age, course, year_and_section)
    
    cursor.execute(insert_query, data)
    connection.commit()
    
    os.system('cls')
    
    print("\n[SUCCESSFUL OPERATION] - STUDENT RECORD CREATED!\n")

def read_student():
    os.system('cls')
    
    count_query = "select count(*) from students"
    
    cursor.execute(count_query)
    length_query = cursor.fetchone()[0]
    
    if length_query == 0:
        print("\n[NOTE] - PLEASE NOTE THAT THE TABLE IS CURRENTLY EMPTY. TO READ A STUDENT RECORD, KINDLY INSERT A STUDENT ENTRY FIRST.\n")
        return
    
    print("\n[READ STUDENT RECORDS]\n")
    print("[1] RETRIEVE ALL THE STUDENT RECORDS")
    print("[2] RETRIEVE A SPECIFIC STUDENT'S INDIVIDUAL RECORD")
    print("[3] BACK TO MAIN MENU")
    
    choice = input("\n PLEASE ENTER YOUR CHOICE: ")
    
    if choice == '1':
        select_all_query = "select * from students"
        
        cursor.execute(select_all_query)
        students = cursor.fetchall()
        
        os.system('cls')
        
        for student in students:
            print("\n[STUDENT INFORMATION]\n")
            print(f"Student ID: {student[0]}")
            print(f"First Name: {student[1]}")
            print(f"Last Name: {student[2]}")
            print(f"Middle Initial: {student[3]}")
            print(f"Age: {student[4]}")
            print(f"Course: {student[5]}")
            print(f"Year and Section: {student[6]}")
            
    elif choice == '2':
        student_id = int(input("\nPLEASE ENTER THE STUDENT ID: "))
        select_specific_query = "select * from students where student_id = %s"
        
        cursor.execute(select_specific_query, (student_id,))
        student = cursor.fetchone()
        
        os.system('cls')
        
        if student:
            print("\n[STUDENT INFORMATION]\n")
            print(f"Student ID: {student[0]}")
            print(f"First Name: {student[1]}")
            print(f"Last Name: {student[2]}")
            print(f"Middle Initial: {student[3]}")
            print(f"Age: {student[4]}")
            print(f"Course: {student[5]}")
            print(f"Year and Section: {student[6]}")
            
        else:
            os.system('cls')
            print("\n[UNSUCCESSFUL OPERATION] - STUDENT NOT FOUND!\n")
            return
        
    elif choice == '3':
        return
    
    else:
        os.system('cls')
        print("\n[NOTE] - INVALID CHOICE! PLEASE ENTER A VALID OPTION.\n")
        return

def update_student():
    os.system('cls')
    
    count_query = "select count(*) from students"
    
    cursor.execute(count_query)
    length_query = cursor.fetchone()[0]
    
    if length_query == 0:
        print("\n[NOTE] - PLEASE NOTE THAT THE TABLE IS CURRENTLY EMPTY. TO UPDATE A STUDENT RECORD, KINDLY INSERT A STUDENT ENTRY FIRST.\n")
        return
    
    print("\n[UPDATE STUDENT RECORD]\n")
    student_id = int(input("\nPLEASE ENTER THE STUDENT ID: "))
    select_specific_query = "select * from students where student_id = %s"
    
    cursor.execute(select_specific_query, (student_id,))
    student = cursor.fetchone()
    
    os.system('cls')
    
    if student:
        print("\n[PLEASE SPECIFY THE MODIFICATIONS YOU WISH TO APPLY]\n")
        print("[1] UPDATE FIRST NAME")
        print("[2] UPDATE LAST NAME")
        print("[3] UPDATE MIDDLE INITIAL")
        print("[4] UPDATE AGE")
        print("[5] UPDATE COURSE")
        print("[6] UPDATE YEAR AND SECTION")
        print("[7] UPDATE ALL")
        print("[8] BACK TO MAIN MENU")
        
        update_choice = input("\n PLEASE ENTER YOUR CHOICE: ")
        
        os.system('cls')
        if update_choice == '1':
            change_first_name = input("ENTER NEW FIRST NAME: ").upper()
            update_first_name = "update students set first_name = %s where student_id = %s"
            
            cursor.execute(update_first_name, (change_first_name, student_id,))
            connection.commit()
            
            os.system('cls')
            
            print("\n[STUDENT FIRST NAME UPDATED]")
            print("[SUCCESSFULL OPERATION] - SUCCESSFULLY UPDATED STUDENT RECORD\n")
            
        elif update_choice == '2':
            change_last_name = input("ENTER NEW LAST NAME: ").upper()
            update_last_name = "update students set last_name = %s where student_id = %s" 
            
            cursor.execute(update_last_name, (change_last_name, student_id,))
            connection.commit()
            
            os.system('cls')
            print("\n[STUDENT LAST NAME UPDATED]")
            print("[SUCCESSFULL OPERATION] - SUCCESSFULLY UPDATED STUDENT RECORD\n")
            
        elif update_choice == '3':
            change_middle_initial = input("ENTER NEW MIDDLE INITIAL: ").upper()
            update_middle_inital = "update students set middle_initial = %s where student_id = %s" 
            
            cursor.execute(update_middle_inital, (change_middle_initial, student_id,))
            connection.commit()
            
            os.system('cls')
            print("\n[STUDENT MIDDLE INITAL UPDATED]")
            print("[SUCCESSFULL OPERATION] - SUCCESSFULLY UPDATED STUDENT RECORD\n")
            
        elif update_choice == '4':
            while True:
                try:
                    change_age = int(input("ENTER NEW AGE: "))
                    break
                except ValueError:
                    print("\n[NOTE] - PLEASE ENTER A VALID INTEGER FOR AGE\n")
                    
            update_age = "update students set age = %s where student_id = %s" 
            
            cursor.execute(update_age, (change_age, student_id,))
            connection.commit()
            
            os.system('cls')
            
            print("\n[STUDENT AGE UPDATED]")
            print("[SUCCESSFULL OPERATION] - SUCCESSFULLY UPDATED STUDENT RECORD\n")
            
        elif update_choice == '5':
            change_course = input("ENTER NEW COURSE: ").upper()
            update_course = "update students set course = %s where student_id = %s"
             
            cursor.execute(update_course, (change_course, student_id,))
            connection.commit()
            
            os.system('cls')
            
            print("\n[STUDENT COURSE UPDATED]")
            print("[SUCCESSFULL OPERATION] - SUCCESSFULLY UPDATED STUDENT RECORD\n")
            
        elif update_choice == '6':
            change_year_and_section = input("ENTER NEW YEAR & SECTION: ").upper()
            update_year_and_section = "update students set year_and_section = %s where student_id = %s"
             
            cursor.execute(update_year_and_section, (change_year_and_section, student_id,))
            connection.commit()
            
            os.system('cls')
            
            print("\n[STUDENT YEAR & SECTION UPDATED]")
            print("[SUCCESSFULL OPERATION] - SUCESSFULLY UPDATED STUDENT RECORD\n")
            
        elif update_choice == '7':
            change_first_name = input("ENTER NEW FIRST NAME: ").upper()
            change_last_name = input("ENTER NEW LAST NAME: ").upper()
            change_middle_initial = input("ENTER NEW MIDDLE INITIAL: ").upper()
            change_age = input("ENTER NEW AGE: ")
            change_course = input("ENTER NEW COURSE: ").upper()
            change_year_and_section = input("ENTER NEW YEAR & SECTION: ").upper()
            
            update_all_information = "update students set first_name = %s, last_name = %s, middle_initial = %s, age = %s, course = %s, year_and_section = %s WHERE student_id = %s"
            cursor.execute(update_all_information, (change_first_name, change_last_name, change_middle_initial, change_age, change_course, change_year_and_section, student_id))
            
            os.system('cls')
            
            print("\n[STUDENT RECORD UPDATED]")
            print("[SUCCESSFULL OPERATION] - SUCCESSFULLY UPDATED STUDENT RECORD\n")
            
        elif update_choice == '8':
            return
        
        else:
            print("\n[NOTE] - INVALID CHOICE! PLEASE ENTER A VALID OPTION.\n")
            return
        
    else:
        print("\n[UNSUCCESSFUL OPERATION] - STUDENT NOT FOUND!\n")
        return
        
def delete_student():
    os.system('cls')
    
    count_query = "select count(*) from students"
    cursor.execute(count_query)
    length_query = cursor.fetchone()[0]
    
    if length_query == 0:
        print("\n[NOTE] - PLEASE NOTE THAT THE TABLE IS CURRENTLY EMPTY. TO DELETE A STUDENT RECORD, KINDLY INSERT A STUDENT ENTRY FIRST.\n")
        return
    
    print("\n[DELETE STUDENT RECORD]\n")
    print("[1] DELETE A PARTICULAR STUDENT'S RECORD")
    print("[2] CLEAR ALL STUDENT RECORDS")
    print("[3] BACK TO MAIN MENU")
    
    delete_choice = input("\nPLEASE ENTER YOUR CHOICE: ")
    
    os.system('cls')
    if delete_choice == '1':
        print("\n[DELETE SPECIFIC STUDENT RECORD]\n")
        student_id = int(input("\nPLEASE ENTER THE STUDENT ID: "))
        delete_specific_query = "delete from students where student_id = %s"
        
        cursor.execute(delete_specific_query, (student_id,))
        connection.commit()
        
        os.system('cls')
        print("[SUCCESSFULL OPERATION] - SUCCESSFULLY DELETED")
        
    elif delete_choice == '2':
        delete_all_query = "delete from students"
        reset_query = "alter table students auto_increment = 1"
        
        cursor.execute(delete_all_query)
        cursor.execute(reset_query)
        connection.commit()
        
        os.system('cls')
        
        print("\n[SUCCESSFULL OPERATION] - SUCCESSFULLY DELETED ALL RECORDS\n") 
        
    elif delete_choice == '3':
        return
    
    else:
        print("\n[NOTE] - INVALID CHOICE! PLEASE ENTER A VALID OPTION.\n")
        return

def exit_app():
    os.system('cls')
    print("\n[THANK FOR USING MY SIMPLE CRUD APP!]\n")
    print("[NAME] - MARTIN, MARLON A.")
    print("[YEAR & SECTION] - BSIT - 2C\n")
    
    sys.exit(0)

def main():
    while True:
        print("\n[CRUD APPLICATION] - COLLEGE STUDENT MANAGEMENT SYSTEM\n")
        print("[1] CREATE STUDENT")
        print("[2] READ STUDENT")
        print("[3] UPDATE STUDENT")
        print("[4] DELETE STUDENT")
        print("[5] EXIT")
        
        choice = input("\nPLEASE ENTER YOUR CHOICE: ")
        
        if choice == "1":
            create_student()
        elif choice == "2":
            read_student()
        elif choice == "3":
            update_student()
        elif choice == "4":
            delete_student()
        elif choice == "5":
            exit_app()
            break
        else:
            print("\n[NOTE] - INVALID CHOICE! PLEASE ENTER A VALID OPTION.\n")
            
if __name__ == '__main__':
    main()
        
        