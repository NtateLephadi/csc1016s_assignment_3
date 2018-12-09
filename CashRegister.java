// Tumelo Lephadi
// Program that models Acme cash register function
// 07 August 2015

public class CashRegister{
   
   private double runningTotal;
   private double amountTendered;
   private double changeDue;
   private double cost;
   private double payment;
   
   public void Initializer(){
      // Set variables to 0.
      amountTendered = 0;
      changeDue = 0;
      runningTotal = 0;
      cost = 0;
      payment = 0;
   }
   
   public void recordCost(double cost){
      // Record and add total cost.
      runningTotal += cost;
   }   
   
   public void recordPayment(double payment){
      // Record and assign payment to amount tendered.
      amountTendered = payment;
   }
   
   public double changeDue(){
      // Obtain the change owed to the customer.
      return amountTendered - runningTotal;
   }
   
   public double runningTotal(){
      // Obtain the running total.
      return runningTotal;
   }
   
   public double amountTendered(){
      // Obtain the amount paid by the customer.
      return amountTendered;
   }
   
}