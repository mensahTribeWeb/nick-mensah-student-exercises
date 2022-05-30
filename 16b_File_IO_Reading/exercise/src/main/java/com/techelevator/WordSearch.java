package com.techelevator;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class WordSearch {
	public static void main(String[] args) throws FileNotFoundException,Exception {
        Scanner scan = new Scanner(System.in);
        System.out.println("What is the fully qualified name of the file that should be searched?\n"+
                "[path-to-the-file]: ");
        File searchedFile = new File(scan.nextLine());

        System.out.println("What is the search word you are looking for?");
        String wordSearched = ""+ scan.nextLine()+"";


        System.out.println("Should the search be case sensitive? (Y\\N)");
        String answer = scan.nextLine();
        boolean isCaseSensitive = answer.equalsIgnoreCase("y");
try {
    Scanner userInput = new Scanner(searchedFile);
    int lineNumber = 1;

    if(isCaseSensitive) {
        while (userInput.hasNextLine()){
            String lineVerification = userInput.nextLine();
            lineNumber++;
            if(lineVerification.contains(wordSearched)){
                System.out.println(lineNumber+")"+" "+lineVerification);
            }
        }
    }
    else if(answer.equalsIgnoreCase("n")){
         lineNumber = 0;
        while (userInput.hasNextLine()){
            String lineVerification = userInput.nextLine();
            lineNumber++;
            if(lineVerification.toLowerCase().contains(wordSearched.toLowerCase())){
              System.out.println(lineNumber +")"+" "+lineVerification);
          }
        }
    }

} catch (Exception e) {
    e.printStackTrace();
}
    }
}
//test