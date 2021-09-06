package com.example.springcontact.controller;

import com.example.springcontact.model.contactModel;
import com.example.springcontact.model.friend;
import com.example.springcontact.repository.contactRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.context.request.WebRequest;


@RestController
public class contactController {

    @Autowired
    contactModel contactModelObj;

    @Autowired
    contactRepository contactRepositoryobj;


    @PostMapping("/add")
    public String postContacts(WebRequest webRequest){
        String phoneno = webRequest.getParameter("phoneno");
        String name = webRequest.getParameter("name");
        String email = webRequest.getParameter("email");
        //String reply= "New Contact Details: \n" + "Pno-" +phoneno + "\n" + "name-" +name + "\n" + "email-" +email + "\n";
        contactRepositoryobj.insertNewFriendToDatabase(phoneno,name,email);
        return "Contact added";
    }

    @GetMapping("/search")
    public void getContacts(@RequestParam String phoneno)
    {
        friend details = contactRepositoryobj.getFriendFromDatabase(phoneno);
        System.out.println("\nContact Found!!\n"+"Contact:"+details.getName() +" "+ details.getEmail());
    }

    @GetMapping("/update")
    public void updateContacts(WebRequest webRequest){
        String phoneno = webRequest.getParameter("phoneno");
        String email = webRequest.getParameter("email");
        contactRepositoryobj.updateNewFriendToDatabase(email,phoneno);
        System.out.println("contact Updated");;
    }

    @GetMapping("/delete")
    public void deleteContacts(WebRequest webRequest){
        String phoneno = webRequest.getParameter("phoneno");
        contactRepositoryobj.delFriendFromDatabase(phoneno);
        System.out.println("contact Deleted");
    }
}
