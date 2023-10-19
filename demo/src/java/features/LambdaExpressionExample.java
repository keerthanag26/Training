package java.features;

@FunctionalInterface
interface Sayable {
	
	public String say(); // abstract method
	
	// It can contain any number of Object class methods.
	int hashCode();
	String toString();
	boolean equals(Object obj);
}

public class LambdaExpressionExample {
	public static void main(String[] args) {
		Sayable s = () -> {
			return "I have nothing to say.";
		};
		System.out.println(s.say());
	}
}