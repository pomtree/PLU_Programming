package com.company.PLU;

import java.util.Scanner;

/*
5. Scarecrows
After having your field picked
apart by crows time and time again, you’ve decided to employ a system of
scarecrows. In order to determine how effective your scarecrow network is, and which areas need more
protection, create a graph to display which areas of the field are protected. Each
of your scarecrows has a
unique range in which it works. Any location within P distance from a scarecrow with a range of P will be
protected.
Input
The first line will contain a single integer
n
that indicates the number of data sets that follow.  Each data set
will start with a single integer
w
,
h
, and
q
, denoting the width and height of your field, and the number of
scarecrows you have. the next
q
lines consist of 3 space separated integers,
r
,
c
, and
p
, representing the
horizontal and vertical position of each scarecrow and its range. 0<=r<h, 0<=c<w
Output
For each test case, output h lines of w characters each, where character w of line h is an ‘*’ if point (w,h) is
protected, an ‘x’ if it i
s a scarecrow, and a ‘.’ Otherwise. Leave a blank line between test cases.
Sample Input
2
5 5 1
2 2 2
5 5 2
1 1 1
3 3 1
Sample Output
..*..
.***.
**x**
.***.
..*..
.*...
*x*..
.*.*.
..*x*
...*.
 */
public class PLU_2017_Adv_05_Scarecrows {
    public static void main(String args[]) {
        Scanner s = new Scanner(System.in);
        for (int testCase = s.nextInt(); testCase > 0; testCase--) {
            char map[][] = new char[s.nextInt()][s.nextInt()];
            for (int i = 0; i < map.length; i++) for (int j = 0; j < map[i].length; j++) map[i][j] = '.';
            for (int crow = s.nextInt(); crow > 0; crow--) {
                int cx = s.nextInt();
                int cy = s.nextInt();
                map[cy][cx] = 'X';
                int range = s.nextInt();
                for (int i = 0; i < map.length; i++) {
                    for (int j = 0; j < map[i].length; j++) {
                        if ((i != cy || j != cx) && Math.abs(i - cy) + Math.abs(j - cx) <= range && map[i][j] != 'X') {
                            map[i][j] = '*';
                        }
                    }
                }
            }
            for (int i = 0; i < map.length; i++) {
                for (int j = 0; j < map[i].length; j++) {
                    System.out.print(map[i][j]);
                }
                System.out.println();
            }
        }
    }
}
