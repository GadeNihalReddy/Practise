package org.example;

import org.pojo.Product;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        System.out.println("Another message");

        //works as an object for a product
        Product product1 = new Product();
        product1.setPId(1);
        product1.setDescription("This is a macBook product");
        product1.setPName("Mac");
        product1.setPrice(2000);
        product1.setProdId(1234);
        System.out.println(product1);
        Product product2 = new Product(1, 1234, "Mac", 2000, "This is a macBook product Object");
        System.out.println(product2);
        System.out.println(product1.equals(product2));
    }
}