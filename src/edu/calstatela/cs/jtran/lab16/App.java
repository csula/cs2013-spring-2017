package edu.calstatela.cs.jtran.lab16;

class Task implements Runnable {
	private final int id;
	Task(int id) {
		this.id = id;
	}
	
	public void run() {
		final int belle = (int)(Math.random() * 10) + 1;
		System.out.printf("[%d %d] start\n", id, belle);
		try {
			Thread.sleep( belle * 1);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.printf("[%d %d] finish\n", id, belle);
	}	
}

public class App {
	public static void main(String[] args) {
		new App().execute();
	}
	
	private final int tcount = 10000;
	
	public void execute() {
		Thread[] threads = new Thread[tcount];
		for (int i = 0; i < tcount; i++) {
			threads[i]  = new Thread( new Task(i) );
		}
		for (int i = 0; i < tcount; i++) {
			threads[i].start();
		}
		
		System.out.println("program finishes");
	}
}
