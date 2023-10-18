package threads;

class TestSleepMethod1 extends Thread {
	public void run() {
		for (int i = 1; i <= 10; i++) {
			// the thread will sleep for the 500 milli seconds
			try {
				Thread.sleep(1000); // if value is negative throws exception IllegalArgumentException: timeout value is negative
			} catch (InterruptedException e) {
				System.out.println(e);
			}
			System.out.println(i);
			//System.out.println(Thread.currentThread());    
		}
	}

	public static void main(String args[]) {
		TestSleepMethod1 t1 = new TestSleepMethod1();
		TestSleepMethod1 t2 = new TestSleepMethod1();

		t1.start();
		t2.start();
	}
}