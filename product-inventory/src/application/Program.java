package application;

import java.util.Scanner;

import entities.Inventory;
import entities.Product;

public class Program {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Inventory inventory = new Inventory();
        
        while(true) {
            System.out.println("1. Add Product");
            System.out.println("2. Display Inventory");
            System.out.println("3. Search by ID");
            System.out.println("4. Remove Product");
            System.out.println("5. Exit");
            int option = sc.nextInt();
            sc.nextLine();
            
            switch(option) {
                case 1:
                    System.out.print("Name: ");
                    String name = sc.nextLine();
                    
                    System.out.print("Quantity: ");
                    Integer quantity = sc.nextInt();
                    
                    System.out.print("ID: ");
                    sc.nextLine(); // consume the leftover newline
                    String id = sc.nextLine();
                    
                    System.out.print("Price: ");
                    Double price = sc.nextDouble();
                    
                    Product product = new Product(name, quantity, id, price);
                    inventory.addProduct(product);
                    break;
                case 2:
                    inventory.displayInventory();
                    break;
                case 3:
                    System.out.print("Product ID: ");
                    String searchId = sc.nextLine();
                    inventory.searchProduct(searchId);
                    break;
                case 4:
                    System.out.print("ID: ");
                    String removeId = sc.nextLine();
                    
                    System.out.print("Quantity: ");
                    Integer removeQuantity = sc.nextInt();
                    
                    inventory.removeProduct(removeId, removeQuantity);
                    System.out.println("Inventory Updated.");
                    inventory.displayInventory();
                    break;
                case 5:
                    System.out.println("Closing the Program...");
                    sc.close();
                    return;
                    
                default:
                    System.out.println("Invalid option.");
            }
        }
    }
}
