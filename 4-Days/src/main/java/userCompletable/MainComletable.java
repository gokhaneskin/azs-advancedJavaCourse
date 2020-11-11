package userCompletable;

import java.util.concurrent.CompletableFuture;

public class MainComletable {

	public static void main(String[] args) {
		CompletableFuture<Void> future1=CompletableFuture.runAsync(()->{
			for (int i = 0; i < 30; i++) {
				try {
					System.out.println("ft1 - Call: "+ i);
					Thread.sleep(500);
				} catch (Exception e) {
				}
			}
		});
		CompletableFuture<Void> future2=CompletableFuture.runAsync(()->{
			for (int i = 0; i < 30; i++) {
				try {
					System.out.println("ft2 - Call: "+ i);
					Thread.sleep(500);
				} catch (Exception e) {
				}
			}
		});
		
		CompletableFuture<Void> allOff= CompletableFuture.allOf(future1,future2);
		System.out.println("All Thread Run Call");
		allOff.join();
		System.out.println("All Thread Finish");
	}
}
