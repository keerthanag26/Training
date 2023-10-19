package java.features;

interface Sayable2 {
	void say();
}


public class MethodReference {
	public static void ThreadStatus(){  
        System.out.println("Thread is running...");  
    }  
	public static void saySomething() {
		System.out.println("Hello, this is static method.");
	}

	public static void main(String[] args) {
		// Referring static method
		Sayable2 sayable = MethodReference::saySomething;
		// Calling interface method
		sayable.say();
		
		Thread t2=new Thread(MethodReference::ThreadStatus);  
        t2.start();   
	}
}