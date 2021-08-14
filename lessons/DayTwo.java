import java.util.Scanner;

public class DayTwo {
    public static void main(String[] args) {
        /** Data Types - There are multiple data types used to hold specific types of data. We wouldn't wanna
         * use a integer to hold the word "pineapple"
         */

         // char -> character
         //char firstInitial = 'T';
         //char lastInitial = 'D';

         // int -> integer
         //int birthyear = 2000;
         //int age = 44;
         //int number1 = 150;
         //int number2 = -144;
         //System.out.println(number1);

         // double -> numbers with decimals
         //double money = 20.434879123748917239847;
         //double grade = 99.99;
         //double height = 72.33;
         //System.out.println(money);

         // boolean -> True or False statements
         //boolean isOld = false;
         //boolean isYoung = true;
         //System.out.println(isOld);

         // String -> words or sentence(s)
         // int, char, double, and boolean are what we call primitive data types (hence the lower case)
         // However, String is not a primitive type. String is something what we call an object.
         //String name = "Tiancheng";
         //String animal = "Tiger";
         //String notNum = "13";
         //System.out.println(animal);

         // float
         // byte
         // short
         // long

         // In total, there are 8 primitive data types and String

        // Exercises
        //String name = "Tiancheng";
        //String age = "five";

        //int pen = 15;
        //int grade = 5;

        //char letter = 'A';
        //char favoriteletter = 'C';

        //double weight = 100.11;
        //double time = 12.57;
        
        // age - int, double, String
        // country - String, Char
        // tires - String, int
        // height - int, double, String
        // percent - int, double, String

        // Variables store data(information) to use and work on them later.
        // int laps = 3;
        // System.out.println("We will be swimming " + laps + " laps");
        // String name = "Marley";
        // double grade = 44.33;

        // PEMDAS (Parenthesis, Exponents, Multiplication, Division, Addition, Subtraction)
        // System.out.println(3 + 7);
        // int num1 = 10;
        // int num2 = 25;
        // int num3 = num1 * num2;
        // int num4 = num2 / num1;
        // System.out.println(num1 + " x " + num2 + " = " + num3);
        // System.out.println(num2 + " / " + num1 + " = " + num4);

        // System.out.println(num1*num2);
        // System.out.println(num2/num1);

        // mulitplication -> *
        // division -> /
        // addition -> +
        // subtraction -> -
        // increment -> ++ or --
        // int a = 4;
        // a++;
        // System.out.println(a);
        // a--;
        // System.out.println(a);


        // //String Operations
        // // Concatenating strings
        // String firstName = "Bond";
        // String lastName = "James";
        // String sentence = firstName + " "+ lastName + " " + firstName;
        // System.out.println(sentence);

        // String methods -> function
        //.length() --> returns how longs the string is as an int
        //System.out.println(firstName.length());
        //.equals("parameter") --> checks to see if two strings are equal to each other
        // System.out.println(firstName.equals("Bond"));
        //.split("parameter") ->  Splits the string into multiple parts based on the parameter and stores
        // them in an array
        //.indexOf() -> returns the index of a substring or char.

        //Exercises
        /** Create the following variables and store the information. Then print out a message using your
         * variables in the form of: 'Hello, Bobert McSmee. You are 62 years old and you want a 98.2 in this class.'
         * 
            Your first name
            Your last name
            Your birth year
            What grade (out of 100) do you want
   
         */
        // String firstname = "Tiancheng";
        //  String lastname = "Dong";
        //  int birthyear = 2005;
        //  double grade = 98.5;
         //System.out.println("Hello, " + firstname + " " + lastname + ". You are " + (2021-birthyear) + " years old and you want a " + grade + " in this class.");
        
        //  int x = 10;
        //  double y = 2.0;

        //  System.out.println(x/y);

        //  System.out.println(y/x);

        //  double g = 1 / 3;
        //  System.out.println(g);

        //  double b = 1/3.0;
        //  System.out.println(b);

        /** User Input
         * Java allows us to grab data from the user. The following steps are required to do so:
         *  1. importing Scanner (import java.util.Scanner)
         *  2. Create a Scanner Object.
         *  3. Create a string variable = scanner.nextLine();
         */
        // Scanner scan = new Scanner(System.in); // Creates a new Scanner Object
        // System.out.println("Enter your username: ");

        // String userName = scan.nextLine();
        // System.out.println(userName);

        // System.out.println("What is 2 + 2: ");
        // String number = scan.nextLine();

        // int num = Integer.parseInt(number); // This Line is Important!!! CONVERTS STRING TO INT
        // double dubNum = Double.parseDouble(number); // This Line is Important!!! CONVERTS STRING TO DOUBLE

        // System.out.println("Number as a integer: " +  (num));
        // System.out.println("Number as a double: " + dubNum);

        //What just happened above (converting one data type into another) is something in Java that we call
        // casting. This is the most common situation, but there are many others situations where you'll
        // cast other data types in other data types and vice versa.

        /** Ask the user to input in data of the following data types, then tell a short story with 
         * them
         * 
         * - String x2
         * - double x2
         * - int x2
         * - boolean x2 -> to convert from String to Boolean --> Boolean.parseBoolean(string);
         * 
         */
         Scanner scan = new Scanner(System.in);
         
         System.out.println("Please give me a name: ");
         String name = scan.nextLine();
         System.out.println("Please give me a location: ");
         String location = scan.nextLine();
         System.out.println("Please give me a integer: ");  
         String num1 = scan.nextLine();
         int num11 = Integer.parseInt(num1);
         System.out.println("Please give me another integer: "); 
         String num2 = scan.nextLine();
         int num21 = Integer.parseInt(num2);
         System.out.println("Please give me a double: "); 
         String double1 = scan.nextLine();
         double double11 = Double.parseDouble(double1);
         System.out.println("Please give me another double: "); 
         String double2 = scan.nextLine();
         double double21 = Double.parseDouble(double2);
         System.out.println("Please put true or false: ");
         String boolean1 = scan.nextLine();
         boolean boolean11 = Boolean.parseBoolean(boolean1);
         System.out.println("Please put true or false: ");
         String boolean2 = scan.nextLine();
         boolean boolean21 = Boolean.parseBoolean(boolean2);




        
        }
}
