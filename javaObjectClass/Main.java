package javaObjectClass;

class Student {
    String name;
    int rollNumber;
    double marks;

    // Constructor
    Student(String name, int rollNumber, double marks) {
        this.name = name;
        this.rollNumber = rollNumber;
        this.marks = marks;
    }

    // Method to display student details
    void displayDetails() {
        System.out.println("Name: " + name + ", Roll Number: " + rollNumber + ", Marks: " + marks);
    }
}

public class Main {
    public static void main(String[] args) {
        Student student = new Student("Alice", 101, 89.5);
        student.displayDetails();  // Output: Name: Alice, Roll Number: 101, Marks: 89.5
    }
}


// class Student{
//     String name;
//     int rollNumber;
//     double marks;

//     // Constructor
//     Student(String name, int rollNumber, double marks){
//         this.name = name;
//         this.rollNumber = rollNumber;
//         this.marks = marks;
//     }

//     // method to display student details
//     void displayDetails(){
//         System.out.println("NAME: "+ name+ " , Roll Number: "+ rollNumber +" ,Marks: "+ marks);
//     }
// }

// public class Main {
//     public static void main(String[] args) {
//         Student student = new Student("Alice", 10, 8.9);
//         student.displayDetails();
//     }    
// }
