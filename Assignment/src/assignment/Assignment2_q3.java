package assignment;
class Student {
    // Attributes (instance variables)
    String name;
    int age;
    String grade;
    // Constructor to initialize attributes
    Student(String name, int age, String grade) {
        this.name = name;   // 'this' refers to the current object's variable
        this.age = age;
        this.grade = grade;
    }
    // Method to display student information
    void displayInfo() {
    	System.out.println("Student Information:");
    	System.out.println("Student Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Grade: " + grade);
    }
}

public class Assignment2_q3 {

	public static void main(String[] args) {
		// Creating an object of Student class using constructor
        Student student1 = new Student("Harsh", 20, "A");
        // Displaying student information
        student1.displayInfo();
	}

}
