/*
Created by: shepardcmndr
Date: 03.07.2020
Comments:
*/

public class Logic1 {
    public static void main(String[] args) {
    }

    public int sumLimit(int a, int b) {
        int sum = a + b;
        if (String.valueOf(sum).length() == String.valueOf(a).length())
            return sum;
        return a;
    }

    public boolean shareDigit(int a, int b) {
        int a0 = a / 10;
        int a1 = a % 10;
        int b0 = b / 10;
        int b1 = b % 10;

        return a0 == b0 || a0 == b1 || a1 == b0 || a1 == b1;
    }

    public int blueTicket(int a, int b, int c) {
        int ab = a + b;
        int bc = b + c;
        int ac = c + a;
        if (ab == 10 || bc == 10 || ac == 10)
            return 10;
        if (ab - bc == 10 || ab - ac == 10)
            return 5;
        return 0;
    }

    public int greenTicket(int a, int b, int c) {
        if (a == b || b == c || c == a) {
            if (a == b & b == c)
                return 20;
            else
                return 10;
        }
        return 0;
    }

    public int redTicket(int a, int b, int c) {
        if (a == b && a == c) {
            if (a == 2)
                return 10;
            else
                return 5;
        }
        if (b != a && c != a)
            return 1;
        return 0;
    }

    public int maxMod5(int a, int b) {
        if (a == b)
            return 0;
        if (a % 5 == b % 5)
            return Math.min(a, b);
        return Math.max(a, b);
    }

    public int withoutDoubles(int die1, int die2, boolean noDoubles) {
        int res = die1 + die2;
        if (noDoubles && die1 == die2) {
            return res + 1;
        }
        return res;
    }

    public boolean lessBy10(int a, int b, int c) {
        return Math.abs(a - b) >= 10 ||
                Math.abs(b - c) >= 10 ||
                Math.abs(c - a) >= 10;
    }

    public boolean lastDigit(int a, int b, int c) {
        return a % 10 == b % 10 ||
                b % 10 == c % 10 ||
                c % 10 == a % 10;
    }

    public boolean inOrderEqual(int a, int b, int c, boolean equalOk) {
        if (equalOk)
            return a <= b && b <= c;
        else
            return a < b && b < c;
    }

    public boolean inOrder(int a, int b, int c, boolean bOk) {
        return (bOk || a < b) && b < c;
    }

    public boolean twoAsOne(int a, int b, int c) {
        return a + b == c ||
                b + c == a ||
                c + a == b;
    }

    public String fizzString2(int n) {
        String res = "";
        if (n % 3 == 0)
            res += "Fizz";
        if (n % 5 == 0)
            res += "Buzz";
        if (!res.equals(""))
            return res + "!";
        else
            return n + "!";
    }

    public String fizzString(String str) {
        String res = "";
        if (str.startsWith("f"))
            res += "Fizz";
        if (str.endsWith("b"))
            res += "Buzz";
        return !res.equals("") ? res : str;
    }

    public int teaParty(int tea, int candy) {
        if (tea < 5 || candy < 5)
            return 0;
        else {
            int max = Math.max(tea, candy);
            int min = Math.min(tea, candy);
            if (max / min >= 2)
                return 2;
            else
                return 1;
        }
    }

    public boolean answerCell(boolean isMorning, boolean isMom, boolean isAsleep) {
        if (isAsleep)
            return false;
        else if (isMorning)
            return isMom;
        else
            return true;
    }

    public int teenSum(int a, int b) {
        if ((a <= 19 && a >= 13) || (b <= 19 && b >= 13))
            return 19;
        else
            return a + b;
    }

    public boolean nearTen(int num) {
        return num % 10 <= 2 || num % 10 >= 8;
    }

    public boolean less20(int n) {
        return n % 20 == 18 || n % 20 == 19;
    }

    public boolean old35(int n) {
        boolean three = n % 3 == 0;
        boolean five = n % 5 == 0;

        return three ^ five;
    }

    public boolean more20(int n) {
        return n % 20 == 1 || n % 20 == 2;
    }

    public boolean specialEleven(int n) {
        return (n % 11 == 0) || (n % 11 == 1);
    }

    public boolean in1To10(int n, boolean outsideMode) {
        if (!outsideMode)
            return n >= 1 && n <= 10;
        else
            return n <= 1 || n >= 10;
    }

    public boolean love6(int a, int b) {
        if (a == 6 || b == 6)
            return true;
        else if (Math.abs(a - b) == 6)
            return true;
        else return (a + b) == 6;
    }

    public String alarmClock(int day, boolean vacation) {
        if (vacation) {
            if (day > 0 && day < 6)
                return "10:00";
            else
                return "off";
        } else {
            if (day > 0 && day < 6)
                return "7:00";
            else
                return "10:00";
        }
    }

    public int sortaSum(int a, int b) {
        int sum = a + b;
        if (sum <= 19 && sum >= 10)
            return 20;
        else
            return sum;
    }

    public int caughtSpeeding(int speed, boolean isBirthday) {
        int noTicket = 60;
        if (isBirthday)
            noTicket += 5;
        if (speed <= noTicket)
            return 0;
        else if (speed <= noTicket + 20)
            return 1;
        else
            return 2;
    }

    public boolean squirrelPlay(int temp, boolean isSummer) {
        if (isSummer)
            return temp <= 100 && temp >= 60;
        else
            return temp <= 90 && temp >= 60;
    }

    public int dateFashion(int you, int date) {
        if (you <= 2 || date <= 2)
            return 0;
        else if (you >= 8 || date >= 8)
            return 2;
        else
            return 1;
    }

    public boolean cigarParty(int cigars, boolean isWeekend) {
        if (isWeekend)
            return cigars >= 40;
        else
            return cigars >= 40 && cigars <= 60;
    }
}
