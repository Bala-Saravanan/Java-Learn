package codingBat;

public class StarOut {
	
	public static String starOut(String str) {
		  
		  StringBuffer result = new StringBuffer();
		  int i = 0;
		  
		  while (i < str.length()) {
		    
		    if (str.charAt(i) == '*') {
		      
		      if (result.length() > 0) {
		        
		        result.deleteCharAt(result.length() - 1);
		        
		        while (i + 1 < str.length() && str.charAt(i + 1) == '*') {
		          i ++;
		        }
		      }
		      i ++;
		    } 
		    else {
		      result.append(str.charAt(i));
		    }
		    i ++;
		  }
		  return result.toString();
		}



	public static void main(String[] args) {
		
		String result = starOut("sm***iel*ly");
		System.out.println(result);
	}

}
