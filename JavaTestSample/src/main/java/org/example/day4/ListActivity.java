package org.example.day4;

import java.util.ArrayList;

import java.util.List;

public class ListActivity {


// Needs to be complete

    public static void main(String[] args) {

         // TODO: 1 - Type code to create a list of names. Use ArrayList.

        List<String> list = new ArrayList();

         // Add "John", "John", "Harry", and "Daniel" to the list.

        list.add("John");
        list.add("John");
        list.add("Harry");
        list.add("Daniel");

        // TODO: 2 - Call print method to print the list passed as its parameter.

        print(list);

    }

    static void print(List list) {

         // TODO: 3 - Type code to print this list

        System.out.println(list);

         // Notice the order in which elements get printed.

 }

}
