package com.company;

import java.util.Arrays;
import java.util.Scanner;
import java.lang.String;

public class Main {

    public static void main(String[] args) {

        boolean continueCount = false;
        do {
            System.out.println("SKU |Name           |Price");
            System.out.println("ipd |Super Ipad     |$549.99");
            System.out.println("mbp |Macbook Pro    |$1399.99");
            System.out.println("atv |Apple TV       |$109.50");
            System.out.println("vga |VGA Adapter    |$30.00");

            Scanner buyItem = new Scanner(System.in);
            System.out.println("Enter item needed");

            String item = buyItem.nextLine();

            Item newItem = new Item(item);

            System.out.println("Total Price: " + newItem.calculateTotalPrice());

            System.out.println("Continue? [y/n]");
            Scanner continueCountScanner = new Scanner(System.in);
            String continueLah = continueCountScanner.nextLine();
            if (continueLah.equals("y")) {
                continueCount = true;
            }
        } while (continueCount);
    }

}
