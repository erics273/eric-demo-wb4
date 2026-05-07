package com.pluralsight;

import java.util.ArrayList;
import java.util.Scanner;

public class ProductUI {

    private static Scanner theScanner = new Scanner(System.in);

    private static ArrayList<Product> products;

    private ProductUI(){}

    public static void displayHomeMenu(){

        //loads my products from the file manager for me to use
        initialize();

        //kick off my menues
        boolean appRunning = true;
        while (appRunning) {
            System.out.println("""
                    Welcome to the Shop
                        1) View All Products
                        2) Add Product
                        3) exit
                    """);

            int choice = theScanner.nextInt();

            switch (choice) {
                case 1:
                    displayAllProducts();
                    break;
                case 2:
                    addProduct();
                    break;
                case 3:
                    appRunning = false;
                    break;
                default:
                    System.out.println("bad choice");
            }
        }

    }

    private static void initialize(){

       products =  ProductFileManager.getProducts();

    }

    private static void addProduct(){
        //pretend we used the scanner to get the answers to what product is being added
        Product someNewProduct = new Product(456, "Empanada", 3.99);

        products.add(someNewProduct);

        ProductFileManager.saveProducts(products);

        System.out.println(someNewProduct.getName() + "was added");
    }

    private static void displayAllProducts(){
        for(Product product : products){
            System.out.println(product.getName());
        }
    }

}
