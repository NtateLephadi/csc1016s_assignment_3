// Tumelo Lephadi
// Program that sort of generates random numbers
// 03 Ausgust 2015

public class RandomGenerator{
   
   private int c = 0;
   private int g = 48271;
   private int n = 2147483647;
   private long x;
      // This field holds the most recently calculated value i.e. Xk  
      
   public RandomGenerator(long seed){
      // Create a RandomGenerator object that uses the given seed as the value for Xo
      x = seed;
   }    
   
   public int nextInt(){
      // Return a pseudorandom integer value.
      double x1 = (g * x + c) % n;
      x = (long)x1;
      return (int)x1;
   }
   
   public int nextInt(int i){
      // Return a pseudorandom integer value between 0(inclusive) and the specified value(exclusive)
      return (int)(nextDouble() * i);
   } 
   
   public double nextDouble(){
      // Return a pseudorandom real number value between 0.0(inclusive) and 1.0(exclusive)
      double x1 = (g * x + c) % n;
      x = (long) x1;
      x1 = x1/n;
      return x1;
   }
   
}