package com.pluralsight;

import java.io.*;
import java.util.ArrayList;

// This class is responsible for saving and loading product data.
public class ProductFileManager {

    private static final String FILE_PATH = "src/main/resources/products.csv";

    private ProductFileManager(){}

    public static ArrayList<Product> getProducts() {

        ArrayList<Product> products = new ArrayList<>();

        try {

            BufferedReader fileReader = new BufferedReader( new FileReader(FILE_PATH));

            String productLine;

            while((productLine = fileReader.readLine()) != null) {

                String[] parts = productLine.split("\\|");

                int id = Integer.parseInt(parts[0]);
                String name = parts[1];
                double price = Double.parseDouble(parts[2]);

                Product product =  new Product(id, name, price);

                products.add(product);
            }

            fileReader.close();

        } catch(IOException e) {

            System.out.println("Error reading product file.");
        }

        return products;
    }

    public static void saveProducts(ArrayList<Product> products) {

        try {

            BufferedWriter fileWriter =
                    new BufferedWriter( new FileWriter(FILE_PATH) );

            for(Product product : products) {

                String line = product.getId() + "|" + product.getName() + "|" + product.getPrice();

                fileWriter.write(line);
                //adds the newline after the row
                fileWriter.newLine();
            }

            fileWriter.close();

        } catch(IOException e) {
            System.out.println("Error writing product file.");
        }
    }
}