package generics;


public class Main<E> {
		
	public static void main(String[] args) {
				
		Pen<String, Integer> pen = new Pen<String, Integer>("reynolds",54);
		pen.getAllItems();
		
		pen.setPenCount(5);
		System.out.println(pen.toString());;
		
		
		Pencil<StationaryLibrary> pencil = new Pencil<StationaryLibrary>("Camilin", "mechanical");
		pencil.getAllItems();
		pencil.printDetails();
	}
}

