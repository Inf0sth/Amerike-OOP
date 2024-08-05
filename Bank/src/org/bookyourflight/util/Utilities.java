package org.bookyourflight.util;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.bookyourflight.flights.FlightException;

public abstract class Utilities {
	public static boolean matchRegex(String regex, String str) {
		// Creates the string pattern from the regex
		Pattern pattern = Pattern.compile(regex);
		// Create the matcher object
		Matcher matcher = pattern.matcher(str);
		// Find the regex in the string
		return matcher.find();
	}
}
