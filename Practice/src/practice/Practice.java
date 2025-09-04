package practice;

import java.util.ArrayList;
import java.util.Iterator;

public class Practice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		System.out.println("Hello World!");
		
		genericsPractise<Integer,String> o1=new genericsPractise<>(100,"toyota");
		int x=o1.get1();
		
		System.out.println(x);
		
		genericsPractise<String,String> o2=new genericsPractise<>("apple","mango");
		String s1 =o2.get1();
		String s2 =o2.get2();
		System.out.println(s1);
		System.out.println(s2);
		
		ArrayList<Integer> a1=new ArrayList<>();
		a1.add(1);
		a1.add(2);
		a1.add(3);
		
		ArrayList<Integer> a2=new ArrayList<>();
		a1.add(10);
		a1.add(20);
		a1.add(30);
		
		ArrayList<Integer> ans=fxn(a1,a2);
		
		Iterator<Integer> it=ans.listIterator();
		while(it.hasNext())
		{
			System.out.println(it.next());
		}
		
		
		Object o=new Object();
		String str="apple";
		
//		Object class is a parent class of all classes in Java
		o=str;
		//The above is allowed but the same thing is not allowed in generics
		
		ArrayList<Object> arr=new ArrayList<>();
		ArrayList<String> arr2=new ArrayList<>();
		
//		arr=arr2;  Not possible
		
		
		// <?> used as wild card it tells any data type can be used here 
		// While using generic classes we were not able to assign 
		ArrayList<?> arr3=new ArrayList<>();
		arr3=arr2;// Allowed
		
//		With ? you can use extends {className} specifying all the child classes can be used with this to point
//		With ? you can use super {className} specifying all the parent classes can be used with this to point
		ArrayList<? extends Fruits> arr4=new ArrayList<>();
		ArrayList<Apple> arr5=new ArrayList<>();		
		arr4=arr5;
		
		ArrayList<Object> arr6=new ArrayList<>();
//		arr4=arr6;//Not Possible as object is parent
		
		
		
	}
	public static <E> ArrayList<E> fxn (ArrayList<E> a1,ArrayList<E> a2)
	{
		ArrayList<E> ans=new ArrayList<E>();
		ans.addAll(a1);
		ans.addAll(a2);
		return ans;
		
	}
	

}
