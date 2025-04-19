package org.example2;

import java.util.*;
import java.util.stream.Collectors;

public class ProductStreamExercises {

    public static void main(String[] args) {
        List<Product> products = Arrays.asList(
                new Product(1, "laptop", 1500.0, "Electronics"),
                new Product(2, "Shampoo", 8.5, "Cosmetics"),
                new Product(3, "Smartphone", 999.99, "Electronics"),
                new Product(4, "Book", 29.99, "Education"),
                new Product(5, "caiet", 10.99, "Education")
        );

        // TODO 1: Afișează toate produsele folosind forEach + stream
        System.out.println("Produse:");
        //products.stream().forEach(System.out::println);


        // TODO 2: Creează o listă cu doar numele produselor
        List<String> productNames = null;
        productNames = products.stream().map(e -> e.getName()).collect(Collectors.toList());
        //System.out.println(productNames);


        // TODO 3: Creează o listă cu produsele care costă peste 100 RON
        List<Product> expensiveProducts = null;
        expensiveProducts = products.stream()
                .filter(e -> e.getPrice() > 100)
                .collect(Collectors.toList());
        //expensiveProducts.stream().forEach(System.out::println);

        // TODO 4: Sortează produsele după preț crescător
        List<Product> sortedByPrice = null;
        sortedByPrice = products.stream().sorted(Comparator.comparing(e -> e.getPrice())).collect(Collectors.toList());
        //sortedByPrice.stream().forEach(System.out::println);


        // TODO 5: Aplică un discount de 15% la toate produsele și returnează o listă nouă
        List<Product> discountedProducts = null;
        discountedProducts = products.stream()
                .map(e -> e.applyDiscount(15))
                .collect(Collectors.toList());
        //discountedProducts.stream().forEach(System.out::println);

        // TODO 6: Grupează produsele după categorie (Electronics, Cosmetics etc.)
        Map<String, List<Product>> groupedByCategory = null;
        groupedByCategory = products.stream()
                .collect(Collectors.groupingBy(e -> e.getCategory()));
        /*groupedByCategory.forEach((k, v) -> {
            System.out.println("Category: " + k);
            v.forEach(System.out::println);
        });*/

        // TODO 7: Află dacă toate produsele au preț mai mare de 5 RON
        boolean allAboveFive = false;
        allAboveFive = products.stream()
            .allMatch(e -> e.getPrice() > 5.0);
       /* if (allAboveFive) {
            System.out.println("All above five");
        }*/

        // TODO 8: Află dacă vreun produs este din categoria "Book"
        boolean hasBooks = false;
        hasBooks = products.stream()
                .anyMatch(e ->e.getName().equals("Books"));
        /*if (hasBooks == true) {
            System.out.println("Books is in the list");
        }
        else{
            System.out.println("Books is not in the list");
        }*/


        // TODO 9: Găsește primul produs care costă mai mult de 1000 RON
        Product firstExpensive = null;
        firstExpensive = products.stream()
                .filter( e -> e.getPrice() > 1000)
                .findFirst().get();
        // System.out.println(firstExpensive.toString());

        // TODO 10: Calculează suma totală a prețurilor produselor
        double totalPrice = 0.0;
        totalPrice = products.stream()
                .mapToDouble(e -> e.getPrice())
                .sum();
        //System.out.println(totalPrice);



        // TODO 11: Creează o listă de caractere cu prima literă din fiecare nume de produs (ex: "Laptop" -> 'L')
        List<Character> initials = null;
        initials = products.stream().map(e -> e.getName().charAt(0)).collect(Collectors.toList());
        //initials.forEach(System.out::println);

        // TODO 12: Afișează doar produsele din categoria "Electronics", dar cu numele scris cu majuscule
        List<String> upperCaseElectronics = null;
        upperCaseElectronics = products.stream().filter(e -> e.getCategory().equals("Electronics"))
                .map(e ->e.getName().toUpperCase()).collect(Collectors.toList());

        //upperCaseElectronics.forEach(System.out::println);

        // TODO 13: Creează o listă plată (flat list) cu toate literele din fiecare nume de produs
        List<Character> allLetters = null;
        allLetters = products.stream()
                            .map(e -> e.getName().split(""))
                                    .flatMap(Arrays::stream)
                                    .map(e -> e.charAt(0))
                                    .collect(Collectors.toList());

        //allLetters.forEach(System.out::println);

        // TODO 14: Folosește limit și skip: obține 2 produse, începând cu al doilea
        List<Product> skippedAndLimited = null;
        skippedAndLimited = products.stream()
                .skip(2)
                .limit(2)
                .collect(Collectors.toList());
        //skippedAndLimited.forEach(System.out::println);

        // TODO 15: Afișează produsul cel mai ieftin
        Product cheapest = null;
        cheapest = products.stream()
                .min(Comparator.comparing(Product::getPrice))
                .orElse(null);

        System.out.println( cheapest.toString());

        // TODO 16: Afișează produsul cel mai scump
        Product mostExpensive = null;
        mostExpensive = products.stream()
                .max(Comparator.comparing(Product::getPrice))
                .orElse(null);

        System.out.println( mostExpensive.toString());

    }
}
