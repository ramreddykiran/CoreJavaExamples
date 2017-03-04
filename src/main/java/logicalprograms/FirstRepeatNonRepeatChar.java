package logicalprograms;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Optional;
import java.util.function.Function;
import java.util.stream.Collectors;

public class FirstRepeatNonRepeatChar {

	public static void main(String[] args) {
		firstRepeatedNonRepeatedCharUsingStreams("abcsdnvs");
		firstRepeatedNonRepeatedCharOldApproach("abcsdnvs");
	}

	private static void firstRepeatedNonRepeatedCharUsingStreams(String input) {
		Map<Character, Long> collect = input.chars()
											.mapToObj(i -> (char) i)
											.collect(Collectors.groupingBy(Function.identity(), LinkedHashMap::new, Collectors.counting()));
		collect.forEach((x, y) -> System.out.println("Key: " + x + " Val: " + y));

		Optional<Character> firstNonRepeat = collect.entrySet().stream()
													.filter(e -> e.getValue() == 1)
													.map(e -> e.getKey())
													.findFirst();
		if (firstNonRepeat.isPresent()) {
			System.out.println("First non repeating:" + firstNonRepeat.get());
		}
		Optional<Character> firstRepeat = collect.entrySet().stream()
												 .filter(e -> e.getValue() > 1)
												 .map(e -> e.getKey())
												 .findFirst();
		System.out.println("First repeating:" + firstRepeat.orElse(null));
	}

	static void firstRepeatedNonRepeatedCharOldApproach(String inputString) {
		Map<Character, Integer> charCountMap = new LinkedHashMap<Character, Integer>();
		char[] strArray = inputString.toCharArray();
		for (char c : strArray) {
			if (charCountMap.containsKey(c)) {
				charCountMap.put(c, charCountMap.get(c) + 1);
			} else {
				charCountMap.put(c, 1);
			}
		}

		for (char c : strArray) {
			if (charCountMap.get(c) == 1) {
				System.out.println("First Non-Repeated Character In '" + inputString + "' is '" + c + "'");
				break;
			}
		}

		for (char c : strArray) {
			if (charCountMap.get(c) > 1) {
				System.out.println("First Repeated Character In '" + inputString + "' is '" + c + "'");
				break;
			}
		}
	}

}
