package LambdaExpressions;

import java.util.*;
import java.util.function.Function;
import java.util.function.Predicate;

public class BuiltInFunctionalInterfaces {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList<Smartphone> arr= new ArrayList<>();
		arr.add(new Smartphone("iphone 11",60000,"red"));
		arr.add(new Smartphone("iphone 12",70000,"red"));
		arr.add(new Smartphone("iphone 13mini",70000,"red"));
		arr.add(new Smartphone("galaxy s21",60000,"black"));
		arr.add(new Smartphone("galaxy flip3",85000,"blue"));
		arr.add(new Smartphone("galaxy fold 3",150000,"grey"));
		arr.add(new Smartphone("Xiomi mi mix 4",70000,"white"));
		arr.add(new Smartphone("Google Pixel 6",80000,"black"));
		
		System.out.println("Enter the price range");
		findPhones(arr,(sm)->{
			if(sm.price>=70000 && sm.price<=90000)
			{
				return true;
			}
			return false;
	
		});
	    System.out.println("Red Colored phones");
	    
	    findPhones(arr,(sm)->{
	    	if(sm.color.equals("red")) {
	    		return true;
	    	}
	    	return false;
	    });
	    
	    Function<Smartphone,String> print=(sm)->{
	    	return sm.color+" "+sm.ModelName;
	    };
		System.out.println(print.apply(arr.get(1)));
	}
	public static void findPhones(ArrayList<Smartphone>smp,Predicate<Smartphone>pd)
	{
		for(Smartphone sm:smp)
		{
			if(pd.test(sm))
			{
				System.out.println(sm);
			}
		}
	}
}

// Built in predicate that has a method test(test conditon)
// Function<T,R> has a apply functionality
