public class DayFour 
{
    public static void main(String[] args) {
        /** 
        1. Write a for loop that prints out all the even numbers from 2-22.
        2. Write a while loop that prints out all the even numbers from 2-22.
        3. Write a for loop that prints out all the odd numbers from 1-23.
        */
        // 1. Write a for loop that prints out all the even numbers from 2-22.
        // for(int i = 2; i < 23; i+= 2) {
        //     System.out.println(i);
        // }

        // // 2. Write a while loop that prints out all the even numbers from 2-22.
        // int j = 2;
        // while (j < 23)  {
        //     System.out.println(j);
        //     j+=2;
        // }

        //3.Write a for loop that prints out all the odd numbers from 1-23.
        // for(int i=1; i<24; i+=2){
        //     System.out.println(i);
        // }

        /** FizzBuzz Problem
         * Write a program that prints all numbers from 1 to 100 on a new line.
         * If the number is a multiple of 3, we print "Fizz" instead of the number.
         * If the number is a mulitple of 5, we print "BUzz" instead of the number.
         * If the number is both a multiple of 3 and 5, we print "Fizzbuzz".
         * If none of these are true, we just print the number.
        */

        // for(int i = 1; i < 101; i++){
        //     if(i%3==0 && i%5!=0){
        //         System.out.println("Fizz");
        //     }
        //     else if (i%5==0 && i%3!=0) {
        //         System.out.println("Buzz");
        //     }else if (i%5==0 && i%3==0){
        //         System.out.println("FizzBuzz");
        //     }
        //     else {
        //         System.out.println(i);
        //     }
        // }

        // double richter = 6.5;
        // if( richter >= 8.0){
        //     System.out.println("Most structures fall");
        // }else if(richter >= 7.0){
        //     System.out.println("Many buidlings destroyed");
        // }else if(richter >= 6.0){
        //     System.out.println("Many buildings considerably damaged, some collapes");
        // }else if(richter >= 4.5){
        //     System.out.println("Damage to poorely constructed buildings4");
        // }else{
        //     System.out.println("No destruction of buildings");
        // }

        // boolean single = true;
        // double income = 250000.0;
        // double tax = 0;
        // //how much would we be taxed?
        // if(single){
        //     if(income > 100000){
        //         tax = income * .20;
        //     }else{
        //         tax = income * .10;
        //     }
        // }else{
        //     if(income > 100000){
        //         tax = (income * .20) - 3500;
        //     }else{
        //         tax = (income * 10) - 5000;
        //     }
        // }

        // boolean b = true;
        // if(b){
        //     System.out.println("Wahahaha");
        // }else{
        //     System.out.println("not again!");
        // }
        // // !true = false
        // // !false = true

        // /**boolean b = false;

        //     if(b){    
        //     }

        //     if(!b){    
        //     }

        //     if(b != true){    
        //     }

        //     if(b != false){    
        //     }
        //     */

        // // Tiancheng -> Write a program that reads an integer and prints  whether its negative, zero, or positive
        // int a = 1;
        // if(a>0){
        //     System.out.println("it's positive");
        // }else if(a==0){
        //     System.out.println("it's 0");
        // }else {
        //     System.out.println("it's negative");
        // }


        // //Nicky -> Write a program that reads three numbers and prints "all the same" if they are all the same,
        // // or prints "all different" if they are all different, and "neither" otherwise.
        // int num = 4;
        // int num2 = 8;
        // int num3 = 7; //&& ==
        // if(num == num2)
        // {
        //     if (num == num3)
        //     {
        //         System.out.println("all the same");
        //     }
        // }
        // else {
        //     System.out.println("all different");
        // }
        // System.out.println();
        // System.out.println();
        // //Write a program that reads a floating point number and prints "zero"
        // // if the number is zero. Otherwise, print "positive" or "negative". Add
        // // "small" if the absolute value of the number is less than 1, or "large"
        // // if its exceeds 1,000,000, or "neither" if neither conidtion is true.

        // // > -> greater than
        // // < -> less than
        // double flNum = -543.857;
        // if (flNum == 0)
        // {
        //     System.out.println("zero");
        // }
        // else if (flNum > 0)
        // {
        //     System.out.println("positive");
        // }
        // else 
        // {
        //     System.out.println("negative");
        // }
        // //Math.abs(number)
        // if(Math.abs(flNum)<1){
        //     System.out.println("small numb");
        // }else if (Math.abs(flNum)>1000000){
        //     System.out.println("large numb");
        // }else{
        //     System.out.println("neither");
        // }


        /** ------------------------------------------------------------------------------------------- */
        /** Write code for a program that prompts the user for a month and day and prints out whether
         * it is one of the following holidays:
         * - New Years (Jan 1)
         * - Independence Day (July 4)
         * - Veterans (Nov 11)
         * - Halloween (Oct 30)
         * - Any holiday is fine, try to add atleast 4
        */

        /** Write a program that reads three numbers and print "increasing" if they are in increasing order
         * 'decreasing' if they are in decreasing order, and "neither" other-wise. Here "increasing" mean
         * "strictly" increasing. 3 5 11 -> increasing 3 4 4 -> not increasing
        */

        /** Find the errors in the code below:
         * if x > 0 then system.out.println(x);



                if (1 + x > Math.pow(x, Math.sqrt(2)) {
                    y = y + x; 
                    }
                    
                    
                    
                if (x = 1) { 
                    y++; 
                }
    


                x = in.nextInt();
                if (in.hasNextInt()){
                    sum = sum + x;
                }
                else
                {
                    System.out.println("Bad input for x");
                }



                String letterGrade = "F";
                int grade = 95;
                if (grade >= 90) { 
                    letterGrade = "A"; 
                }
                if (grade >= 80) { 
                    letterGrade = "B"; 
                }
                if (grade >= 70) {
                    letterGrade = "C"; 
                }
                if (grade >= 60) {
                    letterGrade = "D"; 
                }

        */
        
    }
}
