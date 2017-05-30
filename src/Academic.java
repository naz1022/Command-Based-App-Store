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
public class Academic extends Customer{
    private int purchases=0;
     // override the PurApp method so that the discout for Academic is set to 10%
     public void PurApp(App product)
    { 
        

// declar variable to store the amount of discount for academics
        
        double Discount= (10*product.getCost()/100);
        // declare variable to store the discounted price
        double amount = product.getCost()-Discount;
        // declare varialbe to store amount to be entered by the user
        double dueAmount = 0;
        
       
       
        
        System.out.print("\nPurchase summary:"+product.getAppName()+"\n"+product.getAppType()+"\n"+product.getAuthor()+"\n"+product.getCost());
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
        else
         {
             
                
         }
    }
    
}
