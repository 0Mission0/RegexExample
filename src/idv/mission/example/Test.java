package idv.mission.example;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Test {
	public static void main(String args[]) {
		// String to be scanned to find the pattern.
		String str = "sc-170307.csv";
		String patternStr = "^sc-\\d{6}\\.csv$";
		//String str = "170307";
		//String patternStr = "\\d{6}";

		// Create a Pattern object
		Pattern pattern = Pattern.compile(patternStr);

		// Now create matcher object.
		Matcher matcher = pattern.matcher(str);
		boolean result = matcher.matches();
		System.out.println(result);
	}
}
