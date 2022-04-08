package dkit.oop;        // April 2022

import java.util.*;

// REPEAT CA3 Lab Practical Examination - OOP April 2022

public class App {
    public static void main(String[] args) {
        App app = new App();
        app.start();
    }

    public void start() {

        System.out.println("CA3 Repeat Lab Examination");

        // Questions - add your answer under each heading below
        //
        // Q1a


        // Q1b


        // Q1c


        // Q1d
        // Time complexity


        // Q2a
        // Write and call method: "pickProductForSale( products )"

        // Q2b
        // filterProductsUniqueColours(  products )

        // Q2c
        // Prioritize Product by name

        // Q3
        // One hundred strings




    }


    //This is just a helper method to populate the list of strings for question 3.
    // You do not need to read it to answer any of the questions in the CA
    private List<String> populateOneHundredStrings() {
        ArrayList<String> oneHundredStrings = new ArrayList<>();

        for (int i = 0; i < 100; i++) {
            if (i / 10 == 0) {
                oneHundredStrings.add("Java");
            } else if (i / 10 == 1) {
                oneHundredStrings.add("Python");
            } else if (i / 10 == 2) {
                oneHundredStrings.add("C++");
            } else if (i / 10 == 3) {
                oneHundredStrings.add("Javascript");
            } else if (i / 10 == 4) {
                oneHundredStrings.add("Ruby");
            } else if (i / 10 == 5) {
                oneHundredStrings.add("Golang");
            } else if (i / 10 == 6) {
                oneHundredStrings.add("C#");
            } else if (i / 10 == 7) {
                oneHundredStrings.add("C");
            } else if (i / 10 == 8) {
                oneHundredStrings.add("R");
            } else if (i / 10 == 9) {
                oneHundredStrings.add("Swift");
            }
        }
        return oneHundredStrings;
    }
}
