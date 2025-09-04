package assignment;
//Superclass
class Animal {
 // Method to be overridden
 void sound() {
     System.out.println("Animal makes a sound");
 }
}

//Interface
interface Playable {
 void play(); // Abstract method
}

//Subclass Dog that extends Animal and implements Playable
class Dog extends Animal implements Playable {

 // Overriding the sound method from Animal
 
 void sound() {
     System.out.println("Dog makes a sound: Woof");
 }

 // Implementing play method from Playable interface
 
 public void play() {
     System.out.println("Dog can play: Yes");
 }
}
//Main class
public class Assignment2_q4 {

	public static void main(String[] args) {
		 Dog myDog = new Dog();
	     // Demonstrating method overriding
	     myDog.sound();
	     // Demonstrating interface implementation
	     myDog.play();

	}
}
