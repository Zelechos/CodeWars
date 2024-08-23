package com.java.katas;

import java.util.stream.Collectors;

/**
 * Katas
 *
 * @author Alex T.H.
 * @version v0.0.2
 * @since 21.0.0 2024-08-23
 */
public class Kata_001 {

    public static String textEvaluate(String text) {
        return text.chars()
                .mapToObj(e -> (char) e)
                .map(e -> Character.isUpperCase(e) ? Character.toLowerCase(e): Character.toUpperCase(e))
                .map(String::valueOf)
                .collect(Collectors.joining());
    }
}
