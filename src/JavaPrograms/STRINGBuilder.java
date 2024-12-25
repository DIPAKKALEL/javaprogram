package JavaPrograms;

public class STRINGBuilder {
//	string manupulation,
//	String s =aaaabbcccdd;
//	output = a4b2c3d2
	public static void main(String[] args) {
		String s = "aaaabbcccdd";
	String	result= result1(s);
		System.out.println(result);
	}

//without using String Buider Class	
	public static String result(String s) {
		String res = "";
		StringBuilder sb = new StringBuilder();
		int count = 1;
		for (int i = 1; i <= s.length() - 1; i++) {
			if (s.charAt(i) == s.charAt(i - 1)) {
				count++;
			} else {
				res = res + s.charAt(i - 1) + String.valueOf(count);
				count = 1;
			}
		}
		res = res + s.charAt(s.length() - 1) + String.valueOf(count);
		System.out.println(res);
		return res;
	}

	// with using String Bulider Class

	public static String result1(String s) {
		if (s == null || s.length() == 0) {
			return "";
		}
		StringBuilder sb = new StringBuilder();
		int count = 1;
		for (int i = 1; i < s.length(); i++) {
			if (s.charAt(i) == s.charAt(i - 1)) {
				count++;
			} else {
				sb.append(s.charAt(i - 1)).append(count);
				count = 1;
			}
		}
		sb.append(s.charAt(s.length() - 1)).append(count);
		return sb.toString();
	}
}
