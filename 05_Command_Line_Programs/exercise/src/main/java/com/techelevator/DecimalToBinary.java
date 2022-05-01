package com.techelevator;

import java.util.Scanner;
public class DecimalToBinary {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int i = 0;
		int arr[] = new int[10];

		 System.out.println("Please enter a Decimal you would like to convert: ");
		 int value = scan.nextInt();

		 while(value > 0){
			arr[i] = value % 2;
			i++;
			value = value/2;
		 }
		System.out.println("The Binary number will be: ");
		 for(i=i-1; i>0; i--){
			 System.out.print(arr[i]);
		 }
	}

}
