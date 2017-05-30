
import java.util.ArrayList;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author D
 */
public class Shop {
    ArrayList<App> myArray = new ArrayList();
    ArrayList<App> trialArray = new ArrayList();
    
    
    public void add(App member)
    {
    myArray.add(member);
    }
    public void delete(App member)
    {
     myArray.remove(member);
    
    }
    public void addTrials(App member)
    {
        trialArray.add(member);
    }
     public void deleteTrials(App member)
    {
        trialArray.remove(member);
    }
    @Override
    public String toString()
    { 
        String total= "\nApps for purchase:";
         for (int c=0;c<myArray.size();c++)
         {
             App b = myArray.get(c);
             total = total+ b.toString();
         
         }
        return total;
        
    }
     public String freeTrials()
    { 
        String total= "\nFree Trials:";
         for (int c=0;c<trialArray.size();c++)
         {
             App app = trialArray.get(c);
             total = total+ app.freeTrials();
         
         }
        return total;
    }
    
}
