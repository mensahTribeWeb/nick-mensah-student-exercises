package com.techelevator;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class FizzWriter {

	public static void main(String[] args) throws FileNotFoundException {
		Scanner fileScan = new Scanner(System.in);

		//prompt user for a destination file
//		System.out.println("What is the destination file? ");
//		String destinationFileSource = fileScan.nextLine();

		File destinationFile = new File("src/test/resources/fizzbuzz.txt");
		if (!destinationFile.exists()){
			try {
				destinationFile.createNewFile();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		try(PrintWriter writer = new PrintWriter(destinationFile))	{
			for (int i =1; i<301;i++) {
				if (i % 5 == 0 && i % 3 == 0){
					writer.println("FizzBuzz");
			}
			else if (i % 3 == 0 ){
				writer.println("Fizz");
				}
			else if (i % 5 == 0){
				writer.println("Buzz");
				}
			else {writer.println(i);}
		}
		}
		catch (FileNotFoundException e){
			System.err.println("File cannot be opened.");
			System.exit(1);
		}

	}

}
