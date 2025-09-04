package PhoneDealership;

public class PhoneDealership {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Smartphone sm1= new Smartphone("Iphone 13",75000,"red");
		Smartphone sm2= new Smartphone("Iphone 12",60000,"blue");
		Smartphone sm3= new Smartphone("galaxy flip3",85000,"black");
		Smartphone sm4= new Smartphone("Glaxy fold 3",150000,"white");
		
		
		Employee e1=new Employee("John",1);
		Employee e2=new Employee("Ayush",2);
		Employee e3=new Employee("Harsh",3);
		
		Customer cm1=new Customer("Madhav",80000);
		Customer cm2=new Customer("Rusty",90000);
		Customer cm3=new Customer("Rebel",40000);
		
		cm1.buy(sm1);
		e1.sellPhone(cm1, sm1);
		
		cm2.buy(sm4);
		e1.sellPhone(cm2, sm4);
		
		cm3.buy(sm2);
		e2.sellPhone(cm3, sm2);
		

	}

}
