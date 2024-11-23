package generics;

public class StationaryLibrary<T> extends Necessaries implements StationaryItems{



	@Override
	public void getAllItems(StationaryLibrary <? extends Necessaries > obj) {
		System.out.println("something.....");
		
	}

	@Override
	public void printDetails() {
		System.out.println("something");
		
	}

}
