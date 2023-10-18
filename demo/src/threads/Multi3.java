package threads;

class Multi3 implements Runnable {
	public void run() {
		System.out.println("thread is running...");
	}

	public static void main(String args[]) {
		Multi3 m1 = new Multi3();
		Thread t1 = new Thread(m1); // Using the constructor Thread(Runnable r)

		System.out.println(t1.getState());
		t1.start();
		System.out.println(t1.getState());
		// getName()
		Thread t = new Thread("My first thread");
		// the start() method moves the thread to the active state
		t.start();
		t1.stop();
		// getting the thread name by invoking the getName() method
		String str = t.getName();
		System.out.println(str);

		System.out.println(t1.getState());

		//System.out.println(t.getState());
	}
}