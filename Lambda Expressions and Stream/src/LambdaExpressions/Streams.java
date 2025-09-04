package LambdaExpressions;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Streams {

	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub
//		IntStream    //source
//		.range(5,20) //source
//		.forEach((x)->{
//			System.out.println(x); //final ops
//		});
//		
////This will loop through all values starting from 5 till 20 and print them out , last value not included
		
//		IntStream    //source
//		.range(5,20) //source
//		.skip(7)     // Intermediate operations
//		.forEach((x)->{
//			System.out.println(x); //final ops
//		});
//This will loop through all values starting from 5 till 20 and print them out; skipping the first 7 values , last value not included

//		Stream.of("Hello","Welcome","I","Am","Harsh") //source
//		.sorted()   //sorting intermediary ops
//		.findFirst() //finding first value
//		.ifPresent((x)->System.out.println(x));  //remove null pointer exceptions
		
//		Arrays.stream(new int[] {1,2,3,4}) //source
//		.map((x)->x*x*x)// mapping (Inter ops)
//		.average()
//		.ifPresent(n->System.out.println(n));
		
		
		// now streaming on files
		Stream<String>lines=Files.lines(Paths.get("src/LambdaExpressions/word.txt"));
		
		lines.sorted()
		.forEach((x)->System.out.println(x));
		
		lines.close();
	}

	
}
