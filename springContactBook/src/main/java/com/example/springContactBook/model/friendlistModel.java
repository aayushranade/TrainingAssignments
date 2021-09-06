package com.example.springContactBook.model;

import com.friendlist.friendlist.repository.FriendlistRepository;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.Scanner;

public class FriendlistModel {

    @Autowired
    FriendlistRepository FriendlistRepository;

    public void addNewFriend() {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter friend First name");
        String firstname = sc.nextLine();

        System.out.println("Enter friend Last name");
        String lastname = sc.nextLine();

        System.out.println("Enter Phone Number");
        String phoneno = sc.nextLine();

        System.out.println("Enter his Email address");
        String email = sc.nextLine();

        FriendlistRepository.insert
    }
}
