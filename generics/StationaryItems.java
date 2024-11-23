package generics;

public interface StationaryItems {
	public abstract void getAllItems(StationaryLibrary<? extends Necessaries> obj);
}
