package java.features;

interface Sayable1 {
	public String say(String name);
}

interface Addable {
	int add(int a, int b);
}

public class LambdaExpressionExample1 {
	public static void main(String[] args) {

		// Lambda expression with single parameter.
		Sayable1 s1 = (name) -> {
			return "Hello, " + name;
		};
		System.out.println(s1.say("Sonoo"));

		// You can omit function parentheses
		Sayable1 s2 = name -> {
			return "Hello, " + name;
		};
		System.out.println(s2.say("Sonoo"));

		 // You can pass multiple statements in lambda expression  
		Sayable1 person = (message) -> {
			String str1 = "I would like to say, ";
			String str2 = str1 + message;
			return str2;
		};
		System.out.println(person.say("time is precious."));

		// Lambda expression without return keyword.
		Addable ad1 = (a, b) -> (a + b);
		System.out.println(ad1.add(10, 20));

		// Lambda expression with return keyword.
		Addable ad2 = (int a, int b) -> {
			return (a + b);
		};
		System.out.println(ad2.add(100, 200));
	}
}