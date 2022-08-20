package org.example.config;

import java.util.Scanner;

public class check {


        public static int checkQuantity(Scanner input) {
            int quantity;
            while (true) {
                if (input.hasNextInt()) {
                    int temp = input.nextInt();
                    if (temp > 0) {
                        quantity = temp;
                        return quantity;
                    } else {
                        System.out.print("Enter Quantity Greater than 0! : ");
                    }
                } else {
                    System.out.print("Enter Number! : ");
                    input.next();
                }
            }
        }

        public static String checkNationalCode(Scanner input) {
            System.out.print("Enter national code : ");
            String nationalCode;
            while (true) {
                if (input.hasNextInt()) {
                    String temp = input.next();
                    if (temp.length() == 10) {
                        nationalCode = temp;
                        return nationalCode;
                    } else {
                        System.out.print("Enter 10 Number! : ");
                    }
                } else {
                    System.out.print("Enter Number! : ");
                    input.next();
                }
            }
        }

        public static int checkPrice(Scanner input) {
            int price;
            while (true) {
                if (input.hasNextLong()) {
                    int temp = input.nextInt();
                    if (temp > 0) {
                        price = temp;
                        return price;
                    } else {
                        System.out.print("Enter Price Greater than 0! : ");
                    }
                } else {
                    System.out.print("Enter Number! : ");
                    input.next();
                }
            }
        }
}
