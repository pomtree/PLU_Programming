package com.company;

public class ProjectEuler {
    public static void main(String args[]) {
        problem12();
    }
    //public static void problemX() {    }

    public static void problem1() {
        int t = 0;
        for (int i = 0; i < 1000; i++) {
            if (i % 3 == 0 || i % 5 == 0) {
                t += i;
            }
        }
        System.out.println(t);
    }

    public static void problem2() {
        int fs[] = new int[400000];
        fs[0] = 1;
        fs[1] = 2;
        for (int i = 2; i < 400; i++) {
            fs[i] = fs[i - 1] + fs[i - 2];
            System.out.println(fs[i]);
        }
        int t = 0;
        for (int i = 0; fs[i] < 4000000; i++) {
            if (fs[i] % 2 == 0) {
                t += fs[i];
            }
        }
        System.out.println(t);
    }

    public static void problem4() {
        int o = 0;
        for (int n1 = 0; n1 < 1000; n1++) {
            for (int n2 = 0; n2 < 1000; n2++) {
                if (isPalindrome("" + n1 * n2, "" + n1 * n2) && n1 * n2 > o) {
                    o = n1 * n2;

                }
            }
        }
        System.out.println(o);
    }

    public static void problem5() {
        boolean passed = false;
        int tn = 20;
        while (!passed) {
            tn++;
            if (tn % 11 == 0 && tn % 12 == 0 && tn % 13 == 0 && tn % 14 == 0 && tn % 15 == 0 && tn % 16 == 0 && tn % 17 == 0 && tn % 18 == 0 && tn % 19 == 0 && tn % 20 == 0)
                passed = true;
        }
        System.out.println(tn);
    }

    public static void problem6() {
        int n1 = 0, n2 = 0;
        for (int i = 1; i <= 100; i++) {
            n2 += i;
            n1 += i * i;
        }
        System.out.println(n2 * n2 - n1);
    }

    public static void problem7() {
        boolean foundPrime = false;
        int primeCount = 0;
        int count = 0;
        while (!foundPrime) {
            count++;
            if (isPrime(count)) primeCount++;
            if (primeCount == 10002) foundPrime = true;
        }
        System.out.println(count);
    }

    public static void problem10() {
        int t = 0;
        for (int i = 1; i < 2000000; i++) {
            if (isPrime(i)) t += i;
            if (i % 1000 == 0) System.out.println(i);
        }
        System.out.println(t);
    } //failed

