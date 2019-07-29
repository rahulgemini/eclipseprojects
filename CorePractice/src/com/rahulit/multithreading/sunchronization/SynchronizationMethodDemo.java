package com.rahulit.multithreading.sunchronization;

public class SynchronizationMethodDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Display d1=new Display();
		MyThread t1=new MyThread(d1, "Rahul");
		MyThread t2=new MyThread(d1, "Hari");
		t1.start();
		t2.start();
	}

}
class MyThread extends Thread{
	Display d;
	String name;
	public MyThread(Display d, String name) {
		// TODO Auto-generated constructor stub
		this.d=d;
		this.name=name;
	}
	@Override
	public void run() {
		 d.displayName(name);
	}
}