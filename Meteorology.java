// Tumelo Lephadi
// Program that uses Collator object for pressure, humidity and temperature
// 06 August 2015

import java.util.Scanner;
public class Meteorology{

   public static void main(String [] args){
    
      Scanner input = new Scanner(System.in);
      Collator Temperature = new Collator();
      Collator Pressure = new Collator();
      Collator Humidity = new Collator();
      int selection = 0;
      System.out.println("Meteorology Program");
   
      do
      {         
         System.out.println("Make a selection and press return:");
         System.out.println("1. Record a temperature reading.");
         System.out.println("2. Record a pressure reading.");
         System.out.println("3. Record a humidity reading.");
         System.out.println("4. Print maximum values.");
         System.out.println("5. Print minimum values.");
         System.out.println("6. Print average values.");
         System.out.println("7. Quit");
                  
         selection = input.nextInt();
      
         switch(selection){
         
            case 1:
               System.out.println("Enter value:");
               int reading = input.nextInt();
               Temperature.recordReading(reading);
               break;
            
            case 2:
               System.out.println("Enter value:");
               reading = input.nextInt();
               Pressure.recordReading(reading);
               break;
               
            case 3:
               System.out.println("Enter value:");
               reading = input.nextInt();
               Humidity.recordReading(reading);
               break;
               
            case 4:
               if (Temperature.numberOfReadings() != 0){
                  System.out.println("Maximum temperature: " + Temperature.maximum());
               }
               else System.out.println("Maximum temperature: -");
               
               if (Pressure.numberOfReadings() != 0){
                  System.out.println("Maximum pressure: " + Pressure.maximum());
               }
               else System.out.println("Maximum pressure: -");
               
               if (Humidity.numberOfReadings() != 0){   
                  System.out.println("Maximum humidity: " + Humidity.maximum());
               }
               else System.out.println("Maximum humidity: -");
                           
               break;
               
            case 5:
               if (Temperature.numberOfReadings() != 0){
                  System.out.println("Minimum temperature: " + Temperature.minimum());
               }
               else System.out.println("Minimum temperature: -");
               
               if (Pressure.numberOfReadings() != 0){
                  System.out.println("Minimum pressure: " + Pressure.minimum());
               }
               else System.out.println("Minimum pressure: -");
               
               if (Humidity.numberOfReadings() != 0){   
                  System.out.println("Minimum humidity: " + Humidity.minimum());
               }
               else System.out.println("Minimum humidity: -");
                           
               break;
               
            case 6:               
               if (Temperature.numberOfReadings() != 0){
                  System.out.println("Average temperature: " + Temperature.average());
               }
               else System.out.println("Average temperature: -");
               
               if (Pressure.numberOfReadings() != 0){
                  System.out.println("Average pressure: " + Pressure.average());
               }
               else System.out.println("Average pressure: -");
               
               if (Humidity.numberOfReadings() != 0){   
                  System.out.println("Average humidity: " + Humidity.average());
               }
               else System.out.println("Average humidity: -");
                           
               break;
         
         
         }
      }while (selection != 7);   
      
   }
}