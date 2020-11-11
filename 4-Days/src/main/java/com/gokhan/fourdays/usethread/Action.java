package com.gokhan.fourdays.usethread;

import java.util.Random;

public class Action implements Runnable{
	Random random=null;
	String data="";
	public Action(Random random, String data) {
		this.random=random;
		this.data= data;
	}
	
	
	@Override
	public void run() {
		try {
			int i=0;
			for (;;) {
				System.out.println("Action Call- "+ data + "-" + random.nextInt()+" ClassName: "+this.getClass().hashCode());
				Thread.sleep(1000);
				i++;
				if(i==10) break;
			}
		} catch (Exception e) {
			// TODO: handle exception
		}
	}	
}
