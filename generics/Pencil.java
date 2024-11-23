package generics;

public class Pencil<E> {
	E e;
	String brand, type;
	
	public Pencil(String brand, String type) {
		this.brand = brand;
		this.type = type;
	}
	
	public void getAllItems() {
		System.out.println("1. " + brand);
		
	}
	
	public void printDetails() {
		System.out.println("brand: " + brand + "\ntype: " + type);
	}
	
}

