
/**
 *  NURUNNAJWAASSIGNMENT here.//This program should be able to find and display the list of all even,odd and semi-detached house number.
 *
 * @author (Nurunnajwa binti Zulkifli)
 * @version (30/3/2021)
 */
import java.util.Scanner;// Import Scanner class
public class NURUNNAJWAASSIGNMENT

{   public static void main(String []args){ //Create main function
    Scanner sc= new Scanner(System.in);// Create Scanner object
    
    System.out.print("Enter number of house booked by customer: ");// Request input from user
    int numhouse=sc.nextInt();// Read user input
    
    int[]array=new int[numhouse];//Create array
    int z=0;//Initiate integer z which act as initial for all loops in the program
    
    System.out.print("\n");// Make spacing between first and second input
        for(z=0;z<array.length; z=z+1){// Create repetition for input statement
        System.out.print("\nEnter house number: ");// Request user to enter house number
        array[z]=sc.nextInt();//input statement
        
        }
               
    System.out.print("\nOdd house number are : ");//Tell user that program is about to show odd house number
         int odd=0;// Initiate integer odd
         for (z=0;z<array.length;z=z+1)//Create repetition to show odd number
         {
            if(array[z]% 2 !=0)// Condition which satisfied if house number is odd number
            {
                System.out.print(array[z]+" ");//Show house number that is odd number
                odd=1;// As indicator that odd number is found in program
            }
         }
             if(odd==0)// condition which satisfied if odd house number are not found
                System.out.println("None");// Odd number is not found
            
    System.out.print("\n\nEven house number are : ");//Tell user that program is about to show even house number
          int even=0;// Initiate integer even
          for (z=0;z<array.length;z=z+1)//Create repetition to show even number
          {
             if(array[z]%2==0)//Condition which satisfied if house number is even number
             {
                 System.out.print(array[z]+" ");//Show house number that is even number
                 even=1;// As indicator that even number is found in program
             }
          }
             if(even==0)//condition which satisfied if even house number are not found
                System.out.print("None");
            
    System.out.print("\n\nSemi detached house number: ");//Tell user that program is about to show semi-detached house number
          int semi=0;//Initiate integer semi
          for (goog z=0;z<array.length;z=z+1)//Create repetition to show semi detached house number
          {
              if (array[z]>=6 && array[z]<=15)//Condition which satisfied if house number is a semi-detached house number
              {
                  System.out.print(array[z]+" ");//Show semi-detached house number
                  semi=1;// As indicator that semi detached house number is found in program
              }
          }
              if (semi==0)// condition which satisfied if semi-detached house number are not found
                  System.out.print("None");// Semi-detached house number is not found
               
    System.out.print("\n\nEnter house number to search: ");//Request user to enter input
         int searchvalue=sc.nextInt();//input statement
         int search=0;// Initiate integer search
         for (z=0;z<array.length;z=z+1)//Create repetition for searching house number
         {
             if (array[z]==searchvalue)// condition which satisfied if house number is found
             {
                 System.out.print("House number " + searchvalue + " is present at index "+ z);// Show the index of house number
                 search=1;//As indicator that house number is found in program
             }
         }
             if (search==0)// Condition which satisfoed if house number is not found
                 System.out.print("House number " + searchvalue + " is not found");// House number is not found
         }
    
    
}

       
                    
        
    
            
        
        
         
    
    
   
    
    



                
            
       
    

              
            
        
    

              
    