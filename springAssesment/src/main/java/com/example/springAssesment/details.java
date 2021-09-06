package com.example.springAssesment;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class details {
    String name;
    String id;
    String companyname;

    @Override
    public String toString() {
        return "Details[id=" +id+",name=" +name+",companyname=" +companyname+"]";
    }
}
