package com.company;

/*
code by Tom Pree, problem by PLU.
               11. Seed Purchasing
               The new season has begun, and it is time to purchase all new seeds. But there are so many choices! And so
               many variables. Every bag of seeds costs a certain amount, and each bag also produces a certain number of
               crops, which each sells for a certain amount of money. It’s awful to keep track of, and you simply can’t do
               all the math in your head. Create a program to determine the maximum amount of money you can earn on
               crops this year given the amount you have available to spend on seeds.
               Input
               The first line will contain a single integer n that indicates the number of data sets that follow. Each data set
               will start with a single integer x denoting how many different seed choices there are, followed by a floating
               point number y denoting how much you have to spend. The next x lines will consist of a floating point
               number c, an integer m, and a floating point number p, representing the cost of each bag, the number of
               crops it produces, and the selling price of each crop the bag produces. The store has an unlimited supply of
               each variety of seeds.
               Output
               For each test case, output the maximum amount of money you can make selling crops this season. Do not
               include the change from your seed purchases in the answer.
               Sample Input
               1
               4 15.00
               2.00 7 1.00
               1.00 4 1.00
               11.00 10 5.00
               5.00 1 5.00
               Sample Output
               $51.00
 */

import java.util.Scanner;

public class PLU_2017_Adv_11_Seed_Purchasing {
    public static void main(String args[]) {
        Scanner s = new Scanner(System.in);
        int dataSets = s.nextInt();
        float out[] = new float[dataSets];
        for (int dsc = 0; dsc < dataSets; dsc++) {
            int seedChoices = s.nextInt();
            float budget = s.nextFloat(), ib = budget;
            float[][] seeds = new float[seedChoices][4];
            for (int scs = 0; scs < seedChoices; scs++) {
                seeds[scs][0] = s.nextFloat();                                      //price per bag
                seeds[scs][1] = s.nextInt();                                        //crops per bag
                seeds[scs][2] = s.nextFloat();                                      //price per crop
                seeds[scs][3] = (seeds[scs][1] * seeds[scs][2]) / seeds[scs][0];    //best-ratio score
            }
            int income = 0;
            while (budget > 0) {
                if (getBestDeal(seeds, budget) == -1) {
                    budget = 0;

                } else {
                    float[] best = seeds[getBestDeal(seeds, budget)];
                    budget -= best[0];
                    income += best[1] * best[2];

                }

            }
            out[dsc] = income - ib;
        }
        for (int i = 0; i < dataSets; i++) {
            System.out.println(out[i]);
        }
    }

    private static int getBestDeal(float[][] f, float budget) {
        float br = 0;
        int brAt = -1;
        for (int i = 0; i < f.length; i++) {
            if (budget >= f[i][0] && br < f[i][3]) {
                br = f[i][3];
                brAt = i;

            }
        }
        return brAt;
    }

}
