package com.nagarro.effectivecost.main;
import java.util.*;
import com.nagarro.effectivecost.model.Item;

public class Main {

	public static void main(String[] args) {
		Scanner s= new Scanner(System.in);
		List<Item> items = new ArrayList();
		String choice="y";
		while(choice.equalsIgnoreCase("Y")) {
			Item item = new Item();
			System.out.println("Enter the name of the item :");
			String name = s.nextLine();
			item.setName(name);
			double price=0.0;
			try {
				System.out.println("Enter the price of the item :");
			    price =Double.parseDouble(s.nextLine());
				item.setPrice(price);
			}catch(NumberFormatException ex) {
				// handling number format exception
				System.out.println("Please enter a valid quantity as price : ");
				item.setPrice(Double.parseDouble(s.nextLine()));;
			}
			int quantity = 0;
			try{
				System.out.println("Enter the quantity of the item :");
				item.setQuantity(Integer.parseInt(s.nextLine()));
			}catch(NumberFormatException ex) {
				// handling number format exception
				System.out.println("Please enter a valid integer as quantity : ");
				item.setQuantity(Integer.parseInt(s.nextLine()));
			}
			System.out.println("Enter the type of the item :");
			String type = s.nextLine();
			item.setType(type);
			item.setTax(type,price);
			items.add(item);
			System.out.println("Do you want to enter more item (y/n): ");
			choice = s.nextLine();
		}
			
			System.out.println("------------------------------------------------------------------------------------------------------------");
		    System.out.printf("%10s %10s %40s %40s","NAME", "PRICE", "SALES TAX LIABLILITY (per item)", "FINAL PRICE (per item)");
		    System.out.println();
		    System.out.println("------------------------------------------------------------------------------------------------------------");
		    for(Item item: items){
		        System.out.format("%10s %10s %30s %40s ",
		                item.getName(), item.getPrice(), item.getTax(), (item.getTax()+ item.getPrice()));
		        System.out.println();
		    }
		    System.out.println("------------------------------------------------------------------------------------------------------------");
		
		}

	}
