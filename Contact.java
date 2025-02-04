/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package contactdirectory;
import java.util.Calendar;
import java.util.GregorianCalendar;

/**
 *
 * @author Nawal khan 
 */
public class Contact {
    private String fName, lName;
    private String[] phoneNum;
    private String affiliation;
    private String occupation;
    private String note = "";
    private GregorianCalendar dob;
    private boolean blocked;//= false;//Eager initialization
    
    public Contact(String fName, String lName, String phoneNum[], String affiliation, String occupation, String notes, GregorianCalendar dob ){
        this.fName = fName;
        this.lName  = lName;
        this.phoneNum = phoneNum;
        this.occupation = occupation;
        this.affiliation = affiliation;
        note = notes;
        this.dob  =dob;
        blocked = false;
    }
    public Contact(String fName, String lName, String phoneNum[]){
        this.fName = fName;
        this.lName = lName;
        this.phoneNum = phoneNum;
        affiliation =null;
        occupation = null;
        note = null;
        dob = null;
    }
    public Contact(String fname, String phone[]){
        this(fname, null,phone,null, null, null, null);
        
    }
    public String getFName(){
        return fName;
        
    }
    public String getLName(){
        return lName;
        
    }
    public String getName(){
        String name = fName;
        if(lName!=null)
            name = name + " " + lName;
        //return fName+ (lName==null)? "":" "+lName;
        return name;
    }
    public String getPhoneNums(){
        String list = "";
        for(String num:phoneNum)
            list = list + "\n" + num;
        return list; 
    }
    public String getOccupation(){
        return occupation;
    }
    public String getDOB(){
        String date = "";
        date = ""+dob.get(Calendar.DAY_OF_MONTH);
        date = date + "-" + dob.get(Calendar.MONTH);
        date = date + "-" + dob.get(Calendar.YEAR);
        return date;
    }
    
    public void setPhoneNum(String [] p){
        phoneNum = p;
    }
    public void setPhoneNum(String old, String n){
        for(int i = 0;i<phoneNum.length;i++){
            if(phoneNum[i].equals(old))
                phoneNum[i] = n;
        }
    }
    public void setFName(String f){
        fName = f;
    }
    
    public void setDOB(GregorianCalendar d){
        dob = d;
    }
    public void setDOB(int m, int d, int year){
        dob.set(Calendar.DAY_OF_MONTH, d);
        dob.set(Calendar.MONDAY, m);
        dob.set(Calendar.YEAR, year);
    }
    public String toString(){
        String s="";
        s = getName();
        s = s + getPhoneNums();
        if(occupation != null)
            s = s+"\n"+occupation;
        return s;
    }
    
}
    
