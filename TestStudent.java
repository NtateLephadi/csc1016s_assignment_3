// Tumelo Lephadi
// Program that tests Student Class
// 03 August 2015

import java.util.Scanner;

public class TestStudent{
   public static void main(String [] args){
      Student test = new Student();
      Scanner input = new Scanner(System.in);
      
      System.out.println("Enter first name:");
      String first = input.nextLine();
            
      System.out.println("Enter middle name:");
      String middle = input.nextLine();
      
      System.out.println("Enter last name:");
      String last = input.nextLine();
      
      test.setNames(first, middle, last);
      
      System.out.println("The full name is: " + test.getFullName());
   }   
}  