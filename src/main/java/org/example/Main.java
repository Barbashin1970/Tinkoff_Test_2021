package org.example;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt(); // количество наборов входных данных

        for (int i = 0; i < t; i++) {
            String s = scanner.next(); // вводится строка S
            boolean isValid = checkString(s);

            if (isValid) {
                System.out.println("Yes");
            } else {
                System.out.println("No");
            }
        }
    }

    private static boolean checkString(String s) {
        if (s.length() != 4) {
            return false; // строка должна быть длиной 4
        }

        Map<Character, Integer> charCount = new HashMap<>();

        for (char c : s.toCharArray()) {
            charCount.put(c, charCount.getOrDefault(c, 0) + 1);
        }

        if (charCount.size() != 2) {
            return false; // должно быть 2 различные буквы
        }

        for (int count : charCount.values()) {
            if (count != 2) {
                return false; // каждая буква должна встречаться дважды
            }
        }

        return true;
    }
}
