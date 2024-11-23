package generics_learn;

public class GenericsLearn<T> {
	private T item;

	public T getItem() {
		return item;
	}

	public void setItem(T item) {
		this.item = item;
	}
	public static void main(String[] args) {
		GenericsLearn<String> s = new GenericsLearn<String>();
		s.setItem("bala");
		String name = s.getItem();
		System.out.println(name);
		
		GenericsLearn<Integer> i = new GenericsLearn<Integer>();
		i.setItem(23);
		Integer age = i.getItem();
		System.out.println(age);
	}
}
