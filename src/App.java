/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author D
 */
public class App {
     private String appName,author,appType,desc;
     private double cost;
     private String trial = "free tiral";
     private int popularity ;

    public int getPopularity() {
        return popularity;
    }

    public void setPopularity(int popularity) {
        
        this.popularity = popularity;
        //System.out.print("popularity has been set");
    }

    public String getTrial() {
        return trial;
    }

    public void setTrial(String trial) {
        this.trial = trial;
    }

    public String getAppName() {
        return appName;
    }
    
    

    public void setAppName(String appName) {
        this.appName = appName;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getAppType() {
        return appType;
    }

    public void setAppType(String appType) {
        this.appType = appType;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public double getCost() {
        return cost;
    }

    public void setCost(double cost) {
        this.cost = cost;
    }
     
    @Override
    public String toString()
    {
        return "\nApp name:"+appName+"\nAuthor: "+author+"\nApp type: "+appType
                +"\nDescription"+desc+"\nCost: "+cost+"\n";
    }
    public String freeTrials()
    {
        return "\nApp name:"+appName+"\nAuthor: "+author+"\nApp type: "+appType
                +"\nDescription"+desc+"\n";
    }
    
}