    public static void problem11() {
        int g[][] = {{8, 2, 22, 97, 38, 15, 0, 40, 0, 75, 4, 5, 7, 78, 52, 12, 50, 77, 91, 8},
                {49, 49, 99, 40, 17, 81, 18, 57, 60, 87, 17, 40, 98, 43, 69, 48, 4, 56, 62, 0},
                {81, 49, 31, 73, 55, 79, 14, 29, 93, 71, 40, 67, 53, 88, 30, 3, 49, 13, 36, 65},
                {52, 70, 95, 23, 4, 60, 11, 42, 69, 24, 68, 56, 1, 32, 56, 71, 37, 2, 36, 91},
                {22, 31, 16, 71, 51, 67, 63, 89, 41, 92, 36, 54, 22, 40, 40, 28, 66, 33, 13, 80},
                {24, 47, 32, 60, 99, 3, 45, 2, 44, 75, 33, 53, 78, 36, 84, 20, 35, 17, 12, 50},
                {32, 98, 81, 28, 64, 23, 67, 10, 26, 38, 40, 67, 59, 54, 70, 66, 18, 38, 64, 70},
                {67, 26, 20, 68, 2, 62, 12, 20, 95, 63, 94, 39, 63, 8, 40, 91, 66, 49, 94, 21},
                {24, 55, 58, 5, 66, 73, 99, 26, 97, 17, 78, 78, 96, 83, 14, 88, 34, 89, 63, 72},
                {21, 36, 23, 9, 75, 0, 76, 44, 20, 45, 35, 14, 0, 61, 33, 97, 34, 31, 33, 95},
                {78, 17, 53, 28, 22, 75, 31, 67, 15, 94, 3, 80, 4, 62, 16, 14, 9, 53, 56, 92},
                {16, 39, 5, 42, 96, 35, 31, 47, 55, 58, 88, 24, 0, 17, 54, 24, 36, 29, 85, 57},
                {86, 56, 0, 48, 35, 71, 89, 7, 5, 44, 44, 37, 44, 60, 21, 58, 51, 54, 17, 58},
                {19, 80, 81, 68, 5, 94, 47, 69, 28, 73, 92, 13, 86, 52, 17, 77, 4, 89, 55, 40},
                {04, 52, 8, 83, 97, 35, 99, 16, 7, 97, 57, 32, 16, 26, 26, 79, 33, 27, 98, 66},
                {88, 36, 68, 87, 57, 62, 20, 72, 3, 46, 33, 67, 46, 55, 12, 32, 63, 93, 53, 69},
                {04, 42, 16, 73, 38, 25, 39, 11, 24, 94, 72, 18, 8, 46, 29, 32, 40, 62, 76, 36},
                {20, 69, 36, 41, 72, 30, 23, 88, 34, 62, 99, 69, 82, 67, 59, 85, 74, 4, 36, 16},
                {20, 73, 35, 29, 78, 31, 90, 1, 74, 31, 49, 71, 48, 86, 81, 16, 23, 57, 5, 54},
                {01, 70, 54, 71, 83, 51, 54, 69, 16, 92, 33, 48, 61, 43, 52, 1, 89, 19, 67, 48}
        };
        int big = 0;
        for (int r = 0; r < 17; r++) {
            for (int c = 0; c < 20; c++) {
                if (big < g[r][c] * g[r + 1][c] * g[r + 2][c] * g[r + 3][c])
                    big = g[r][c] * g[r + 1][c] * g[r + 2][c] * g[r + 3][c];
            }
        }
        for (int r = 0; r < 20; r++) {
            for (int c = 0; c < 17; c++) {
                if (big < g[r][c] * g[r][c + 1] * g[r][c + 2] * g[r][c + 3])
                    big = g[r][c] * g[r][c + 1] * g[r][c + 2] * g[r][c + 3];
            }
        }
        for (int r = 0; r < 17; r++) {
            for (int c = 0; c < 17; c++) {
                if (big < g[r][c] * g[r + 1][c + 1] * g[r + 2][c + 2] * g[r + 3][c + 3])
                    big = g[r][c] * g[r + 1][c + 1] * g[r + 2][c + 2] * g[r + 3][c + 3];
            }
        }
        for (int r = 3; r < 20; r++) {
            for (int c = 0; c < 17; c++) {
                if (big < g[r][c] * g[r - 1][c + 1] * g[r - 2][c + 2] * g[r - 3][c + 3])
                    big = g[r][c] * g[r - 1][c + 1] * g[r - 2][c + 2] * g[r - 3][c + 3];
            }
        }
        System.out.println(big);

    }

    public static void problem12() {
        boolean found = false;
        int c = 1, cv = -1, cf;
        //System.out.println(countFactors(28));
        while (!found) {
            c++;
            cv = 0;
            //c is the place
            for (int i = 0; i < c; i++) {
                cv += i;
                //if(i == 100)found = true;
            }
            cf = countFactors(cv);
            if (cf > 500) found = true;
        }
        System.out.println(cv);
    }


    //  --basic methods used--

    public static int countFactors(int in) {
        int f = 0;
        for (int i = 1; i <= in; i++) {
            if (in % i == 0) f++;
        }
        return f;
    }

    public static boolean isPrime(int n) {
        for (int i = 2; i < n; i++) {
            if (n % i == 0) return false;
        }
        return true;
    }

    public static boolean isPalindrome(String s1, String s2) {
        if (s1.length() != s2.length()) return false;
        int l = s2.length();
        for (int i = 0; i < s1.length(); i++) {
            if (s1.charAt(i) != s2.charAt(l - i - 1)) return false;
        }
        return true;
    }

}
