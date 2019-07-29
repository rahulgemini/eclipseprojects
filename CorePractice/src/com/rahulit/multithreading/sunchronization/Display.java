package com.rahulit.multithreading.sunchronization;

public class Display {
	
	public synchronized void displayName(String name) {
		for(int i=0;i<10;i++) {
			System.out.println("Your name is: "+name);
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
	}
	
}
