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
        List<Player> players = addPlayers();


        // Q1b
        sortPlayersByName(players);
        System.out.println();


        // Q1c
        sortPlayersByAge(players);
        System.out.println();

        // Q1d
        // Time complexity
        // O(n)

        // Q2a
        // Write and call method: "pickProductForSale( products )"
        Map<Integer, Product> map = new HashMap<>();
        map.put(1, new Product(1, "car", "red"));
        map.put(2, new Product(2, "shirt", "red"));
        map.put(3, new Product(3, "bag", "green"));
        map.put(4, new Product(4, "jacket", "yellow"));
        map.put(5, new Product(5, "ball", "black"));

        Product p = pickProductForSale(map);
        System.out.println(p);
        System.out.println();

        // Q2b
        // filterProductsUniqueColours(  products )
        List<Product> list = filterProductsUniqueColours(map);
        list.forEach(System.out::println);
        System.out.println();


        // Q2c
        // Prioritize Product by name
        productPrioritizeByName(map);


        // Q3
        // One hundred strings




    }

    // Q1a
    private ArrayList<Player> addPlayers() {
        ArrayList<Player> list = new ArrayList<>();
        list.add(new Player(1, "John Doe", 20));
        list.add(new Player(2, "Jane Doe", 21));
        list.add(new Player(3, "Jack Doe", 22));
        list.add(new Player(4, "Jill Doe", 23));
        return list;
    }

    // Q1b
    private void sortPlayersByName(List<Player> players) {
        List<Player> temp = players;
        temp.sort(new NameComparator());
        System.out.println("Sorted by name");
        temp.forEach(System.out::println);
    }

    // Q1c
    private void sortPlayersByAge(List<Player> players) {
        players.sort(new AgeComparator());
        System.out.println("Sorted by age");
        players.forEach(System.out::println);
    }

    // Q2a
    private Product pickProductForSale(Map<Integer, Product> products) {
        int[] keyArray = new int[products.keySet().size()];

        int index = 0;
        for (Integer key : products.keySet()) {
            keyArray[index++] = key;
        }

        int randomKey = keyArray[new Random().nextInt(keyArray.length)];
        return products.get(randomKey);
    }

    // Q2b
    private static List<Product> filterProductsUniqueColours (Map<Integer, Product> products) {
        Set<Product> set = new TreeSet<>(new ColourComparator());
        set.addAll(products.values());
        return new ArrayList<>(set);
    }

    // Q2c
    private void productPrioritizeByName(Map<Integer, Product> products) {
        Queue<Product> queue = new PriorityQueue<>(new ProductNameComparator());
        queue.addAll(products.values());

        System.out.println("Product prioritized by name");
        queue.forEach(System.out::println);
        System.out.println();

        System.out.println("Removing Highest Priority Product");
        queue.remove();
        queue.forEach(System.out::println);
        System.out.println();
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
