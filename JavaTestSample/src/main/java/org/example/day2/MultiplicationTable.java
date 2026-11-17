package org.example.day2;

public class MultiplicationTable {
    public static void main() {
        for (int x = 11; x <= 20; x++) {
            for (int i = 1; i <= 10; i++){
                int y = x * i;
                System.out.println(x + " * " + i + " = " + y);
            }
            System.out.println();
        }
    }
}
