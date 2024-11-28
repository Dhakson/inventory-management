package entities;

public class Product {
	private String name;
	private Integer quantity;
	private String code;
	private Double price;
	
	public Product() {
	}

	
	
	public Product(String nome, Integer quantity, String code, Double price) {
		this.name = nome;
		this.quantity = quantity;
		this.code = code;
		this.price = price;
	}


	public String getNome() {
		return name;
	}


	public void setNome(String nome) {
		this.name = nome;
	}


	public Integer getQuantity() {
		return quantity;
	}


	public void setQuantity(Integer quantity) {
		this.quantity = quantity;
	}


	public Double getPrice() {
		return price;
	}


	public void setPrice(Double price) {
		this.price = price;
	}


	public String getCode() {
		return code;
	}


	public void removerProduto(Integer quantityToRemove) {
		this.quantity -= quantityToRemove;
	}
	
	

	@Override
	public String toString() {
	    // Se 'codigo' for do tipo String, utilizamos %s para formatar
	    return String.format("| %-20s | %-10d | %-10s | %-10.2f | %-10.2f |", 
	                         name, quantity, code, price, quantity * price);
	}
	
	
	

}
