package com.company;
import java.util.*;
import java.util.ArrayList;
import java.util.List;

public class PhoneBook {

    //create a list of datatype 'contact'
    private List<Contact> phoneBook = new ArrayList<Contact>();

    //add the 'contactObj' to the list: phoneBook
    public void addContact(Contact contactObj)
    {
        phoneBook.add(contactObj);
    }
    //write a method to search for a contact with i/p = name
    public Contact viewContact(String NameS)
    {
        Contact obj=new Contact();              //dont create obj, just retrive with a for loop
        for(Contact obj1:phoneBook)
        {
            if(Objects.equals(obj1.getName(), NameS))  //if(obj.getName()==firstName) why does this return null
            {
                obj=obj1;
            }
        }
        return obj;
    }
    //method to delete a contact with i/p = name
    public boolean removeContact(String firstNameD)
    {
        boolean f=false;
        for(Contact obj:phoneBook)
        {
            if(Objects.equals(obj.getName(), firstNameD)) //if(obj.getName()==firstName) same null problem
            {
                f=true;
                phoneBook.remove(obj);
                break;
            }
        }
        return f;
    }

}
