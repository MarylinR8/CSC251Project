import java.util.Scanner;

public class Policy
{
   private int policyNumber;
   private String providerName;
   private String firstName;
   private String lastName;
   private double age;
   private String smokingStatus;
   private double height;
   private double weight;
   private double bmi;
   private double baseFee;
   
   public void setPolicyNumber(int number)
   {
      policyNumber = number;
   }
   public int getPolicyNumber()
   {
      return policyNumber;
   }
   
   public void setProviderName(String provider)
   {
      providerName = provider;
   }
   public String getProviderName()
   {
      return providerName;
   } 
   
   public void setFirstName(String name1)
   {
      firstName = name1;
   }
   public void setLastName(String name2)
   {
      lastName = name2;
   }
   public String getFirstName()
   {
      return firstName;
   }
   public String getLastName()
   {
      return lastName;
   }
   
   public void setAge(double personAge)
   {
      age = personAge;
   }
   public double getAge()
   {
      return age;
   }
   
   public void setSmokingStatus(String status)
   {
      if (status == "smoker")
      {
         smokingStatus = "smoker";
      }
      else 
      {
         smokingStatus = "non-smoker";
      }
   }
   public String getSmokingStatus()
   {
      return smokingStatus;
   }
   
   public void setHeight(double tall)
   {
      height = tall;
   }
   public double getHeight()
   {
      return height;
   }
   
   public void setWeight(double heavy)
   {
      weight = heavy;
   }
   public double getWeight()
   {
      return weight;
   }
   
   public void setBmi(double height, double weight)
   {
      double bmi = (weight * 703.0)/(Math.pow(height, 2.0));
   }   
   public double getBmi()
   {
      return bmi;
   }
   
   public double priceOfPolicy(double baseFee, double age, String smokingStatus, double bmi)
   {
      double base = 600.0;
      
      if (age > 50.0)
      {
         double addAgeFee = 75.0;
         base += addAgeFee;
      }
      else if (smokingStatus == "smoker")
      {
         double addSmokerFee = 100.0;
         base += addSmokerFee;
      }
      else if (bmi > 35.0)
      {
         double addBmiFee = (bmi - 35.0) * 20.0;
         base += addBmiFee;
      }
      return base;
   }
}