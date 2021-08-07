public class DayOne{
    public static void main(String[] args){
        //This command will print out whatever is between these parentheses to the console below.
        //Case sensitive - Java is very case sensitive so make sure that your case matches!
        //Spelling sensitive - Spelling matters
        //Semicolon - Semicolon tells Java that the end statement is there
        System.out.println("Hello World");
        System.out.println("Hello!");
        System.out.println("Hiho");

        //Variable -> We can save data in variables in order to work on them later. Variables hold
        // in a container
        //int -> integer (a whole number ex.1,2,3,4,5).
        //String -> words in double quotation marks (ex."Hello World")
        //age -> name of the variable.
        //= -> setting the value for the variable.
        //20 -> value that we want the variable to hold.
        //int age = 20;
        //int apple = 30;
        //System.out.println(age);

        //Adding String in addition to variables is called *concatenation
        //System.out.println("You will be " + age + " in a couple of years.");
        //System.out.println("There are " + apple + " apples on the table.");

        //Comments - (// is a single line comment) comments are lines that do not show up 
        //when you run the console. Comments basically tell us information on the code. 
        // Multiple comments (/** */)

        /**Exercises
        1. Print out your name, your age, and what school you go to. */
        System.out.println("I'm Tiancheng, I'm going to be a Sophomore at Northwood High School.");
        //2. Same thing, but now print them in three different lines.
        System.out.println("I'm Tiancheng");
        System.out.println("I'm going to be in 10th grade");
        System.out.println("I go to Northwood HS");
        //3. Using a variable, print out how old you will be in 2070.
        int age = 15;
        //(age + 49) -> addition operation.
        System.out.println("I will be " + (age + 49) + " in 2070.");
    } 
}
