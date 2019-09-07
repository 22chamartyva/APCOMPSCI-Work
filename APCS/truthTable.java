import java.util.Scanner;

public class truthTable
{
 public static void main()
 {
   
    Scanner thisScanner= new Scanner(System.in);
    
    
    System.out.println("Do you have any pets? (True/False)");      
     boolean hasPets = thisScanner.nextBoolean();
    if(!hasPets){
     System.out.println("You Qualify For The Apt.");
    }
    else{
     System.out.println("Do you have any pets that aren’t Dogs, Cats, or Birds?(True/False)");
    }
    boolean miscPets = thisScanner.nextBoolean();
    //Do you have a misclenious pet or a cat and bird?
    if(miscPets){
    System.out.println("You Don't Qualify");
    
    }
    else{
    System.out.println("How many pets do you have?");
    }
    int numPets = thisScanner.nextInt();
    if(numPets <=3){
    System.out.println("Do you have a dog?");
    }
    else{
    System.out.println("You can't stay here");
    }
    boolean hasDog = thisScanner.nextBoolean();
    int largePet = 0;
    
    if(hasDog){
        System.out.println("What is the weight of your dog");
        int lbDog = thisScanner.nextInt();
        if(lbDog >= 70){
         
         System.out.println("Do you have a cat?");
         largePet = largePet+1;
        }
        else{
        System.out.println("Do you have a cat?");
        }
    }
    else{
    System.out.println("Do you have a cat?");
    }
    //use int largePet when doing large cat
    
    
    
    
    
    
    
    
    
    
    
 }
}