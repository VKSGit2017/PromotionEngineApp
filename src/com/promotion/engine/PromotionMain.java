package com.promotion.engine;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import com.promotion.engine.impl.PromotionImpl;

public class PromotionMain {

	public static void main(String[] args) {
		Promotion promotion = new PromotionImpl();
		
		List<Product> productList = new ArrayList<Product>();
        Scanner scanner = new Scanner(System.in);
        System.out.print("Please enter total number of order : ");
        int orderCount = Integer.parseInt(scanner.nextLine());
        for (int i = 0; i < orderCount; i++)
        { 
        	System.out.print("Please enter type of product[A,B,C,D] : ");
        	String productType = scanner.nextLine();
        	Product product = new Product();
        	product.setProductType(productType);
        	productList.add(product);
        }
        
        int totalPrice = promotion.getTotalPrice(productList);
        System.out.println("Total Price of the product : "+totalPrice); 
        
        scanner.close();
		
	}

}

