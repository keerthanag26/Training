package exception.handling;

public class ThrowExample {
	static void canVote(int age) throws Exception {
		if (age < 18) {
			
				throw new ArithmeticException();
			
		} 
		else {
			System.out.println("you can vote!");
		}
	}

	public static void main(String[] args) {
		try {
			canVote(20);
		} catch (Exception e) {
			
			e.printStackTrace();
		}
		try {
			canVote(10);
		} catch (Exception e) {
	
			e.printStackTrace();
		}
	}
}
