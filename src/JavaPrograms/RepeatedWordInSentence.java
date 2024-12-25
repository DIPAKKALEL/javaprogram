package JavaPrograms;

import java.util.HashMap;
import java.util.Map;

public class RepeatedWordInSentence {

	public static void main(String[] args) {
		RepeatedWordInSentence repeat = new RepeatedWordInSentence();
		repeat.NumberofCharacterInSentence("Welcome to India. Best Luck to Your Journey");
	}

	public static int CountOfRepeateWordInSentence(String Sentence, String Substring) {
		int count = 0;
		String[] words = Sentence.split(" ");
		for (String word : words) {
			String WORD = word.replaceAll("[^a-zA-Z0-9]", "");// replace special character from string
			System.out.println(WORD);
			if (WORD.equals(Substring)) {
				count++;
			}
			// System.out.println("Number of occurance of substring in given sentence is :"
			// + count);
		}
		return count;
	}

	public int NumberOfOccuranceOfWordsInSentence(String sentence) {
		Map<String, Integer> hashmap = new HashMap<>();
		int count = 0;
		String[] words = sentence.split(" ");
		for (String word : words) {
			Integer integer = hashmap.get(word);
			if (integer == null) {
				hashmap.put(word, 1);
			} else {
				hashmap.put(word, integer + 1);
			}
		}
		System.out.println(hashmap);

		return count;
	}

	public void NumberofCharacterInSentence(String sentence) {
		Map<Character, Integer> hashmap = new HashMap<>();
		char[] characterarray = sentence.toCharArray();
		for (Character c : characterarray) {
			Integer integer = hashmap.get(c);
			if (integer == null) {
				hashmap.put(c, 1);
			} else {
				hashmap.put(c, integer + 1);
			}
		}
		System.out.println(hashmap);
	}
}
