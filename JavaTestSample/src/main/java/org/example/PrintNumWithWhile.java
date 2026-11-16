package org.example;

public class PrintNumWithWhile {
    public static void main() {
        int i = 0;

        while (i <= 100) {
            if (i % 2 == 0) {
                System.out.println(i);
            }

            i++;
        }

    }
}
