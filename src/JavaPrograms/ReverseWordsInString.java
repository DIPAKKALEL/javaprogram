package JavaPrograms;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ReverseWordsInString {

	public static void main(String[] args) {
		String str = "INDIA IS MY COUNTRY";

		// String reverseword = reverseEachCharacterWithWordsStrBulider(str);
		System.out.println(reverseEachCharacterWithWordsStrBulider(str));
	}

//without use of String Builder class--reverse only words from sentence
	public static String reversewords(String str) {

		// Output o/p = ""avaJ ;
		String[] words = str.split(" ");
		for (String s : words) {
			for (int i = s.length() - 1; i >= 0; i--) {
				System.out.print(s.charAt(i));
			}
			System.out.print(" ");
		}
		return str;
	}

//using String Builder Class --- reverse only words from sentence

	public static String reversewords1(String str) {
		String[] words = str.split(" ");
		StringBuilder reversesentence = new StringBuilder();
		for (String s : words) {
			String reverseword = new StringBuilder(s).reverse().toString();
			reversesentence.append(reverseword).append(" ");
		}
		return reversesentence.toString().trim();
	}
//without use of string builder class -- reverse words from sentence and also each character of each word

	public static String reverseEachCharacterwithWords(String sentence) {
		String[] words = sentence.split(" ");
		List<String> list = new ArrayList<>();
		for (int i = words.length - 1; i >= 0; i--) {
			list.add(words[i]);
		}
		for (String reverseword : list) {
			for (int j = reverseword.length() - 1; j >= 0; j--) {
				System.out.print(reverseword.charAt(j));
			}
			System.out.print(" ");
		}
//		Iterator<String> ite = list.iterator();
//		while(ite.hasNext()) {
//			String word = ite.next();
//			System.out.println(word);
//		}
		return "";
	}
//using string Builder class -- reverse words from sentense and each character of words

	public static StringBuilder reverseEachCharacterWithWordsStrBulider(String sentense) {
		StringBuilder strbuilder = new StringBuilder();
		strbuilder.append(sentense).reverse().toString();
		return strbuilder;
	}

}
