/*
Created by: shepardcmndr
Date: 20.06.2020
Comments:
*/

import java.util.Enumeration;

public class Warmup2 {
    public static void main(String[] args) {
    }

    public boolean has271(int[] nums) {
        if (nums == null || nums.length < 3)
            return false;
        for (int i = 0; i < nums.length - 2; i++) {
            if (nums[i + 1] - nums[i] == 5 &&
            Math.abs(nums[i + 2] - (nums[i] - 1)) <= 2)
                return true;
        }
        return false;
    }

    public boolean noTriples(int[] nums) {
        if (nums == null || nums.length < 3)
            return true;
        for (int i = 0; i < nums.length - 2; i++) {
            if (nums[i] == nums[i + 1] && nums[i + 1] == nums[i + 2])
                return false;
        }
        return true;
    }

    public int array667(int[] nums) {
        if (nums == null || nums.length < 2)
            return 0;
        int counter = 0;
        for (int i = 0; i < nums.length - 1; i++) {
            if (nums[i] == 6 && (nums[i + 1] == 6 || nums[i + 1] == 7))
                counter++;
        }
        return counter;
    }

    public String stringYak(String str) {
        if (str == null || str.equals("") || str.length() < 3)
            return str;
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < str.length(); i++) {
            if (i + 2 < str.length() && str.charAt(i) == 'y' && str.charAt(i + 2) == 'k')
                i += 2;
            else sb.append(str.charAt(i));
        }
        return sb.toString();
    }

    public String altPairs(String str) {
        if (str == null || str.equals("") || str.length() < 3)
            return str;
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < str.length(); i += 4){
            sb.append(str.charAt(i));
            sb.append(str.charAt(i + 1));
        }
        return sb.toString();
    }

    public String stringX(String str) {
        if (str == null || str.equals("") || str.length() < 3)
            return str;
        StringBuilder sb = new StringBuilder();
        sb.append(str.charAt(0));
        for (int i = 1; i < str.length() - 1; i++) {
            if (str.charAt(i) != 'x')
                sb.append(str.charAt(i));
        }
        sb.append(str.charAt(str.length() - 1));
        return sb.toString();
    }

    public int stringMatch(String a, String b) {
        if (a == null || b == null || a.length() < 2 || b .length() < 2)
            return 0;
        int l = Math.min(a.length(), b.length());
        int counter = 0;
        for (int i = 0; i < l - 1; i++) {
            if (a.substring(i, i + 2).equals(b.substring(i, i + 2)))
                counter++;
        }
        return counter;
    }

    public boolean array123(int[] nums) {
        if (nums == null || nums.length < 3)
            return false;
        for (int i = 0; i < nums.length - 2; i++) {
            if (nums[i] == 1 && nums[i + 1] == 2 && nums[i + 2] == 3)
                return true;
        }
        return false;
    }

    public boolean arrayFront9(int[] nums) {
        if (nums == null || nums.length == 0)
            return false;
        int l = Math.min(nums.length, 4);
        for (int i = 0; i < l; i++) {
            if (nums[i] == 9)
                return true;
        }
        return false;
    }

    public int arrayCount9(int[] nums) {
        if (nums == null || nums.length == 0)
            return 0;
        int counter = 0;
        for (Integer i : nums) {
            if (i == 9)
                counter++;
        }
        return counter;
    }

    public int last2(String str) {
        if (str == null || str.equals("") || str.length() <= 2)
            return 0;
        String end = str.substring(str.length() - 2);
        int counter = 0;
        for (int i = 0; i < str.length() - 2; i++) {
            if (str.substring(i, i + 2).equals(end))
                counter++;
        }
        return counter;
    }

    public String stringSplosion(String str) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < str.length() + 1; i++) {
            sb.append(str, 0, i);
        }
        return sb.toString();
    }

    public String stringBits(String str) {
        if (str == null || str.equals(""))
            return str;
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < str.length(); i += 2) {
            sb.append(str.charAt(i));
        }
        return sb.toString();
    }

    public boolean doubleX(String str) {
        if (str == null || str.equals("") || str.length() < 2)
            return false;
        for (int i = 0; i < str.length() - 1; i++) {
            if (str.charAt(i) == 'x')
                return str.charAt(i + 1) == 'x';
        }
        return false;
    }

    public int countXX(String str) {
        if (str == null || str.equals("") || str.length() < 2)
            return 0;
        int counter = 0;
        for (int i = 0; i < str.length() - 1; i++) {
            if (str.startsWith("xx", i))
                counter++;
        }
        return counter;
    }

    public String frontTimes(String str, int n) {
        if (str == null || str.equals(""))
            return str;
        int length = Math.min(str.length(), 3);
        String substring = str.substring(0, length);
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < n; i++)
            sb.append(substring);
        return sb.toString();
    }

    public String stringTimes(String str, int n) {
        if (str == null || str.equals("") || n == 1)
            return str;
        StringBuilder stringBuilder = new StringBuilder("");
        for (int i = 0; i < n; i++)
            stringBuilder.append(str);
        return stringBuilder.toString();
    }
}
