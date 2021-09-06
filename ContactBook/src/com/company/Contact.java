package com.company;
//create a datatype 'contact'
//will represent a single record in our book
public class Contact
{
    private String Name;
    private String phoneNumber;
    private String emailId;

    public Contact(){}  //constructor to invoke instance variables

    //write getters and setters for each attribute
    public String getName()
    {
        return Name;
    }
    public void setName(String firstName)
    {
        this.Name =firstName;
    }
    public String getPhoneNumber()
    {
        return phoneNumber;
    }
    public void setPhoneNumber(String phoneNumber)
    {
        this.phoneNumber = phoneNumber;
    }
    public String getEmailId()
    {
        return emailId;
    }
    public void setEmailId(String emailId)
    {
        this.emailId = emailId;
    }
}
