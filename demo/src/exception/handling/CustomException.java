package exception.handling;

import java.util.Scanner;

class CustomException extends Exception {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	CustomException(int x) {
		System.out.print(Math.abs(15 - x) + " kg : is higher than valid weigth");
	}
}

class CustomExceptionExample {
	void validWeight(int weight) throws CustomException {
		if (weight > 15)
			throw new CustomException(weight);
		else
			System.out.println("You are ready to fly!");
	}

	public static void main(String[] args) {
		CustomExceptionExample ob = new CustomExceptionExample();
		Scanner in = new Scanner(System.in);
		for (int i = 0; i < 2; i++) {
			try {
				ob.validWeight(in.nextInt());
			} catch (CustomException e) {
				System.out.println(e);
			}
		}
		in.close();
	}
}