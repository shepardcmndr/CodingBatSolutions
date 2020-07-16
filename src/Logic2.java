/*
Created by: shepardcmndr
Date: 07.07.2020
Comments:
*/

import java.util.HashSet;
import java.util.Map;

public class Logic2 {
    public static void main(String[] args) {
    }

    public int makeChocolate(int small, int big, int goal) {
        int temp = 0;
        while (big > 0 && temp + 5 <= goal) {
            temp += 5;
            big--;
        }
        if (temp == goal) {
            return 0;
        }
        int count = 0;
        while (small > 0 && temp + 1 <= goal) {
            temp += 1;
            count += 1;
            small--;
        }
        if (temp == goal) {
            return count;
        }
        return -1;
    }

    public boolean evenlySpaced(int a, int b, int c) {
        if (a == b && b == c) {
            return true;
        } else if (a == b || b == c) {
            return false;
        }
        int max = Math.max(a, Math.max(b, c));
        int min = Math.min(a, Math.min(b, c));
        int diff = max - min;
        if (diff % 2 != 0) {
            return false;
        }
        int mid = min + (diff / 2);
        return mid == a || mid == b || mid == c;
    }

    public int blackjack(int a, int b) {
        int aVal = a;
        if (aVal > 21) {
            aVal = 0;
        }
        int bVal = b;
        if (bVal > 21) {
            bVal = 0;
        }

        return Math.max(aVal, bVal);
    }

    public boolean closeFar(int a, int b, int c) {
        if (Math.abs(a - b) <= 1) {
            return Math.abs(a - c) >= 2 && Math.abs(b - c) >= 2;
        } else if (Math.abs(a - c) <= 1) {
            return Math.abs(a - b) >= 2 && Math.abs(c - b) >= 2;
        }
        return false;
    }

    public int roundSum(int a, int b, int c) {
        a = round10(a);
        b = round10(b);
        c = round10(c);
        return a + b + c;
    }

    public int round10(int num) {
        if (num % 10 >= 5) {
            num += 10 - (num % 10);
            return num;
        } else  {
            num -= num % 10;
            return num;
        }
    }

    public int noTeenSum(int a, int b, int c) {
        a = fixTeen(a);
        b = fixTeen(b);
        c = fixTeen(c);
        return a + b + c;
    }

    public int fixTeen(int n) {
        if (n == 15 || n == 16) {
            return n;
        }
        if (n >= 13 && n <= 19) {
            return 0;
        }
        return n;
    }

    public int luckySum(int a, int b, int c) {
        int sum = 0;
        if (a == 13) {
            return sum;
        } else {
            sum += a;
        }
        if (b == 13) {
            return sum;
        } else {
            sum += b;
        }
        if (c == 13) {
            return sum;
        } else {
            sum += c;
        }
        return sum;
    }

    public int loneSum(int a, int b, int c) {
        int sum = 0;
        if (a != b && a != c) {
            sum += a;
        }
        if (b != a && b != c) {
            sum += b;
        }
        if (c != a && c != b) {
            sum += c;
        }
        return sum;
    }

    public boolean makeBricks(int small, int big, int goal) {
        int temp = 0;
        while (big > 0 && temp + 5 <= goal) {
            temp += 5;
            big--;
        }
        if (temp == goal) {
            return true;
        }
        while (small > 0 && temp + 1 <= goal) {
            temp += 1;
            small--;
        }
        return temp == goal;
    }
}
