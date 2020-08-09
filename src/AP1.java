/*
Created by: shepardcmndr
Date: 09.08.2020
Comments:
*/

import java.util.ArrayList;
import java.util.List;

public class AP1 {
    public static void main(String[] args) {
    }

    public static boolean dividesSelf(int n) {
        int digit;
        int tempNum = n;
        while (tempNum > 0) {
            digit = tempNum % 10;
            if (digit == 0 || n % digit != 0) {
                return false;
            } else {
                tempNum = tempNum / 10;
            }
        }
        return true;
    }

    public boolean hasOne(int n) {
        while (n >= 10 ) {
            if (n % 10 == 1) {
                return true;
            } else {
                n = n / 10;
            }
        }
        return n == 1;
    }

    public List wordsWithoutList(String[] words, int len) {
        List<String> omitted = new ArrayList<>();
        for (int i = 0; i < words.length; i++) {
            if (words[i].length() != len) {
                omitted.add(words[i]);
            }
        }
        return omitted;
    }

    public String[] wordsFront(String[] words, int n) {
        String[] result = new String[n];
        for (int i = 0; i < n; i++) {
            result[i] = words[i];
        }
        return result;
    }

    public int wordsCount(String[] words, int len) {
        int counter = 0;
        for (int i = 0; i < words.length; i++) {
            if (words[i].length() == len) {
                counter++;
            }
        }
        return counter;
    }

    public int scoresAverage(int[] scores) {
        int half = scores.length / 2;
        int averageStart = average(scores, 0, half);
        int averageEnd = average(scores, half, scores.length);
        return Math.max(averageStart, averageEnd);
    }

    public int average(int[] scores, int start, int end) {
        int score = 0;
        for (int i = start; i < end; i++) {
            score += scores[i];
        }
        return score / (end - start);
    }

    public boolean scoresClump(int[] scores) {
        for (int i = 0; i < scores.length - 2; i++) {
            if (Math.abs(scores[i] - scores[i + 1]) <= 2 &&
                    Math.abs(scores[i] - scores[i + 2]) <= 2) {
                return true;
            }
        }
        return false;
    }

    public boolean scores100(int[] scores) {
        for (int i = 0; i < scores.length - 1; i++) {
            if (scores[i] == 100 & scores[i + 1] == 100) {
                return true;
            }
        }
        return false;
    }

    public boolean scoresIncreasing(int[] scores) {
        for (int i = 1; i < scores.length; i++) {
            if (scores[i - 1] > scores[i]) {
                return false;
            }
        }
        return true;
    }
}
