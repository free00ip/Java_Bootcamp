package org.example;

public class NumToWordsUsingMethod {

    public static void main () {
        printWord(2);
        printWord(4);
        printWord(5);
    }

    public static void printWord (int x) {
        switch (x) {
            case 1:
                System.out.println("Variable 'x' is one");
                break;
            case 2:
                System.out.println("Variable 'x' is two");
                break;
            case 3:
                System.out.println("Variable 'x' is three");
                break;
            case 4:
                System.out.println("Variable 'x' is four");
                break;
            case 5:
                System.out.println("Variable 'x' is five");
                break;
            case 6:
                System.out.println("Variable 'x' is six");
                break;
            case 7:
                System.out.println("Variable 'x' is seven");
                break;
            case 8:
                System.out.println("Variable 'x' is eight");
                break;
            case 9:
                System.out.println("Variable 'x' is nine");
                break;
            case 10:
                System.out.println("Variable 'x' is ten");
                break;

            default:
                System.out.println("Other value");
        }

    }

}
