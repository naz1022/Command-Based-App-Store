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
public class Student extends Customer{
     public void PurApp(App product)
    { 
       Scanner input = new Scanner(System.in);
// declar variable to store the amount of discount for students
        
        double Discount= (25*product.getCost()/100);
        // declare variable to store the discounted price
        double amount = product.getCost()-Discount;
        // declare varialbe to store amount to be entered by the user
        double dueAmount = 0;
        
       
       
        
       System.out.print("\nPurchase summary:"+"\nApp name:"+product.getAppName()+"\nType: "+product.getAppType()+"\nAuthor: "+product.getAuthor()+"\nCost: "+product.getCost());
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
