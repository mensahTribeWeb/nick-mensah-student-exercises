package com.techelevator;

import java.util.Scanner;
// f(n) = f(n-1) + f(n-2))

public class Fibonacci {

static Scanner scan = new Scanner(System.in);
private static long fibSeries[];

	public static void main(String[] args) {
		System.out.println("Please enter the fibonacci number position: ");

		int n = scan.nextInt();

		fibSeries = new long[n + 1];

		//fib number
		System.out.println("your requested Fibonacci number: \n" + fib(n));

		//print series
		System.out.println("series of the Fibonacci numbers: ");

		for(int i =0; i<=n; i++){
			System.out.print(fib(i) + " ");
		}


	}

	private static long fib(int n) {
		if (n <= 1)
			return n;//base case

		if (fibSeries[n] != 0) {
			return fibSeries[n];
		}
		long nthFib = (fib(n - 1) + (fib(n - 2)));
		fibSeries[n] = nthFib;


		return nthFib;
	}

}
