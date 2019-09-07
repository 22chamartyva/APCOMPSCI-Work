
/**
 * Write a description of class Hello here.
 *
 * @author (Varun C.)
 * @version (a version number or a date)
 */
public class Hello
//Assignment #1
{
    public static void main(String[] args)
    {
        String name = " Vbukboi ";
        
        System.out.println("Hello" + name + "I am Java");
        
        System.out.println("I might look scary at first but I am not really bad once you get to know me a bit.");
        
        //Assignment #2 Part 1
         //declaring a variable: declare a variable named sumOfAges meant to hold an integer (whole number)
         int sumOfAges;
         //assignment: assign a value to the memory location created for sumOfAges
         sumOfAges = 0;
         //using a variable: print the current value stored in sumOfAges
         System.out.println(sumOfAges);
         //declaring and assigning in one statement: declare a variable totalCost of the data type double and assign it 0.0
         double totalCost = 0.0;
         //practice independently
         //A
        int age1 = 6;
        int age2 = 27;
        int age3 = 82;
        int age4 = 19;
        //B
        sumOfAges = age1 + age2 + age3 + age4;
        
        System.out.println(sumOfAges);
        //C
        double costCandyBar = 2.41;
        
        double costSoda = 3.89;
        
        double costPopcorn = 12.99;
        
        double costTickets = 15.35;
        //D
        totalCost = costCandyBar + costSoda + costPopcorn + costTickets;
        //E
        System.out.println(totalCost);
        
        boolean isHungery = false;
        System.out.println(isHungery);
        //Assignment #2 Part 2
        if(isHungery)
        {
            System.out.println("Why u no eat breakfast boi");
        }
        else
        {
            System.out.println("Good job my mans...always eat breakfast");
        }
        //Assignment #3
        //A
        int personsAge = 15;
        if(personsAge >= 16)
        {
            System.out.println("You can drive");
        }
        else
        {
            System.out.println("No drive for u");
        }
        //B
        boolean isCool = false;
        if(isCool)
        {
            System.out.println("You're neat");
        }
        else
        {
            System.out.println("Dang...get cool boi");
        }
        //C
        int temperature = 87;
        int humidity = 61;
        if(temperature>85 && humidity>60)
        {
            System.out.println("You should go outside");
        }
       //D ??????
       int height = 8;
       int weight = 98;
       if(height > 7 && weight < 100)
       {
           System.out.println("bean tyme");
        }
       if(height >7 ||weight < 100)
       {
           System.out.println("lemon tyme");
        }
       //E
       boolean isHungry = false;
       boolean isSleepy = false;
       if(isHungry && isSleepy)
       {
           System.out.println("I'm Hungry and Sleepy");
        }
       if(!isHungry && !isSleepy)
       {
           System.out.println("I'm not Hungry and Sleepy");
        }
       if(isHungry || isSleepy)
       {
           System.out.println("I'm either hungry or sleepy");
        }
       if(!isHungry || !isSleepy)
       {
           System.out.println("I'm not hungry or maybe I'm not sleepy");
        }
       //Assignment #4
       //A
       int count = 0;
       while(count<20)
       {
           System.out.println("the count is : "+count);
           count = count + 1;
        }
       System.out.println("Finished");
       //B
       int Count = 20;
       while(Count>1)
       {
           System.out.println("the count is :"+Count);
           Count = Count - 1;
        }
       System.out.println("Finished");
       
       //C
        /*
       int theCount = 0;
       while(theCount < theCount + 1)//This will run forever
       {
           System.out.println("the count is :"+theCount);
           theCount = theCount +1;
        }
       */
       //D
       int Number = 20;
       while(Number > 30)
       {
           System.out.println("This will never run");
           Number = Number -1;
        }
        
       //E
       
       int num = 1;
       int x = 0;
       int y = 1;
       int z = 0;
       int sum = 0;
       while (sum <= num)
       if(z == 0)
       {
           System.out.println(z);
           z=x+y;
           y=z;
           sum = sum + 2;
        }
       else
        {
            System.out.println(z);
            z= x + y;
            x = y;
            y = z;
            sum = sum+1;
        }
        //Assignment #5
        //A
       for(int i=1; i<=20;i++)
       {
           System.out.println("Count:" +i);
        
        }
        //B
       for(int i=20; i>=1;i--)
       {
           System.out.println("Count:" +i);
        
        }
         //C
       for(int i=1; i<=19;i =i+3)
       {
           System.out.println("Count:" +i);
        
       }
       //D
       for(int i=28; i>=4; i=i-4)
       {
           System.out.println("Count:" +i);
        }
       //E
       int remainder;
       for(int i=1; i<=50;i++)
       {
        if(i%2==1)
        {
            
            System.out.println("Odd#"+i);
        
        }
        else
        {
        
            System.out.println("Even#"+i);
        
        }
       }
        
       //F
       for(int i=1; i<=14;i++)
       {
           
          
           if(i%7!=0)
           {
            System.out.print(i + "    ");
            
            }

           else
           {
            System.out.println(i + "    ");
            
            }
        }
       for(int i=15; i<=28;i++)
       {
           if(i%7!=0)
           {
            System.out.print(i + "    ");
               
            }
            else
            {
                System.out.println(i + "    ");
            }
        }
       
       
       
       
       
        
        
      
        
        
    }     
     
        
        
    
    
    
   }
     

