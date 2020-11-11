package com.gokhan.fourdays.usethread;

import java.util.Random;

public class MainThread {

	public static void main(String[] args) throws InterruptedException {
		Action action=new Action(new Random(),"A");
		Thread thread=new Thread(action);
		thread.start();
		
		Action action2=new Action(new Random(),"BB");
		Thread thread2=new Thread(action2);
		thread2.start();
		
		

		thread.join();
		thread2.join();
		System.out.println("main");
	}

}
