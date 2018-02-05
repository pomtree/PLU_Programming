package com.company.PLU;

import java.util.Scanner;

/*
2. Bunnies
You’re going to raise farm animals and you decided to start with
bunnies, the easiest of animals.
To your
surprise they are breeding l
ike rabbits, s
o much so that you’re unable to count them accurately. However,
you know that rabbits’ breeding patterns always follow the Fibonacci sequence. The Fibonacci sequence is
defined as follows:
F(0) = 1, F(1) = 1, F(N) = F(N
-
1)+F(N
-
2)
Given the nu
mber of months the rabbits have been breeding, use the Fibonacci sequence to determine the
number of rabbits you should have.
Input
The first line will contain a single integer
n
that indicates the number of data sets that follow.  Each data set
will start with a single integer
x
denoting the number of months that have passed since you bought your
initial pair of rabbits. 0<=x<=45
Output
For each test case, output the expected nu
mber of rabbits after
x
months.
Sample Input
3
0
5
45
Sample Output
1
8
1836311903
 */
public class PLU_2017_Adv_02_Bunnies {
    public static void main(String args[]) {
        Scanner s = new Scanner(System.in);
        int dc = s.nextInt();
        for (int cc = 0; cc < dc; cc++) {
            System.out.println(fs(s.nextInt()));
        }
    }

    public static int fs(int month) {
        int[] fs = new int[46];
        fs[0] = 1;
        fs[1] = 1;
        for (int i = 2; i < fs.length; i++) {
            fs[i] = fs[i - 1] + fs[i - 2];
            //System.out.println(fs[i]);
        }
        return fs[month];
    }
}
