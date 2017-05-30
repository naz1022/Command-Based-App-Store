/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author D
 */
import java.util.Scanner;
public class Customer {
     static Scanner input = new Scanner(System.in);
     private String cusName,cusAddress,cusProfession;
   private int trials = 0;
   int purchases = 0;
   double discount;

    public void setPurchases(int purchases) {
        this.purchases = purchases;
    }
  
   
          

    public String getCusName() {
        return cusName;
    }
    

    public void setCusName(String cusName) {
        this.cusName = cusName;
    }

    public String getCusAddress() {
        return cusAddress;
    }

    public void setCusAddress(String cusAddress) {
        this.cusAddress = cusAddress;
    }

    public String getCusProfession() {
        return cusProfession;
    }

    public void setCusProfession(String cusProfession) {
        this.cusProfession = cusProfession;
    }

    public int getTrials() {
        return trials;
    }

    public int getpurchases() {
        return purchases;
    }

   public void getFreTrial(App ftProduct)
   {
        System.out.print("\nFree Trial summary:"+ftProduct.getAppName()+"\n"+ftProduct.getAppType()+"\n"+ftProduct.getAuthor()+"\n"+ftProduct.getTrial());
       // System.out.print("\nAmount due:"+amount);
        System.out.println("\nWould you like to proceed?");
        String answer = input.nextLine();
        if (answer.equalsIgnoreCase("yes"))
        {
        
         System.out.print("Thank you - your order has been processed:");
         trials ++;
        }
   
   }

  
    
    public void PurApp(App product)
    { 
      
// declar variable to store the amount of discount for students
        
        double Discount = 0;
        // declare variable to store the discounted price
        double amount = product.getCost()-Discount;
        // declare varialbe to store amount to be entered by the user
        double dueAmount = 0;
        
       
       
        
        System.out.print("\nPurchase summary:"+"App name:"+product.getAppName()+"\nType"+product.getAppType()+"\nAuthor"+product.getAuthor()+"\nCost"+product.getCost());
        System.out.print("\nAmount due:"+amount);
        System.out.println("\nWould you like to proceed?");
        String answer = input.nextLine();
        if (answer.equalsIgnoreCase("yes"))
        {
            do {
        System.out.println("\nPlease enter amount due?"+amount);
        dueAmount = input.nextDouble();
        
               }while(dueAmount!=amount);
       
        System.out.print("Thank you - your payment has been processed:");
         purchases ++;
         product.setPopularity(product.getPopularity()+1);
        }
       
        
    }
    
}
