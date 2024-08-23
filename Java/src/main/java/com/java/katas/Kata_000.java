package com.java.katas;

/**
 * Katas
 *
 * @author Alex T.H.
 * @version v0.0.2
 * @since 21.0.0 2024-08-23
 */
public class Kata_000 {

    public static void main(String[] args) {
//        int[] numbers = {6, 2, 1, 8, 10};
        int[] numbers = {1, 1, 11, 2, 3};
        System.out.println(sum(numbers));
    }
    /**
     * Sum without highest and lowest number
     * Examples :
     * { 6, 2, 1, 8, 10 } => 16
     * { 1, 1, 11, 2, 3 } => 6
     */
    public static int sum(int[] numbers) {
        // The most optimal solution
        if (numbers == null || numbers.length == 0 || numbers.length == 1) return 0;
        int min, max, sum;
        sum = min = max = numbers[0];
        for (int i = 1; i < numbers.length; i++) {
            sum += numbers[i];
            if (numbers[i] < min) min = numbers[i];
            if (numbers[i] > max) max = numbers[i];
        }
        return sum - min - max;
    }

}

