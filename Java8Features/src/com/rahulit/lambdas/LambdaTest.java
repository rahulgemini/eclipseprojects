package com.rahulit.lambdas;

public class LambdaTest {
 public static void main(String[] args) {
	MathHelper h=(a,b)->a+b;
	//MathHelper h1=()->System.out.println();
	System.out.println(h);
	System.out.println(h.operate(1, 2));
	CalculateHelper c=w->5;
	MathHelper multiplier=new MathHelper() {
		
		@Override
		public int operate(int param1, int param2) {
			return param1*param2;
		}
	};
	System.out.println(multiplier.operate(3, 2));
	System.out.println(multiplier.getClass().getSimpleName());
	LambdaTest t=new LambdaTest();
	System.out.println(t.getClass().getName());
}
 interface MathHelper{
	 public int operate(int param1,int param2);
	 default void operate() {
		 
	 }
 }
 interface CalculateHelper{
	 public int calculate(int ...arg1);
 }
}
