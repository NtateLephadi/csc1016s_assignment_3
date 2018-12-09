// Tumelo Lephadi
// Program that uses CashRegister object to create a user interface
// 07 August 2015

import java.util.Scanner;
public class RegisterUI{

   public static void main(String[] args){
      
      Scanner input = new Scanner(System.in);
      CashRegister cashRegister = new CashRegister();
      int selection = 0;
      System.out.println("Cash Register");
      System.out.printf("Running total: R" + "%.2f" , cashRegister.runningTotal());
      System.out.println();
      
      do
      {
         System.out.println("1. Ring up item.");
         System.out.println("2. Enter amount tendered.");
         System.out.println("3. New transaction.");
         System.out.println("4. Quit");
         
         selection = input.nextInt();
         
         switch(selection){
         
            case 1:
               System.out.println("Enter amount:");
               double cost = input.nextDouble();
               cashRegister.recordCost(cost);
               System.out.printf("Running total: R" + "%.2f", cashRegister.runningTotal());
               System.out.println();
               break;
               
            case 2:
               System.out.println("Enter amount:");
               double payment = input.nextDouble();
               cashRegister.recordPayment(payment);
               System.out.printf("Running total: R" + "%.2f", cashRegister.runningTotal());
               System.out.println();
               System.out.printf("Amount tendered: R" + "%.2f", cashRegister.amountTendered());
               System.out.println();
               System.out.printf("Change due: R" + "%.2f", cashRegister.changeDue());
               System.out.println();
               break;   
               
            case 3:
               cashRegister.Initializer();
               System.out.printf("Running total: R" + "%.2f", cashRegister.runningTotal());
               System.out.println();
               break;              
         }
      }while(selection != 4);
   }
}