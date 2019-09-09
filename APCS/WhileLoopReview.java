import java.util.Scanner;

public class WhileLoopReview
{
 public static void main()
 {
     
     Scanner thisScanner= new Scanner(System.in);
     /*To solve this problem, use an int variable and a boolean variable and if/else together with the Scanner and a while loop.
      * Create a menu system with at least 3 options and an option to quit.

      * i.e.
      * Menu:
      * Type 1 to see a greeting from me
      * Type 2 to see my favorite color
      * Type 3 to see the first line of my favorite song
      * Type -1 to quit
      * Enter your choice:


      * After the user makes a choice and a response is printed, the menu displays again.  This continues until the user quits.
        */
       System.out.println("Menu:");
         System.out.println("Type 1 to see a greeting from me");
          System.out.println("Type 2 to see my favorite color");
           System.out.println("Type 3 to see the first line of my favorite song");
            System.out.println("Type -1 to quit");
             System.out.println("Enter your choice:");
             int numb = thisScanner.nextInt();
     while(numb > 0){
        if (numb ==1){
        System.out.println("Greetings");
        
        }
        if(numb ==2){
        System.out.println("RED");
        }
        if(numb == 3){
        System.out.println("FAVORITE SONG LINE");
        
        }
        System.out.println("Menu:");
         System.out.println("Type 1 to see a greeting from me");
          System.out.println("Type 2 to see my favorite color");
           System.out.println("Type 3 to see the first line of my favorite song");
            System.out.println("Type -1 to quit");
             System.out.println("Enter your choice:");
        
    }
     System.exit(0);
        
    
        
        
        
        
        
     
     
     
     
     
     
     
     
     
     
     
     
     
    }
}