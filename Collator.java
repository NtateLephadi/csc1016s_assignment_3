// Tumelo Lephadi
// Program that records the number of readings, average, maximum and minimum
// 03 August 2015

public class Collator{
   
   private int numberOfReadings;
   private int reading;
   private int maximumReading;
   private int minimumReading;
   private int sumOfReading = 0;
      
   public Collator(){
      //Number of readings set to 0.
      numberOfReadings = 0;
      maximumReading = Integer.MIN_VALUE;
      minimumReading = Integer.MAX_VALUE;
   
   }
   
   public void recordReading(int reading){
      //Use the given reading to update the record.
      if (reading > maximumReading){
         maximumReading = reading;
      }
         
      if (reading < minimumReading){
         minimumReading = reading;
      }
      
      sumOfReading += reading;
      numberOfReadings ++;   
   }   
   
   public int maximum(){
      //Obtain the largest reading taken. Requires numberOfReadings>0.
      return maximumReading; 
   }
   
   public int minimum(){
      //Obtain the lowest reading taken. Requires numberOfReadings>0.
      return minimumReading;
   }
   
   public int average(){
      //Obtain the average of readings taken, rounded to the nearest integer. requires numberOfReadings>0.
      return (int)Math.round((double)sumOfReading / (double)numberOfReadings);
   }   

   public int numberOfReadings(){
      //Obtain the number of readings which have been taken. Requires numberOfReadings>0.
      return numberOfReadings;
   }   
}