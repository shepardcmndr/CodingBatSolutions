/*
Created by: shepardcmndr
Date: 23.07.2020
Comments:
*/

public class String3 {
    public static void main(String[] args) {
        notReplace("is-is");
    }

    public static String notReplace(String str) {
        StringBuilder res = new StringBuilder();
        StringBuilder temp = new StringBuilder();
        for (int i = 0; i < str.length();) {
            while (i < str.length() && Character.isLetter(str.charAt(i))) {
                temp.append(str.charAt(i));
                i++;
            }
            if (temp.toString().equals("is")) {
                res.append("is not");
            } else {
                res.append(temp);
            }
            if (i < str.length()) {
                res.append(str.charAt(i));
            } else {
                return res.toString();
            }
            temp = new StringBuilder();
            i++;
        }
        return res.toString();
    }

    public int sumNumbers(String str) {
        int sum = 0;
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < str.length(); i++) {
            if (Character.isDigit(str.charAt(i))) {
                sb.append(str.charAt(i));
            } else if (sb.length() != 0) {
                sum += Integer.parseInt(sb.toString());
                sb = new StringBuilder();
            }
        }
        if (sb.length() != 0) {
            sum += Integer.parseInt(sb.toString());
        }
        return sum;
    }

    public int maxBlock(String str) {
        if (str.length() < 1) {
            return 0;
        }
        int max = 1;
        int temp = 1;
        char c = str.charAt(0);
        for (int i = 1; i < str.length(); i++) {
            if (c == str.charAt(i)) {
                temp++;
            } else {
                if (temp > max) {
                    max = temp;
                }
                c = str.charAt(i);
                temp = 1;
            }
        }
        if (temp > max) {
            max = temp;
        }
        return max;
    }

    public String mirrorEnds(String string) {
        if (string == null || string.length() == 0) {
            return "";
        }
        if (string.length() == 1) {
            return string;
        }
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < string.length(); i++) {
            if (string.charAt(i) == string.charAt(string.length() - i - 1)) {
                sb.append(string.charAt(i));
            } else {
                return sb.toString();
            }
        }
        return sb.toString();
    }

    public String sameEnds(String string) {
        String res = "";
        for (int i = 0; i <= (string.length() / 2) - 1; i++) {
            String start = string.substring(0, i + 1);
            String end = string.substring(string.length() - i - 1);
            if (start.equals(end)) {
                res = start;
            }
        }
        return res;
    }

    public int sumDigits(String str) {
        int counter = 0;
        for (int i = 0; i < str.length(); i++) {
            if (Character.isDigit(str.charAt(i))) {
                counter += Integer.parseInt(String.valueOf(str.charAt(i)));
            }
        }
        return counter;
    }

    public int countTriple(String str) {
        int counter = 0;
        for (int i = 0; i < str.length() - 2; i++) {
            if (str.charAt(i) == str.charAt(i + 1) &&
                    str.charAt(i) == str.charAt(i + 2)) {
                counter++;
            }
        }
        return counter;
    }

    public boolean gHappy(String str) {
        if (str.equals("")) {
            return true;
        }
        if (str.length() < 2) {
            return false;
        }
        if (str.charAt(0) == 'g' && str.charAt(1) != 'g') {
            return false;
        }
        for (int i = 1; i < str.length() - 1; i++) {
            if (str.charAt(i) == 'g' &&
                    !(str.charAt(i - 1) == 'g' || str.charAt(i + 1) == 'g')) {
                return false;
            }
        }
        if (str.charAt(str.length() - 1) == 'g' && str.charAt(str.length() - 2) != 'g') {
            return false;
        }
        return true;
    }

    public boolean equalIsNot(String str) {
        int isCounter = 0;
        int notCounter = 0;
        for (int i = 0; i < str.length() - 2; i++) {
            if (str.startsWith("is", i)) {
                isCounter++;
                i++;
            } else if (str.startsWith("not", i)) {
                notCounter++;
                i += 2;
            }
        }
        if (str.endsWith("is")) {
            isCounter++;
        }
        return isCounter == notCounter;
    }

    public String withoutString(String base, String remove) {
        return base.replaceAll("(?i)" + remove, "");
    }

    public int countYZ(String str) {
        str = str.toLowerCase();
        int counter = 0;
        for (int i = 0; i < str.length() - 1; i++) {
            if ((str.charAt(i) == 'y' || str.charAt(i) == 'z') &&
                    !Character.isLetter(str.charAt(i + 1))) {
                counter++;
            }
        }
        if (str.charAt(str.length() - 1) == 'y' ||
                str.charAt(str.length() - 1) == 'z') {
            counter++;
        }
        return counter;
    }
}
