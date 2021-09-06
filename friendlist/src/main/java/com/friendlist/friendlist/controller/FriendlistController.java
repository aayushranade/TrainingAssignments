package com.friendlist.friendlist.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Controller;

import com.friendlist.friendlist.model.*;

import java.util.*;

@Controller
public class FriendlistController implements CommandLineRunner {
    
    @Autowired
    FriendlistModel friendlistModelObj;

    @Override
    public void run(String... args) throws Exception {
        System.out.println("Welcome to SpringBoot\n\n");
        Scanner sc = new Scanner(System.in);

        boolean menu = true;

        while (menu) {

        System.out.println("----MENU-----");
        System.out.println("1. Add new Record");
        System.out.println("2. Search for a Record");
        System.out.println("3. Delete a Record");
        System.out.println("4. Update a Record");
        System.out.println("5. Exit");


            int option = sc.nextInt();
            switch (option) {
                case 1:
                    System.out.println("Adding new friend");
                    friendlistModelObj.addNewFriend();
                    break;
                case 2:
                    System.out.println("Searching for a record");
                    friendlistModelObj.getFriend();
                    break;
                case 3:
                    System.out.println("Deleting a record");
                    friendlistModelObj.delFriend();
                    break;
                case 4:
                    System.out.println("Update a record");
                    friendlistModelObj.updateFriend();
                    break;
                case 5:
                    menu = false;
                default:
                    break;
            }            
        }
        System.exit(0);
    }
}
