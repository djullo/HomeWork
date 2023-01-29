package com.ua.robot.homeWork5;

public class Main {
    public static void main(String[] args) {
//        int number = 4;
//       if (number > -22) {
//            System.out.println(number + " > -22");
//       }
//        int number2 = -6;
//        if (number2 < 32) {
//            System.out.println(number2 + " < 32");
//        }

        //Зробив 1 програму для знаходження більшого, меншого і дорівнює
        int a = 7;
        int b = 7;
        if (a < b) {
            System.out.println(a + " less " + b);
        } else {
            if (a > b) {
                System.out.println(a + " larger " + b);
            } else {
                if (a == b) {
                    System.out.println(a + " equal to " + b);
                }
            }
        }

        int number4 = 66;
        if (number4 % 2 == 0) {
            System.out.println(number4 + " = is even");
        }
    }
}
