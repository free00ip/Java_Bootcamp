package org.example.day4;

import java.util.HashMap;

import java.util.Map;

public class MapActivity {

    // Needs to be completed

        public static void main(String[] args) {

            MapActivity obj = new MapActivity();

            // 1 - Type code to create a HashMap of key-value pairs

            // where key is id of type String and value is a name

            Map<String, String> map = new HashMap();

            map.put("01", "Mike");
            map.put("02", "Nike");
            map.put("04", "Pike");


            // 2 - Call print method to print the map passed as its parameter.

            // (Hint: Notice print() is a non-static method, so create an instance of MapActivity)

            obj.print(map);

        }

        void print(Map map) {

            // 3 - Type code to print this map (keys and values)

            System.out.println(map);

        }

}
