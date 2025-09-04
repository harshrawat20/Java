package assignment;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedList;

public class Assignment3_q4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> al=new ArrayList<>();
		al.add("Apple");
		al.add("Banana");
		al.add("Apple");
		System.out.println("ArrayList elements: "+al);
		
		LinkedList<String>ll=new LinkedList<>();
		ll.add("Dog");
		ll.add("Cat");
		ll.add("Dog");
		System.out.println("LinkedList elements: "+ll);
		
		HashSet<String> hs = new HashSet<>();
		hs.add("Red");
		hs.add("Green");
		hs.add("Blue");
		hs.add("Red"); // duplicate, will not be added

        System.out.println("HashSet elements: " + hs);
     // Explanation of differences
        System.out.println("\n--- Differences between ArrayList, LinkedList, and HashSet ---");
        System.out.println("1. ArrayList: Stores elements in a resizable array. Maintains insertion order. Allows duplicates.");
        System.out.println("2. LinkedList: Stores elements as nodes with pointers. Maintains insertion order. Allows duplicates.");
        System.out.println("3. HashSet: Stores unique elements only (no duplicates). Does not guarantee order.");
    
	}

}
