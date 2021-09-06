package com.example.springAssesment;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class controller {
    @Autowired
    model modelObj;

    @Autowired
    repository repositoryobj;

    @RequestMapping(value = "/main")
    public String mainPage()
    {
        return "you are in main page";
    }

    @RequestMapping("/add")
    public String addDetails(@RequestParam(value="name") String name, @RequestParam(value="id")String id, @RequestParam(value="companyname")String companyname){
        repositoryobj.insertNewDetailsToDatabase(name,id,companyname);
        return "details added...Check database";
    }

    @PostMapping("/details")
    public details showDetails(@RequestBody details details){
        System.out.println("details= "+details);
        repositoryobj.insertNewDetailsToDatabaseJson(details);
        return details;
    }
}
