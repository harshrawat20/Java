package LambdaExpressions;

import java.util.*;

public class Smartphone implements Comparable<Smartphone>{

int price;
String color;
String ModelName;

public Smartphone(String ModelName,int price,String color)
{
	this.ModelName=ModelName;
	this.price=price;
	this.color=color;
}
	
@Override
public String toString() {
	return ModelName+" "+price +" "+color;
}

@Override
public int hashCode() {
	return Objects.hash(ModelName+" "+price);
}

@Override
public boolean equals(Object obj) {
    if (this == obj) return true;
    if (obj == null || getClass() != obj.getClass()) return false;
    Smartphone other = (Smartphone) obj;
    return price == other.price &&
           Objects.equals(ModelName, other.ModelName) &&
           Objects.equals(color, other.color);
}
@Override
public int compareTo(Smartphone o) {
	if(this.price>o.price)
	{
		return 1;
	}
	else if(this.price<o.price)
	{
		return -1;
	}
	else return 0;
}
}
