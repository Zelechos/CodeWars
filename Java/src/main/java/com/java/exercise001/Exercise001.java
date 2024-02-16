package com.java.exercise001;

import java.util.*;

public class Exercise001 {
    public Exercise001() {
    }

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

        // Input Validation complete
        /**
         * My Solution !!
         * try {
         *    if (numbers.length == 0 || numbers.length == 1) return 0;
         * } catch (NullPointerException err) {
         *    return 0;
         * }
         * return processNumbers(getMin(numbers), getMax(numbers), numbers);
         */

        // The most optimal solution
        if (numbers == null || numbers.length == 0 || numbers.length == 1) return 0;
        int min,max,sum;
        sum = min = max = numbers[0];
        for (int i = 1; i < numbers.length; i++) {
            sum += numbers[i];
            if (numbers[i] < min) min = numbers[i];
            if (numbers[i] > max) max = numbers[i];
        }
        return sum - min - max;
    }

    public static int getMax(int[] numbers) {
        int max = 0;
        // Solution
        for (int i = 0; i < numbers.length; i++) {
            int flag = 0;
            if (max == 0) {
                max = numbers[i];
            }

            if (numbers.length - 1 != i) {
                flag = numbers[i + 1];
            } else {
                return max;
            }

            if (max > flag) {
                max = max;
            } else {
                max = flag;
            }
        }
        return max;
    }

    public static int getMin(int[] numbers) {
        int min = 0;
        for (int i = 0; i < numbers.length; i++) {
            int flag = 0;
            if (min == 0) {
                min = numbers[i];
            }

            if (numbers.length - 1 != i) {
                flag = numbers[i + 1];
            } else {
                return min;
            }

            if (min < flag) {
                min = min;
            } else {
                min = flag;
            }

        }
        return min;
    }

    public static int processNumbers(int min, int max, int[] numbers) {
        List<Integer> history = new ArrayList<>();
        List<Integer> stack = Arrays.asList(Arrays.stream(numbers).boxed().toArray(Integer[]::new));
        for (int i = 0; i < numbers.length; i++) {
            if (stack.get(i) == min || stack.get(i) == max) {
                if (!history.contains(stack.get(i))) {
                    history.add(stack.get(i));
                    stack.set(i, 0);
                }
            }
        }
        return stack.stream().mapToInt(Integer::intValue).sum();
    }
}

