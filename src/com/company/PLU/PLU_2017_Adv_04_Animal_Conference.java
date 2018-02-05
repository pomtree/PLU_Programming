package com.company.PLU;

import java.util.Scanner;

/*
4. Animal Conference
Perhaps farming isn’t the healthiest of occupations. You’ve grown suspicious of your animals. Upon
examining them, you’ve noticed that some animals tend to stay oddly close to one another. They’re lik
ely
conferring against you. In order to know which two animals to keep the closest eye on, create a program
that finds the closest two animals to each other.
Input
The first line will contain a single integer
n
that indicates the number of data sets that f
ollow.  Each data set
will start with a single integer
z
denoting how many animals are under examination. The next
z
lines will
consist of two non negative integers
x
and
y
, denoting the x and y coordinate of each animal.
Output
For each test case, output the locations of the two closest animals, sorted by x, and
then
by y in the case of
a tie. If there are two such closest pairs of points, choose the
smallest sorted
pair
, i.e.,
with respect to the
first points x, then first poin
t’s y, then second point’s x, and finally second point’s y.
Sample Input
2
11
90 60
80 30
12 94
13 43
24 40
26 86
30 60
32 63
70 50
60 96
34 20
5
2 0
1 0
0 0
1 1
0 1
Sample Output
30 60 32 63
0 0 0 1
 */
public class PLU_2017_Adv_04_Animal_Conference {
    public static void main(String args[]) {
        Scanner s = new Scanner(System.in);
        for (int dc = s.nextInt(); dc > 0; dc--) {
            int cc = s.nextInt();
            int[][] coords = new int[cc][2];
            for (int grab_count = 0; grab_count < cc; grab_count++) {
                coords[grab_count][0] = s.nextInt();
                coords[grab_count][1] = s.nextInt();
            }
            int bestDistPos[] = {-1, -1};
            double bestDist = Double.MAX_VALUE;
            for (int i1 = 0; i1 < coords.length; i1++) {
                for (int i2 = i1 + 1; i2 < coords.length; i2++) {
                    double d = distance(coords[i1], coords[i2]);
                    if (d < bestDist) {
                        bestDist = d;
                        bestDistPos[0] = i1;
                        bestDistPos[1] = i2;
                    }
                    if (d == bestDist) {
                        if (coords[i1][0] < coords[bestDistPos[0]][0]) {
                            bestDist = d;
                            bestDistPos[0] = i1;
                            bestDistPos[1] = i2;
                        }
                        //else if(coords[i1][0] == coords[bestDistPos[0]][0] && coords[i1][1] < coords[bestDistPos[0]][0])
                    }
                }
            }
            System.out.println(coords[bestDistPos[0]][0] + " " + coords[bestDistPos[0]][1] + " " + coords[bestDistPos[1]][0] + " " + coords[bestDistPos[1]][1]);
        }
    }

    public static double distance(int[] c1, int c2[]) {
        return Math.sqrt((c1[0] - c2[0]) * (c1[0] - c2[0]) + (c1[1] - c2[1]) * (c1[1] - c2[1]));
    }
}
