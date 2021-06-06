package exercises.ex18;
import java.util.Scanner;

/*
 *  UCF COP3330 Summer 2021 Assignment 1 Solution
 *  Copyright 2021 Erik Dokken
 */


public class ex18 {
    static Scanner in = new Scanner(System.in);

    public static void main(String[] args) {
        ex18 example18 = new ex18();

        String tempChoice = example18.tempChoice();
        String tempNum = example18.tempNumber(tempChoice);

        //Convert
        int temp = example18.tempInt(tempNum);

        int tempCF = example18.tempCF(temp, tempChoice);
        //Output
        String outputString = example18.outputString(tempCF, tempChoice);

        example18.printOutput(outputString);
    }

    private void printOutput(String outputString) { System.out.println(outputString);
    }

    private String outputString(int tempCF, String tempChoice) {
        if(tempChoice.equals("f") ||tempChoice.equals("fahrenheit"))
        {
            return "The temperature in Celsius is " + tempCF + ".";
        }
        else if ((tempChoice.equals("c") ||tempChoice.equals("celsius")))
        {
            return "The temperature in Fahrenheit is " + tempCF + ".";
        }
        return "ERROR";
    }

    private int tempCF(int tempNum, String tempChoice) {
        if(tempChoice.equals("f") ||tempChoice.equals("fahrenheit"))
        { int tempConversion = (tempNum*9/5) +32;
            return tempConversion;

        }
        else if ((tempChoice.equals("c") ||tempChoice.equals("celsius")))
        {
            int tempConversion = (tempNum-32)*5 /9;
            return tempConversion;

        }
        return 0;
    }

    private int tempInt(String tempNum) {
        int tempInt = Integer.parseInt(tempNum);
        return tempInt;
    }

    private String tempNumber(String tempChoice) {
        if(tempChoice.equals("f") ||tempChoice.equals("fahrenheit"))
        {

            System.out.print("Please enter the temperature in Celsius: ");
            String tempNum = in.nextLine();
            return tempNum;

        }
        else if ((tempChoice.equals("c") ||tempChoice.equals("celsius")))
        {
            System.out.print("Please enter the temperature in Fahrenheit: ");
            String tempNum = in.nextLine();
            return tempNum;
        }
        return "ERROR";


    }

    private String tempChoice() {
        int counter = 0;
        System.out.println("Press C to convert from Fahrenheit to Celsius.\n" +
                "Press F to convert from Celsius to Fahrenheit.");

        do{
            System.out.print("Your choice: ");
            String temp = in.nextLine();
            String tempLow = temp.toLowerCase();
            if((tempLow).equals("c") || (tempLow).equals("f") ||(tempLow).equals("celsius") ||(tempLow).equals("fahrenheit"))
            {
                return tempLow;
            }
            else{
                System.out.println("Please provide a valid input");
                counter = 1;
            }
        }while(counter !=0);

        return "error";
    }
}
