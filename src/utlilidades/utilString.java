package utlilidades;

public interface utilString {
	public default String eraseFirstN(String s, int n) {
        if (s == null || n > s.length()) {
            return s;
        }
        return s.substring(n);
    }
	
	public default String firstNChars(String str, int n) {
        if (str == null) {
            return null;
        }
        return str.substring(0, Math.min(str.length(), n));
    }

}
