import sys

student = []

def create_student():
    print("\n[CREATE A STUDENT RECORD]\n")
    name = input(str("Name: "))
    
    while True:
        try:
            age = int(input("Age: "))
            break
        except ValueError:
            print("Please enter a valid integer for Age.")
    
    while True:
        try:
            student_id = int(input("Student id: "))
            break
        except ValueError:
            print("Please enter a valid integer for Student ID.")
            
    course = input(str("Course: "))
    year_and_section = input(str("Year and Section: "))
    data = {"Name" : name, "Age" : age, "Student id" : student_id, "Course" : course, "Year and Section" : year_and_section}
    student.append(data)
    
    print("\nSuccessfully created!\n")

def read_student():
    print("\n[READ A STUDENT RECORD]\n")
    
    if len(student) <= 0:
        print("\n[NOTE]")
        print("\nNo student in a list. Please insert first a student, before reading a student record\n")
        return
    
    print("[1] Retrieve all the student records")
    print("[2] Retrieve a specific student's individual record")

    choice = input("\nEnter your choice: ")
    
    if choice == '1':
        for index, data in enumerate(student):
            print(f"\n[Student Information]")
            print(f"Student Id: {data['Student id']}")
            print(f"Name: {data['Name']}")
            print(f"Age: {data['Age']}")
            print(f"Course: {data['Course']}")
            print(f"Year and Section: {data['Year and Section']}\n")
    else:
        student_number = int(input("Enter the student id: "))
        for index, data in enumerate(student):
            if data['Student id'] == student_number:
                print(f"\n[Student Information]")
                print(f"Student Id: {data['Student id']}")
                print(f"Name: {data['Name']}")
                print(f"Age: {data['Age']}")
                print(f"Course: {data['Course']}")
                print(f"Year and Section: {data['Year and Section']}\n")
    
def update_student():
    print("\n[UPDATE STUDENT RECORD]\n")
    
    if len(student) <= 0:
        print("\n[NOTE]")
        print("\nNo student in a list. Please insert first a student, before updating a student record.\n")
        return
    
    student_number = int(input("Enter the student id: "))
    
    found = False
    
    for index, data in enumerate (student):
        if data['Student id'] == student_number:
            found = True
            name = input(str("Name: "))
            age = input("Age: ")
            course = input(str("Course: "))
            year_and_section = input(str("Year and Section: "))
            student[index]['Name'] = name
            student[index]['Age'] = age
            student[index]['Course'] = course
            student[index]['Year and Section'] = year_and_section
            
            print("\nSuccessfully updated the student record!\n")
            break
        
    if not found:
        print("\n[NOTE]")
        print("Invalid student id! Please enter a valid student id.")
    
def delete_student():
    print("\n[DELETE STUDENT RECORD]\n")
    
    if len(student) <= 0:
        print("\n[NOTE]")
        print("\nNo student in a list. Please insert first a student, before removing a student record.\n")
        return
    
    student_number = int(input("Enter the student id:"))
    found = False
    for data in student:
        if data['Student id'] == student_number:
            found = True
            student.remove(data)
            print("\nSucessfully deleted a student data!\n")
            break
            
    if not found:
        print("\n[NOTE]")
        print("\nInvalid student id! Please enter a valid student id.\n")
    
def exit_app():   
    print("\nName: Martin, Marlon A.")
    print("Year and Section: BSIT - 2C")
    print("Thank you for using the simple crud app!") 
    sys.exit(0)
    
def main():
    while True:
        print("\n[CRUD APPLICATION] - COLLEGE STUDENT MANAGEMENT SYSTEM\n")
        print("[1] CREATE STUDENT")
        print("[2] READ STUDENT")
        print("[3] UPDATE STUDENT")
        print("[4] DELETE STUDENT")
        print("[5] EXIT")
        
        choice = input("\nEnter your choice: ")
        
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
            print("\n[NOTE]")
            print("Invalid choice! Please enter a valid option.")
            
if __name__ == '__main__':
    main()
        
        

    