package strings;

public class Methods {
	
	public static void main(String[] args) {
		// contains()
		String name = "Bala";
		boolean result = name.contains("as");
		System.out.println(result);
		
		// equals()
		String str1 = "Hello, ";
		String str2 = "Hello, ";
		result = str1.equals(str2);
		System.out.println(result);
		
		// charAt()
		char a = name.charAt(1);
		System.out.println(a);
		
		// indexOf()
		int b = name.indexOf('B');
		System.out.println(b);
		
		// length()
		int c = name.length();
		System.out.println(c);
		
		// replace()
		String str3 = str1.replace("Hel", "hel");
		System.out.println(str3);
		
		// substring()
		String fname = "Bala";
		String subStr = fname.substring(1, 3);
		System.out.println(subStr);
		
		// toUppercase()
		String capName = name.toUpperCase();
		System.out.println(capName);
		
		// toLowerCase()
		String lowName = name.toLowerCase();
		System.out.println(lowName);
		
		// trim()
		String paddedName = "   Bala   ";
		String non_padded_name = paddedName.trim();
		System.out.println(paddedName);
		System.out.println(non_padded_name);
		
		// split()
		String new_name = "New Bala Saravanan";
		String[] arr = new_name.split(" ");
		for (String i: arr) {
			System.out.println(i);
		}
		
		String s = Integer.toString(1234);
		System.out.println(s);
		
		if (s instanceof String) {
			System.out.println(true);
		}
		
		
		
		
	}
}
