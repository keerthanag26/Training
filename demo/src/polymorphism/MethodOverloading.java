package polymorphism;

class Adder {
	int add(int a, int b) {
		return a + b;
	}

	int add(int a, int b, int c) {
		return a + b + c;
	}

	double add(double a, double b) {
		return a + b;
	}
}

class MethodOverloading {
	public static void main(String[] args) {
		
		Adder sum = new Adder();
		System.out.println(sum.add(11, 11));
		System.out.println(sum.add(11, 11, 11));
		System.out.println(sum.add(12.3, 12.6));
	}
}