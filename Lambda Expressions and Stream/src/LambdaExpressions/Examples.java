package LambdaExpressions;

public class Examples {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Print helloWorld=()->{
        	System.out.println("hello World!");
        };
        helloWorld.print();
        
        
        AddNum m2=(num)->{
    		num=num+10;
    		return num;
    	};
    	
    	System.out.println(m2.added(20));
    	
    	 Concatenated m3=(str1,str2)->{
     		
     		return str1+str2;
     	};
     	
     	System.out.println(m3.add("Harsh ","Rawat"));
	}

	
//	public int add10(int num)
//	{
//		num=num+10;
//		return num;
//	}  Make a lambda exp similar to this 
	
	
	
	
}

@FunctionalInterface
interface Print{
	public void print();
}

@FunctionalInterface
interface AddNum{
	public int added(int n);
}

@FunctionalInterface
interface Concatenated{
	public String add(String str1,String str2);
}

