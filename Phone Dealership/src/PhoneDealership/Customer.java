package PhoneDealership;

public class Customer {
String name;
int cash;

public Customer(String name,int cash)
{
	this.name=name;
	this.cash=cash;
}
public void buy(Smartphone sm1)
{
	System.out.println(name+" Tring to buy the smartphone: "+sm1);
	
}

@Override
public String toString()
{
	return this.name;
}
}
