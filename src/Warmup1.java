/*
Created by: shepardcmndr
Date: 19.06.2020
Comments:
*/

public class Warmup1 {
    public static void main(String[] args) {
    }

    public String everyNth(String str, int n) {
        StringBuilder temp = new StringBuilder(str.charAt(0) + "");
        int count = n;
        while (n < str.length()) {
            temp.append(str.charAt(n));
            n += count;
        }
        return temp.toString();
    }

    public String endUp(String str) {
        if (str == null || str.equals(""))
            return str;
        else if (str.length() < 3)
            return str.toUpperCase();
        else return str.substring(0, str.length() - 3) +
                    str.substring(str.length() - 3).toUpperCase();
    }

    public boolean lastDigit(int a, int b) {
        return a % 10 == b % 10;
    }

    public boolean stringE(String str) {
        if (str == null || str.equals(""))
            return false;
        char[] chars = str.toCharArray();
        int counter = 0;
        for (char aChar : chars) {
            if (aChar == 'e')
                counter++;
        }
        return counter <= 3 && counter >= 1;
    }

    public int max1020(int a, int b) {
        if (a <= 20 && a >= 10 && b <= 20 && b >= 10)
            return Math.max(a, b);
        else if (a <= 20 && a >= 10)
            return a;
        else if (b <= 20 && b >= 10)
            return b;
        else return 0;
    }


    public boolean in3050(int a, int b) {
        return (a <= 40 && a >= 30 && b <= 40 && b >= 30)
                || (a <= 50 && a >= 40 && b <= 50 && b >= 40);
    }

    public int close10(int a, int b) {
        if (Math.abs(10 - a) == Math.abs(10 - b))
            return 0;
        if (Math.abs(10 - a) < Math.abs(10 - b))
            return a;
        else return b;
    }

    public int intMax(int a, int b, int c) {
        return Math.max(Math.max(a, b), c);
    }

    public String startOz(String str) {
        if (str == null || str.equals("") || str.length() < 2)
            return "";

        char first = str.charAt(0);
        char second = str.charAt(1);
        String res = "";
        if (first == 'o') res += first;
        if (second == 'z') res += second;
        return res;
    }

    public boolean mixStart(String str) {
        if (str == null || str.equals("") || str.length() < 3)
            return false;
        String temp = str.substring(1, 3);
        return temp.equals("ix");
    }

    public String delDel(String str) {
        if (str.startsWith("del", 1))
            return str.charAt(0) + str.substring(4);
        else return str;
    }

    public boolean loneTeen(int a, int b) {
        return  (a >= 13 && a <= 19) ^ (b >= 13 && b <= 19);
    }

    public boolean hasTeen(int a, int b, int c) {
        return a >= 13 && a <= 19 || b >= 13 && b <= 19 || c >= 13 && c <= 19;
    }

    public boolean in1020(int a, int b) {
        return a >= 10 && a <= 20 || b >= 10 && b <= 20;
    }

    public boolean icyHot(int temp1, int temp2) {
        return (temp1 < 0 && temp2 > 100) || (temp2 < 0 && temp1 > 100);
    }

    public boolean startHi(String str) {
        return str.startsWith("hi");
    }

    public String front22(String str) {
        String temp;
        if (str.length() < 2) temp = str;
        else temp = str.substring(0, 2);
        return temp + str + temp;
    }

    public boolean or35(int n) {
        return n % 3 == 0 || n % 5 == 0;
    }

    public String backAround(String str) {
        StringBuilder sb = new StringBuilder(str);
        sb.append(str.charAt(str.length() - 1));
        sb.insert(0, str.charAt(str.length() - 1));
        return sb.toString();
    }

    public String front3(String str) {
        int l = 3;
        if (str == null || str.equals(""))
            return str;
        else if (str.length() < 3)  l = str.length();
        return str.substring(0, l) + str.substring(0, l) + str.substring(0, l);
    }

    public String missingChar(String str, int n) {
        if (n == 0) return str.substring(1);
        else if (n == str.length() - 1) return str.substring(0, str.length() - 1);
        else return str.substring(0, n) + str.substring(n + 1);
    }

    public String frontBack(String str) {
        if (str == null || str.equals("")) return str;
        StringBuilder stringBuilder = new StringBuilder(str);
        stringBuilder.setCharAt(0, str.charAt(str.length() - 1));
        stringBuilder.setCharAt(str.length() - 1, str.charAt(0));
        return stringBuilder.toString();
    }
}
