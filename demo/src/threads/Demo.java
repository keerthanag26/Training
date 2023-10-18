package threads;

class A extends Thread {
	public void run() {
		for (int i = 1; i <= 100; i++) {
			System.out.println("Thread 1 : Hi");
		}
	}
}

class B extends Thread {
	public void run() {
		for (int i = 1; i <= 100; i++) {
			System.out.println("Thread 2 : Hello");
		}
	}
}

public class Demo {
	public static void main(String[] args) throws NumberFormatException {

		A obj1 = new A();
		B obj2 = new B();

		// obj1.show();
		// obj2.show();

		obj1.start();
		obj2.start();
	}

}
