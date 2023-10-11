package exception.handling;

public class ExceptionHandlingExample {
	public static void main(String[] args) {
		int a = 10;
//		int b=50/0;//ArithmeticException 
//		String s=null;  
//		System.out.println(s.length());//NullPointerException
//		String str="abc";  
//		int num=Integer.parseInt(str);//NumberFormatException
		for (int i = 3; i >= 0; i--) {
			try {
				System.out.println(a / i);
			} catch (ArithmeticException e) {
				System.out.println(e.getMessage());
			}
		}
		
		
		try {
			System.out.println(4 / 0);
		}
		// superclass of ArithmeticException
		catch (Exception e) {
			System.out.println("divide by 0");
		}
	}

}
