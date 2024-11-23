package generics;

public class Pen<E,T> {
	E e;
	T e1;
	T c;

	public Pen(E penName, T penPrice) {
		this.e = penName;
		this.e1 = penPrice;
	}
	
	public void setPenCount(T e) {
		this.c = e;
		System.out.println("count"+ this.c);
	}
	
	public void getAllItems() {
		System.out.println("1. " + e);
		
	}

	@Override
	public String toString() {
		return "Pen [e=" + e + ", e1=" + e1 + ", c=" + c + "]";
	}
	
	
	

}
