package com.company.PLU;

import java.util.Scanner;

/*
6. Seed Bags
Looking at the space you’ve allotted
for your garden, you begin to wonder how many bags of seeds you’ll
need to buy in order to fill it. It’s a little complicated though, as you plant seeds in a unique way. To plant
your seeds, you simply throw the bag in the air, and the seeds land around yo
u in a 3x3 square. Given the
layout of your garden, and in which areas you would like crops to grow, determine how many bags of
s
eeds are required. If some seeds
land where you don’t want them to grow, no worries. You just won’t
water those. It’s also acce
ptable for an area to be overlapped with multiple bags of seeds.
Input
The first line will contain a single integer
n
that indicates the number of data sets that follow.  Each data set
will start with a single integer s(1<=s<=8) denoting the side length o
f your square garden. The next
s
lines will represent the layout of your garden. A ‘.’ will represent a spot that does not need to be seeded,
while an ‘x’ will represent an area which you want to plant seeds in.
Output
For each test case, output the minim
um number of seed bags you need to plant your garden.
Sample Input
2
5
xxxxx
.....
xxxxx
.....
xxxxx
8
.x.xx.x.
x..x..xx
..x.xx.x
.x.x...x
..xx...x
x.x..x.x
..x..x..
.x..x...
Sample Output
4
7
 */
public class PLU_2017_Adv_06_Seed_Bags {
    public static void main(String args[]) {
        Scanner s = new Scanner(System.in);
        for (int dc = s.nextInt(); dc > 0; dc--) {
            int size = s.nextInt() + 1;
            char garden[][] = new char[size][size];
            for (int i = 0; i < size; i++) {
                String line = s.nextLine();
                for (int c = 0; c < line.length(); c++) {
                    garden[i][c] = line.charAt(c);
                }
            }
            int count;
            for (count = 0; containsx(garden); count++) {
                int[] bestPos = {-1, -1};
                int mostFilled = -1;
                for (int i = 0; i < garden.length; i++) {
                    for (int j = 0; j < garden.length; j++) {
                        int cc = 0;
                        for (int ii = -1; ii <= 1; ii++)
                            for (int jj = -1; jj <= 1; jj++)
                                if (i + ii < garden.length && i + ii >= 0 && j + jj < garden.length && j + jj >= 0 && garden[i + ii][j + jj] == 'x')
                                    cc++;
                        //System.out.println(i + " " + j + " " + cc);
                        if (cc > mostFilled) {
                            bestPos = new int[]{i, j};
                            mostFilled = cc;

                        }

                    }

                }
                int i = bestPos[0], j = bestPos[1];
                for (int ii = -1; ii <= 1; ii++)
                    for (int jj = -1; jj <= 1; jj++)
                        if (i + ii < garden.length && i + ii >= 0 && j + jj < garden.length && j + jj >= 0 && garden[i + ii][j + jj] == 'x')
                            garden[i + ii][j + jj] = '.';
            }
            System.out.println(count);
        }
    }

    public static boolean containsx(char[][] g) {
        for (int i = 0; i < g.length; i++) {
            for (int j = 0; j < g.length; j++) {
                if (g[i][j] == 'x') return true;
            }
        }
        return false;
    }

    public static void printg(char[][] garden) {
        for (int i = 0; i < garden.length; i++) {
            for (int j = 0; j < garden.length; j++) {
                System.out.print(garden[i][j]);
            }
            System.out.println();
        }
    }
}
