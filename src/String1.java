/*
Created by: shepardcmndr
Date: 22.06.2020
Comments:
*/

public class String1 {
    public static void main(String[] args) {
    }

    public String withoutX2(String str) {
        if (str == null)
            return "";
        if (str.length() > 1 && str.charAt(1) == 'x')
            str = str.charAt(0) + str.substring(2);
        if (str.length() > 0 && str.charAt(0) == 'x')
            return str.substring(1);
        return str;
    }

    public String withoutX(String str) {
        if (str == null || str.equals(""))
            return str;
        if (str.charAt(0) == 'x')
            str = str.substring(1);
        if (str.length() > 0 && str.charAt(str.length() - 1) == 'x')
            str = str.substring(0, str.length() - 1);
        return str;
    }

    public String startWord(String str, String word) {
        if (str == null || str.equals(""))
            return "";
        if (word == null || word.length() > str.length() || word.equals(""))
            return "";
        if (word.length() == 1)
            return str.charAt(0) + "";
        if (str.substring(1, word.length()).equals(word.substring(1)))
            return str.substring(0, word.length());
        return "";
    }

    public String deFront(String str) {
        if (str == null || str.equals(""))
            return "";
        String start = "";
        if (str.charAt(0) == 'a')
            start += "a";
        if (str.charAt(1) == 'b')
            start += "b";
        return start + str.substring(2);
    }

    public String without2(String str) {
        if (str == null || str.length() == 2)
            return "";
        else if (str.length() <= 1) return str;
        if (str.substring(0, 2).equals(str.substring(str.length()- 2)))
            return str.substring(2);
        else return str;
    }

    public String extraFront(String str) {
        if (str == null || str.equals(""))
            return "";
        int l = Math.min(2, str.length());
        return str.substring(0, l) + str.substring(0, l) +
                str.substring(0, l);
    }

    public String minCat(String a, String b) {
        if (a == null) a = "";
        if (b == null) b = "";
        int length = Math.min(a.length(), b.length());
        return a.substring(a.length() - length) + b.substring(b.length() - length);
    }

    public boolean frontAgain(String str) {
        if (str == null || str.length() < 2)
            return false;
        return str.substring(0, 2).equals(str.substring(str.length() - 2));
    }

    public String seeColor(String str) {
        if (str == null || str.length() < 3)
            return "";
        if (str.startsWith("red"))
            return "red";
        else if (str.startsWith("blue"))
            return "blue";
        else return "";
    }

    public String lastTwo(String str) {
        if (str == null || str.length() < 2)
            return str;
        return str.substring(0, str.length() - 2) + str.charAt(str.length() - 1) +
                str.charAt(str.length() - 2);
    }

    public String conCat(String a, String b) {
        if (a == null) a = "";
        if (b == null) b = "";
        if (a.length() > 0 && b.length() > 0
                && a.charAt(a.length() - 1) == b.charAt(0))
            b = b.substring(1);
        return a + b;
    }

    public String lastChars(String a, String b) {
        String start, end;
        if (a == null || a.length() < 1)
            start = "@";
        else start = a.charAt(0) + "";
        if (b == null || b.length() < 1)
            end = "@";
        else end = b.charAt(b.length() - 1) + "";

        return start + end;
    }

    public String atFirst(String str) {
        if (str == null) return str;
        if (str.length() == 0) return "@@";
        else if (str.length() == 1) return str + "@";
        else return str.substring(0, 2);
    }

    public boolean hasBad(String str) {
        if (str == null || str.length() < 3) return false;
        return str.indexOf("bad") == 0 || str.indexOf("bad") == 1;
    }

    public String middleThree(String str) {
        if (str.length() <= 3) return str;
        int middle = str.length() / 2;
        return str.substring(middle - 1, middle + 2);
    }

    public String twoChar(String str, int index) {
        if (index > str.length() - 2 || index < 0)
            return str.substring(0, 2);
        return str.substring(index, index + 2);
    }

    public String nTwice(String str, int n) {
        return str.substring(0, n) + str.substring(str.length() - n);
    }

    public boolean endsLy(String str) {
        return str.endsWith("ly");
    }

    public String middleTwo(String str) {
        int middle = str.length() / 2;
        return str.substring(middle - 1, middle + 1);
    }

    public String withouEnd2(String str) {
        if (str == null || str.length() < 3) return "";
        else return str.substring(1, str.length() - 1);
    }

    public String theEnd(String str, boolean front) {
        if (str == null || str.length() < 2) return str;
        else return front ? str.charAt(0) + "" : str.charAt(str.length() - 1) + "";
    }

    public String right2(String str) {
        if (str.length() < 3) return str;
        else return str.substring(str.length() - 2) +
                str.substring(0, str.length() - 2);
    }

    public String left2(String str) {
        if (str.length() < 3)
            return str;
        return str.substring(2) + str.substring(0, 2);
    }

    public String nonStart(String a, String b) {
        return a.substring(1) + b.substring(1);
    }

    public String comboString(String a, String b) {
        if (a.length() > b.length()) {
            String temp = b;
            b = a;
            a= temp;
        }

        return a + b + a;
    }

    public String withoutEnd(String str) {
        if (str.length() == 2)
            return "";
        else
            return str.substring(1, str.length() - 1);
    }

    public String firstHalf(String str) {
        return str.substring(0, str.length() / 2);
    }

    public String firstTwo(String str) {
        if (str == null || str.length() < 2)
            return str;
        else
            return str.substring(0, 2);
    }

    public String extraEnd(String str) {
        String substring = str.substring(str.length() - 2);
        return substring + substring + substring;
    }

    public String makeOutWord(String out, String word) {
        return out.substring(0, 2) + word + out.substring(2, 4);
    }

    public String makeTags(String tag, String word) {
        return "<" + tag + ">" + word + "</" + tag + ">";
    }

    public String makeAbba(String a, String b) {
        return a + b + b + a;
    }

    public String helloName(String name) {
        return "Hello " + name + "!";
    }
}
