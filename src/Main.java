
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author D
 */
public class Main {

    static Scanner input = new Scanner(System.in);
    
    static boolean mainMenu = true;
    static boolean innerMenu = true;
    static Shop appStore = new Shop();

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
         Shop appStore = new Shop();
         
        
         while (mainMenu)
         {
            innerMenu = true; 
            System.out.println("Please choose from the following options:");
            System.out.println("\n1.Adminstrator"+"\n2.Student"+"\n3.Academic"+"\n4.Normal User");
            int num1 = input.nextInt();
             switch(num1)
             {
                 case 1:
                    while(innerMenu)
                    {
                     System.out.println("Please choose from the following options");
                     System.out.println("1.Add apss for purchase:"+"\n2.Add free trial Apps"
                     +"\n3.list apps"+"\n4.Delete apps"+"\n5.Edit Apps"+"\n6 Main menu");
                     int num2 = input.nextInt();
                     switch(num2)
                     {
                         case 1:
                             addApp();
                             break;
                         case 2:
                             addTrials();
                             break;
                         case 3:
                             listApps();
                             break;
                         case 4:
                             deleteApps();
                             break;
                         case 5:
                             editApps();
                             break;
                         case 6:
                             innerMenu = false;
                            break;
                             }
                    // break;
                    }
                 case 2:
                     //
                     break;
                 case 3:
                     //
                     break;
                 case 4:
                     ///
                     break;
             }
         
         
         }
                           }
      private static void addApp() {
               App a = new App();
               
                input.nextLine();
                System.out.println("Please enter app name:");
                
                String appN = input.nextLine();
                a.setAppName(appN);
                System.out.println("Please enter Author?");
                String appA = input.nextLine();
                a.setAuthor(appA);
                System.out.println("Please enter app type?");
                String appType = input.nextLine();
                a.setAppType(appType);
                System.out.println("Please enter app description?");
                String appD = input.nextLine();
                a.setDesc(appD);
                System.out.println("Please enter cost?");
                double appC= input.nextInt();
                a.setCost(appC);
                
                appStore.add(a);
                
                System.out.println("The following object has successfully been created:");
       
    }

    private static void listApps() {
       
        if (appStore.myArray.isEmpty()&&appStore.trialArray.isEmpty())
        {
             System.out.println("No objecs have been added");
        }
        else
        {
        System.out.println(appStore.toString());
        System.out.println(appStore.freeTrials());
        }
        //System.out.println(appStore.trialArray.size());
    }

    private static void editApps() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private static void deleteApps() {
        input.nextLine();
        System.out.println("Please enter app name?");
        String name = input.nextLine();
        System.out.println("Please enter app type?");
        String type = input.nextLine();
        for (int count=0;count<appStore.myArray.size();)
        {
         if (name.equalsIgnoreCase(appStore.myArray.get(count).getAppName())|| type.equalsIgnoreCase(appStore.myArray.get(count).getAppType()))
         {
             System.out.println("match was found");
            //appStore.myArray.remove(count);
         }
         else
         {
          System.out.println("No match was found");
         }
        }
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private static void addTrials() {
               App trialApp = new App();
               
                input.nextLine();
                System.out.println("Please enter app name:");
                
                String appN = input.nextLine();
                trialApp.setAppName(appN);
                System.out.println("Please enter Author?");
                String appA = input.nextLine();
                trialApp.setAuthor(appA);
                System.out.println("Please enter app type?");
                String appType = input.nextLine();
                trialApp.setAppType(appType);
                System.out.println("Please enter app description?");
                String appD = input.nextLine();
                trialApp.setDesc(appD); 
                appStore.addTrials(trialApp);
        
    }

   
}
