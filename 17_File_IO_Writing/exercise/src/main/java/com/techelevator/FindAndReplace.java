package com.techelevator;

import java.io.*;
import java.util.Scanner;

public class FindAndReplace {

    public static void main(String[] args) throws FileNotFoundException {


        Scanner userInput = new Scanner(System.in);


        System.out.println("Please enter a word you want to search for:");
        String findWord = userInput.nextLine();

        System.out.println("What is the replacement word?");
        String replacementWord = userInput.nextLine();

        System.out.println("What is the source file?\n" + "[path-to-source-file]");
        String fileToCopy = userInput.nextLine();

        File sourceFile = new File(fileToCopy);
        if (!sourceFile.exists()) {
            System.out.println("File does not exist");
        } else {
            System.out.println("What is the files destination: ");
            String destinationPath = userInput.nextLine();
            File fileDestination = new File(destinationPath);

            try {
                Scanner file = new Scanner(sourceFile);
                PrintWriter writer = new PrintWriter(fileToCopy);

                while (file.hasNextLine()) {
                    String line = file.nextLine();

                    if (line.contains(findWord)) {
                        line = line.replace(findWord, replacementWord);
                    }
                    writer.println(line);
                }

            } catch (FileNotFoundException e) {
                e.printStackTrace();
            }

        }
    }
}

