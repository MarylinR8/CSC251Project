import java.util.Scanner;

public class Project_Marylin_RosaHernandez
{
   public static void main(String[] args)
   {
      double baseFee = 0.0;
      
      Scanner scnr = new Scanner(System.in);
      
      //Get input from user
      
      System.out.println("Please enter the Policy Number: ");
      String policyNumber = scnr.nextLine();
      
      System.out.println("Please enter the Provider Name: ");
      String providerName = scnr.nextLine();
      
      System.out.println("Please enter the Policyholder's First Name: ");
      String firstName = scnr.nextLine();
      
      System.out.println("Please enter the Policyholder’s Last Name: ");
      String lastName = scnr.nextLine();
      
      System.out.println("Please enter the Policyholder’s Age: ");
      double age = scnr.nextInt();
      
      //Reset scanner from nextInt
      scnr.nextLine();
      
      System.out.println("Please enter the Policyholder’s Smoking Status (smoker/non-smoker): ");
      String smokingStatus = scnr.nextLine();
      
      System.out.println("Please enter the Policyholder’s Height (in inches): ");
      double height = scnr.nextInt();
      
      System.out.println("Please enter the Policyholder’s Weight (in pounds): ");
      double weight = scnr.nextInt();
      
      
      //Get all necessary information from Policy class
      
      Policy person1 = new Policy();
      double bmi = person1.setBmi(height, weight);
      
      System.out.println("Policy Number: " + person1.getPolicyNumber());
      
      System.out.println("Provider Name: " + person1.getProviderName());
      
      System.out.println("Policyholder’s First Name: " + person1.getFirstName());
      
      System.out.println("Policyholder's Last Name: " + person1.getLastName());
      
      System.out.println("Policyholder's Age: " + person1.getAge());
      
      System.out.println("Policyholder's Smoking Status: " + person1.getSmokingStatus());
      
      System.out.println("Policyholder's Height: " + person1.getHeight());
      
      System.out.println("Policyholde'’s Weight: " + person1.getWeight());
      
      System.out.println("Policyholder's BMI: " + person1.getBmi());
      
      System.out.printf("Policy Price: $%.2f\n" + person1.priceOfPolicy(baseFee, age, smokingStatus, bmi));
   }
}