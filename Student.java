// Tumelo Lephadi
// Program that models a student's name
// 03 Ausgust 2015

public class Student{
   
   private String firstName;
   private String middleName;
   private String lastName;
   
   public void setNames(String first, String middle, String last){
      // Set the first, middle and last names of this Student object
      firstName = first;
      middleName = middle;
      lastName = last;
   }            
   
   public String getFullName(){
      // Obtain the full name of this Student with the middle name converted to an initial only.
      return firstName + " " + middleName.substring(0,1) + ". " + lastName; 
   }
}  
