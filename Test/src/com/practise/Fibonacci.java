package com.practise;

public class Fibonacci {
	public static void main(String[] args){
		System.out.println(0);
		fibo(3);
	}
	
	private static void fibo(int n){
		int a= 0;
		int b= 1;
		
		for(int i=0; i<n;i++){
			int c = a + b;
			a = b;
			b = c;
			System.out.println(a);
		}
	}
}
