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
		String unit = scan.nextLine().toLowerCase();

		if(unit == "f"){
			System.out.println(value +"f is" + feetToMeters(value)+"m");
			return feetToMeters(value);
		}
		else if (unit == "m"){
			System.out.println(value +"m is" + feetToMeters(value)+"f");
			return metersToFeet(value);
		}

		return value;
	}

	private static int feetToMeters(int value){
	//	m = f * 0.3048
		return  value * (int)0.3048;
	}

	private static int metersToFeet(int value){
	// f = m * 3.2808399
		return value * (int)3.2808399;
	}

}
