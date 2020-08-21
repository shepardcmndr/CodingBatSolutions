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

    public int commonTwo(String[] a, String[] b) {
        int counter = 0;
        String d = "";
        String t;
        for (int j = 0, k = 0; j < a.length && k < b.length; ) {
             t = a[j];
            if (a[j].compareTo(b[k]) < 0) {
                j++;
            } else if (a[j].compareTo(b[k]) > 0) {
                k++;
            } else {
                if (!d.equals(t)) {
                    d = t;
                    counter++;
                }
                j++;
                k++;
            }
        }
        return counter;
    }

    public String[] mergeTwo(String[] a, String[] b, int n) {
        String[] result = new String[n];
        for (int i = 0, j = 0, k = 0;
             (k < n) && (i < a.length || j < b.length);
             k++) {
            if (a[i].compareTo(b[j]) < 0) {
                result[k] = a[i];
                i++;
            } else if (a[i].compareTo(b[j]) > 0){
                result[k] = b[j];
                j++;
            } else {
                result[k] = b[j];
                j++;
                i++;
            }
        }
        return result;
    }

    public int userCompare(String aName, int aId, String bName, int bId) {
        if (aName.compareTo(bName) < 0) {
            return -1;
        } else if (aName.compareTo(bName) > 0) {
            return 1;
        } else {
            return Integer.compare(aId, bId);
        }
    }

    public int bigHeights(int[] heights, int start, int end) {
        int bigSteps = 0;
        for (int i = start; i < end ; i++) {
            if (Math.abs(heights[i] - heights[i + 1]) >= 5) {
                bigSteps++;
            }
        }
        return bigSteps;
    }

    public int sumHeights2(int[] heights, int start, int end) {
        int height = 0;
        for (int i = start; i < end ; i++) {
            if (heights[i] < heights[i + 1]) {
                height += (heights[i + 1] - heights[i]) * 2;
            } else {
                height += heights[i] - heights[i + 1];
            }
        }
        return height;
    }

    public int sumHeights(int[] heights, int start, int end) {
        int height = 0;
        for (int i = start; i < end ; i++) {
            height += Math.abs(heights[i] - heights[i + 1]);
        }
        return height;
    }

    public int scoresSpecial(int[] a, int[] b) {
        return largestSpecialScore(a) + largestSpecialScore(b);
    }

    public int largestSpecialScore(int[] array) {
        int result = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 10 == 0 && array[i] > result) {
                result = array[i];
            }
        }
        return result;
    }

    public String[] wordsWithout(String[] words, String target) {
        List<String> temp = new ArrayList<>();
        for (int i = 0; i < words.length; i++) {
            if (!words[i].equals(target)) {
                temp.add(words[i]);
            }
        }
        String[] result = new String[temp.size()];
        for (int i = 0; i < temp.size(); i++) {
            result[i] = temp.get(i);
        }
        return result;
    }

    public int scoreUp(String[] key, String[] answers) {
        int score = 0;
        for (int i = 0; i < key.length; i++) {
            if (key[i].equals(answers[i])) {
                score += 4;
            } else if (!answers[i].equals("?")){
                score -= 1;
            }
        }
        return score;
    }

    public int matchUp(String[] a, String[] b) {
        int counter = 0;
        for (int i = 0; i < a.length; i++) {
            if (a[i].length() != 0 && b[i].length() != 0 &&
                    a[i].charAt(0) == b[i].charAt(0)) {
                counter++;
            }
        }
        return counter;
    }

    public int[] copyEndy(int[] nums, int count) {
        int[] result = new int[count];
        for (int i = 0, j = 0; i < nums.length && j < count; i++) {
            if (isEndy(nums[i])) {
                result[j] = nums[i];
                j++;
            }
        }
        return result;
    }

    public boolean isEndy(int n) {
        return (n >= 0 && n <= 10) || (n >= 90 && n <= 100);
    }

    public int[] copyEvens(int[] nums, int count) {
        int[] result = new int[count];
        for (int i = 0, j = 0; i < nums.length && j < count; i++) {
            if (nums[i] % 2 == 0) {
                result[j] = nums[i];
                j++;
            }
        }
        return result;
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
