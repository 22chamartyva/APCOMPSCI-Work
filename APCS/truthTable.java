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
     System.exit(0);
    }
    else{
     System.out.println("Do you have any pets that aren’t Dogs, Cats, or Birds?(True/False)");
    }
    boolean miscPets = thisScanner.nextBoolean();
    //Do you have a misclenious pet or a cat and bird?
    if(miscPets){
    System.out.println("You Don't Qualify");
    System.exit(0);
    }
    else{
    System.out.println("How many pets do you have?");
    }
    int actuPets = 0;
     int numPets = thisScanner.nextInt();
   if(numPets >= actuPets){ 
    
        
    //int numPets = thisScanner.nextInt();
    if(numPets <=3){
    System.out.println("Do you have a dog?");
    }
    else{
    System.out.println("You can't stay here");
    System.exit(0);
    }
    boolean hasDog = thisScanner.nextBoolean();
    int largePet = 0;
    
    if(hasDog){
        actuPets = actuPets+1;
        System.out.println("What is the weight of your heaviest dog");
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
    System.out.println("Do you have a cat");
    }
    //use int largePet when doing large cat
    if(numPets == 2 && !hasDog){
    System.out.println("You can't live here");
    System.exit(0);
    }
    else{
    System.out.println("");
    }
    boolean hasCat = thisScanner.nextBoolean();
    int badCat = 0;
    if(hasCat){
        actuPets = actuPets+1;
     System.out.println("How heavy is your heaviest cat?");
     badCat = badCat + 1;
     int lbCat = thisScanner.nextInt();
     if(lbCat >= 15 && largePet == 1){
          System.out.println("You can't life here");
          System.exit(0);
        }
     else{
        System.out.println("Do you have a bird?");
        }
    }
    else{
    System.out.println("Do you have a bird?");
    }
    boolean hasBird = thisScanner.nextBoolean();
    if(hasBird && badCat == 1){
     System.out.println("You can't life here");
     System.exit(0);
    }
    else{
     if(hasBird){
         actuPets = actuPets+1;
        System.out.println("Is your bird noisy");
      
        }
     else{
        System.out.println("You can live here... YAY!!");
        System.exit(0);
        }
    }
     boolean hasNoisyboi = thisScanner.nextBoolean();
    if(hasNoisyboi){
       System.out.println("You are not eligible because of bird");
       System.exit(0);
    }
    else{
      System.out.println("Congradulations... You can live here");
      System.exit(0);
    }
    
    
    
    
    
  } 
  else{
    System.out.println("You lied..  y would you do that... I thought we were friends");
    System.exit(0);
    }  
 }
}