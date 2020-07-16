/*
Created by: shepardcmndr
Date: 09.07.2020
Comments:
*/

public class String2 {
    public static void main(String[] args) {
    }

    public String wordEnds(String str, String word) {
        if (str.equals(word)) {
            return "";
        } else if (str.equals(word + word)) {
            return word;
        }
        StringBuilder sb = new StringBuilder();
        if (str.startsWith(word)) {
            while (str.startsWith(word)) {
                str = str.substring(word.length());
            }
            sb.append(str.charAt(0));
        }

        for (int i = 1; i <= str.length() - word.length(); i++) {
            if (str.startsWith(word, i)) {
                sb.append(str.charAt(i - 1));
                if (i + word.length() < str.length()){
                    sb.append(str.charAt(i + word.length()));
                }
             }
        }
        return sb.toString();
    }

    public String plusOut(String str, String word) {
        StringBuilder sb = new StringBuilder();
        for ( int i = 0; i < str.length();) {
            if (i + word.length() <= str.length() && str.startsWith(word, i)) {
                sb.append(word);
                i += word.length();
            } else {
                sb.append("+");
                i++;
            }
        }
        return sb.toString();
    }

    public String starOut(String str) {
        return str.replaceAll(".?\\*+.?", "");
    }

    public String zipZap(String str) {
        StringBuilder sb = new StringBuilder();
        int i = 0;
        while (i < str.length() - 2) {
            if (str.charAt(i) == 'z' && str.charAt(i + 2) == 'p') {
                sb.append(str.charAt(i)).append(str.charAt(i + 2));
                i += 3;
            } else {
                sb.append(str.charAt(i));
                i++;
            }
        }
        sb.append(str.substring(i));
        return sb.toString();
    }

    public String oneTwo(String str) {
        StringBuilder sb = new StringBuilder();
        int i = 0;
        while (i <= str.length() - 3) {
            sb.append(str, i + 1, i + 3).append(str.charAt(i));
            i += 3;
        }
        return sb.toString();
    }

    public boolean sameStarChar(String str) {
        for (int i = 1; i < str.length() - 1; i++) {
            if (str.charAt(i) == '*') {
                if (str.charAt(i - 1) != str.charAt(i + 1)) {
                    return false;
                }
            }
        }
        return true;
    }

    public String getSandwich(String str) {
        if (str.indexOf("bread") == str.lastIndexOf("bread")) {
            return "";
        }
        return str.substring(str.indexOf("bread") + 5, str.lastIndexOf("bread"));
    }

    public boolean xyzMiddle(String str) {
        boolean odd = false;
        int mid = str.length() / 2;
        if (str.length() % 2 != 0) {
             odd = true;
        }
        if (!odd) {
            return str.startsWith("xyz", mid - 1) ||
                    str.startsWith("xyz", mid - 2);
        }
        return str.startsWith("xyz", mid - 1);
    }

    public boolean prefixAgain(String str, int n) {
        String prefix = str.substring(0, n);
        return str.substring(n).contains(prefix);
    }

    public String repeatSeparator(String word, String sep, int count) {
        if (count == 0) {
            return "";
        }
        StringBuilder sb = new StringBuilder(word);
        for (int i = 0; i < count - 1; i++) {
            sb.append(sep).append(word);
        }
        return sb.toString();
    }

    public String repeatFront(String str, int n) {
        StringBuilder sb = new StringBuilder();
        for (int i = n; i > 0; i--) {
            sb.append(str.substring(0, i));
        }
        return sb.toString();
    }

    public String repeatEnd(String str, int n) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < n; i++) {
            sb.append(str.substring(str.length() - n));
        }
        return sb.toString();
    }

    public String mixString(String a, String b) {
        StringBuilder sb = new StringBuilder();
        int i = 0;
        for (; i < a.length(); i++) {
            if (i < b.length()) {
                sb.append(a.charAt(i)).append(b.charAt(i));
            } else {
                sb.append(a.charAt(i));
            }
        }
        if (i < b.length()) {
            sb.append(b.substring(i));
        }
        return sb.toString();
    }

    public boolean xyBalance(String str) {
        if (!str.contains("x") & !str.contains("y")) {
            return true;
        }
        return str.lastIndexOf("y") != -1 &&
                str.lastIndexOf("x") < str.lastIndexOf("y");
    }

    public boolean bobThere(String str) {
        for (int i = 0; i < str.length() - 2; i++) {
            if (str.charAt(i) == 'b' &&
                    str.charAt(i + 2) == 'b') {
                return true;
            }
        }
        return false;
    }

    public boolean xyzThere(String str) {
        if (str.startsWith("xyz")) {
            return true;
        }
        for (int i = 1; i < str.length() - 2; i++) {
            if (str.charAt(i - 1) != '.' &&
                    str.startsWith("xyz", i)) {
                return true;
            }
        }
        return false;
    }

    public boolean endOther(String a, String b) {
        a = a.toLowerCase();
        b = b.toLowerCase();
        return a.endsWith(b) || b.endsWith(a);
    }

    public int countCode(String str) {
        int count = 0;
        for (int i = 0; i < str.length() - 3; i++) {
            if (str.startsWith("co", i) &&
                    str.charAt(i + 3) == 'e') {
                count++;
            }
        }
        return count;
    }

    public boolean catDog(String str) {
        int countCat = 0;
        int countDog = 0;

        for (int i = 0; i < (str.length() - 2); i++) {
            String substring = str.substring(i, i + 3);
            if (substring.equals("cat")) {
                countCat++;
            }
            if (substring.equals("dog")) {
                countDog++;
            }
        }

        return countCat ==countDog;
    }

    public int countHi(String str) {
        int count = 0;
        int index = 0;
        while (index != -1) {
            index = str.indexOf("hi", index);
            if (index != -1) {
                count++;
                index += 2;
            }
        }
        return count;
    }

    public String doubleChar(String str) {
        StringBuilder sb = new StringBuilder();
        for (char c : str.toCharArray()) {
            sb.append(c).append(c);
        }
        return sb.toString();
    }

}
