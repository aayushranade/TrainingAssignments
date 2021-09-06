package com.friendlist.friendlist.model;

import java.sql.SQLOutput;
import java.util.*;

import com.friendlist.friendlist.repository.FriendlistRepository;

import org.springframework.beans.factory.annotation.Autowired;

public class FriendlistModel {

    @Autowired
    FriendlistRepository friendlistRepository;

    public void addNewFriend() {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter friend First name");
        String firstname = sc.nextLine();

        System.out.println("Enter friend Last name");
        String lastname = sc.nextLine();

        System.out.println("Enter friend phone number");
        String phoneno = sc.nextLine();

        System.out.println("Enter Email id");
        String email = sc.nextLine();

        friendlistRepository.insertNewFriendToDatabase(firstname,lastname,phoneno,email);
    }

    public void getFriend() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter friend phone number: ");
        String phoneno = sc.nextLine();
        Friend friendName = friendlistRepository.getFriendFromDatabase(phoneno);
        System.out.println("Name: " + friendName.getFirstname() + " " + friendName.getLastname());
        System.out.println("contact: " + friendName.getPhoneno());
        System.out.println("Email: " + friendName.getEmail() + "\n");
    }

    public void delFriend(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter PNo to delete: ");
        String phoneno = sc.nextLine();
        boolean friendName = friendlistRepository.delFriendFromDatabase(phoneno);
        System.out.println("Deletion successful");
    }

    public void updateFriend(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Pno to update a record: ");
        String phonenoToUpd = sc.nextLine();
        System.out.println("Enter email to update");
        String emailToUpd = sc.nextLine();
        Friend friendName = friendlistRepository.updateNewFriendToDatabase(phonenoToUpd,emailToUpd);
        System.out.println("Update Successful");

    }
}
