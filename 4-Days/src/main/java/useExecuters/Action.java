package useExecuters;

public class Action implements Runnable{

	int start;
	int end;
		
	public Action(int start, int end) {
		this.start = start;
		this.end = end;
	}

	@Override
	public void run() {
		for (int i = start; i < end; i++) {
			try {
				Thread.sleep(1000);
			} catch (Exception e) {}
			System.out.println(Thread.currentThread().getName()+" i : "+ i);
		}
	}
}
