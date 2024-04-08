package org.example;

/**
 * I approached problem 3 solution first because looked more like a real life scenario, but did not present it because after
 * reading carefully instructions of activity, I decided to move forward with problem 1 because it was a more complex
 * problem. The solution is just straight forward validation of requirements in problem description.
 * Problem number 2 was almost like the same, it can be solved using Arrays.stream functionality looking for A having
 * two occurrences and a contains of 'LLL'.
 */

public class EmailValidator {
    /*public boolean isValidEmail(String email) {
        String[] parts = email.split("@");
        if (parts.length != 2 || !parts[1].equals("codechallenge.com")) {
            return false; // Invalid domain
        }

        String prefix = parts[0];
        if (!Character.isLetter(prefix.charAt(0))) {
            return false; // Prefix must start with a letter
        }

        // Regular expression to match valid characters in the prefix
        return prefix.matches("[a-zA-Z0-9_.-]+");
    }*/
}
