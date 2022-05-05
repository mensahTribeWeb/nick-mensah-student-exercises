package com.techelevator;

import java.util.Scanner;
public class TempConvert {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		System.out.println("Please enter a temperature: ");
		int value = scan.nextInt();
		scan.nextLine();

		System.out.println("Will the temperature be in (C)elsius oe (F)ehremheit ? ");
		char temp = scan.next().toLowerCase().charAt(0);

		int tempOutput = 0;

		if(temp == 'c'){
			tempOutput = (int) (value * 1.8 + 32);
			 System.out.println(value + "C =" + tempOutput + "F." );
		}
		else if(temp == 'f'){
			tempOutput = (int) ((value - 32) / 1.8);
			System.out.println(value + "F =" + tempOutput + "C." );
		}
		else{
			System.out.println("Please enter a valid number");
		}
	}

}
