package LambdaExpressions;

public class Lambda {
public static void main(String[] args)
{
//	send(()->{
//		System.out.println("Sending the message");
//	});
	
	//OR
	
	Message m1=()->{
		System.out.println("Sending the message");
	};
	send(m1);
}
public static void send(Message msg)
{
	msg.sendMessage();
}
}
