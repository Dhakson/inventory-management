package entities;

import java.util.ArrayList;
import java.util.List;

public class Inventory {
	private List<Product> produtcs;
	
	
	public Inventory() {
		this.produtcs = new ArrayList<>();
	}
	
	public void addProduct(Product product) {
		produtcs.add(product);
	}
	
	
	public boolean removeProduct(String code, Integer quantity){
		for(Product product : produtcs) {
			if(product.getCode().equals(code)) {
				product.removerProduto(quantity);
				return true;
			}
		}
		return false;
	}
	
	public boolean searchProduct(String code) {
		 System.out.println("==========================================");
		    System.out.println("         PRODUCT INVENTORY           ");
		    System.out.println("==========================================");
		    System.out.println("| Name                 | Quantaty    | Code     | Price      | Total Price|");
		    System.out.println("==========================================");
		for(Product product : produtcs) {
			if(product.getCode().equals(code)) {
				System.out.println(product);
				return true;
			}
			System.out.println("===================================");
		  ;
		}
		return false;
	}
	
	public void displayInventory() {
		 System.out.println("==========================================");
		    System.out.println("         PRODUCT  INVENTORY             ");
		    System.out.println("==========================================");
		    System.out.println("| Name                 | Quantaty    | Code    | Price     | Total Price|");
		    System.out.println("==========================================");
		for(Product e : produtcs) {
			System.out.println(e);
		}
		
		System.out.println("===================================");
	   
	}

	


}
