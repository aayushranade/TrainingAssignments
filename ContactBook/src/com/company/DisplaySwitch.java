package com.company;

import java.util.Scanner;

public class DisplaySwitch
{
    public static void displayMenu()
    {
        Scanner in = new Scanner(System.in);
        PhoneBook mainobj=new PhoneBook();

        while (true) {
        System.out.println("\nSelect from the menu");
        System.out.println("1. Add contact");
        System.out.println("2. Search contact");
        System.out.println("3. Delete contact");
        System.out.println("4. Exit");
        System.out.println("\nPlease enter your choice: ");

        int choice = in.nextInt();
        in.nextLine();
            switch (choice) {
                case 1:
                    //object of class contact
                    Contact obj = new Contact();
                    System.out.println("Add a contact");
                    //accept name
                    System.out.println("Enter the Name: ");
                    obj.setName(in.nextLine());
                    //accept pno
                    System.out.println("Enter the Phone No: ");
                    obj.setPhoneNumber(in.nextLine());
                    //accept email
                    System.out.println("Enter the Email:");
                    obj.setEmailId(in.nextLine());
                    mainobj.addContact(obj);
                    break;
                case 2:
                    System.out.println("Enter the Name of the person to search: ");
                    //accept search name
                    String nameS = in.nextLine();
                    Contact obj1 = mainobj.viewContact(nameS);
                    //display results
                    System.out.println("The contact is:");
                    System.out.println("Name:" + obj1.getName());
                    System.out.println("Phone No :" + obj1.getPhoneNumber());
                    System.out.println("Email :" + obj1.getEmailId());
                    break;
                case 3:
                    System.out.println("Enter the name to remove:");
                    //accept search name
                    String nameD=in.nextLine();
                    //ask yes or no and follow up by an if else
                    System.out.println("Do you want to remove the contact(Y/N):");
                    char ch=in.next().charAt(0);
                    if(ch=='Y')
                    {
                        boolean f1=mainobj.removeContact(nameD);
                        if(f1)
                            System.out.println("The contact is successfully deleted");
                        else
                            System.out.println("Contact is not found");
                    }
                    if(ch=='N')
                    {
                        System.out.println("ok");
                    }
                    break;
                case 4:
                    System.out.println("End of program");
                    System.exit(0);
                    break;
            }
        }
    }

}
