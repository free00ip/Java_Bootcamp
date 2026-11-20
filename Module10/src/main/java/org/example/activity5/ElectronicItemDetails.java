package org.example.activity5;

import java.util.HashMap;

// 5. Create a class ElectronicitemDetails

public class ElectronicItemDetails {

    public static void main(String[] args) {

        // 5.1 Create itemHashMap with String name and double price

        HashMap<String, Double> itemHashMap = new HashMap();

        // 5.3.1 Add 4 items in hashmap - TV, Refrigerator, Washing Machine, Laptop

        itemHashMap.put("TV", 450.0);
        itemHashMap.put("Refrigerator", 370.5);
        itemHashMap.put("Washing Machine", 284.0);
        itemHashMap.put("Laptop",1324.6);

        ElectronicItemDetails obj = new ElectronicItemDetails();

        // 5.3.2 system.out.printlin("Price of TV is "+ returnPriceOfltem(<parameter1>, <parameter2>));

        System.out.println("Price of TV is " + obj.returnPriceOfItem(itemHashMap,"TV"));

    }

    // 5.2 Create a method public double returnPriceOfitem(HashMap itemHashMap.name)

    public double returnPriceOfItem (HashMap<String, Double> itemHashMap, String key){

        return itemHashMap.get(key);
    }
}