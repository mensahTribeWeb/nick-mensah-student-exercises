package com.techelevator;
import java.util.Scanner;
/*
Write a command-line program which prompts a user to enter a length, and whether the measurement is in (m)eters or
(f)eet. Convert the length to the opposite measurement, and display the old and new measurements to the console.

		```
		Please enter the length: 58
		Is the measurement in (m)eter, or (f)eet? f
		58f is 17m.
*/

public class LinearConvert {
static Scanner scan = new Scanner(System.in);
	public static void main(String[] args) {
		System.out.println("Please Enter a unit to convert: ");
		int value = scan.nextInt();
		scan.nextLine();

		System.out.println("Is the measurement in (m)eter, or (f)eet? f");
		char unit = scan.next().toLowerCase().charAt(0);


			if(unit == 'f' && value != 0){
				System.out.println(value +"m is " + (value * 3.2808399) +" f");
				return;

			}
			else if (unit == 'm'  && value != 0){
				System.out.println(value + "f is " + (value * 0.3048) + " m");
				return;
			}
			else{
				System.out.println("Please enter a valid number");
			}


	}


}
