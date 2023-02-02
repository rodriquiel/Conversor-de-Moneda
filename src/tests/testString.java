package tests;

public class testString {
	 public static String eraseFirstN(String s, int n) {
	        if (s == null || n > s.length()) {
	            return s;
	        }
	        return s.substring (n);
	    }
	 	
	 public static String firstNChars(String str, int n) {
	        if (str == null) {
	            return null;
	        }
	        return str.substring(0, Math.min(str.length(), n));
	    }
	 	
	    public static void main(String[] args) {
	        String s = "ABCD";
	        int n = 3;
	 
	        System.out.println(firstNChars(s, n));        // CD
	    }

}
