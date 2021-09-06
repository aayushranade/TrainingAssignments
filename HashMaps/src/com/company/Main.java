package com.company;

import java.sql.SQLOutput;
import java.util.*;

public class Main {

    public static void main(String[] args) {
        Map<String,Map<String,String>> maps= new HashMap<String,Map<String,String>>();
        Scanner sc=new Scanner(System.in);
        for(int i=0; i<2; i++) {
            System.out.println("Enter Product Code: ");
            String prodCode=sc.next();
            Map<String, String> map = new HashMap<String, String>();
            System.out.println("Enter Item Name: ");
            map.put("ItemName",sc.next());
            System.out.println("Enter MRP: ");
            map.put("MRP", sc.next());
            System.out.println("Enter Expiry Period: ");
            map.put("ExpDate", sc.next());
            maps.put(prodCode,map);
        }
        maps.forEach((key, value) -> System.out.println("ProdCode: " + key + "  " + "ItemDetails:" + value));

        System.out.println("Do you want to search for a specific product Y/N: ");
        String ans=sc.next();
        if(ans.equals("Y")){
            System.out.println("enter product code: ");
            String code=sc.next();
            System.out.println(maps.get(code));
        }
        else{
            System.out.println("thank you for Browsing");
        }

















        /*for(Map.Entry<String,String> entry: map.entrySet())
        {
            System.out.println("Name: " + entry.getKey() + "  " + "Age: " + entry.getValue());
        }*/

    }
}
