import java.util.Scanner;

public class ReviewVariablesAndIfs extends truthTable
{
public static void main()
{
    Scanner thisScanner= new Scanner(System.in);
    System.out.print("What is your favorite number?");      //this is just a message for the user
    int favorite = thisScanner.nextInt();       //this reads in an integer from the keyboard and stores it in a variable
    thisScanner.nextLine();             //this reads in the return that gets sent from the keyboard when the user hits enter(return)
    if(favorite ==4){
        System.out.println("Good Choice");

    }
    else{
        System.out.println("I don't like " + favorite);
    }


    System.out.print("How old are you?");

    int age = thisScanner.nextInt();


    if(age <=15){
        System.out.println("You are not able to drive yet");
    }
    else{
        System.out.println("You can try and drive perhaps");
    }
    
    
    
    
    
    



}
}
