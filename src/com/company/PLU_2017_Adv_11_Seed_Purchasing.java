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
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int setCount = s.nextInt();
        for (int setNumb = 0; setNumb < setCount; setNumb++) {
            int choiceCount = s.nextInt(); //seed choices
            float budget = s.nextFloat();
            float[][] f = new float[choiceCount][3];
            for (int choiceNumb = 0; choiceNumb < choiceCount; choiceNumb++) {
                f[choiceNumb][0] = s.nextFloat();       //price per bag
                f[choiceNumb][1] = s.nextInt();         //crops per bag
                f[choiceNumb][2] = s.nextFloat();       //income per crop
            }
            while (budget > 0) {
                for (int i = 0; i < choiceCount; i++) {

                }
            }
        }
    }

    public static int getBestDeal(float[][] f, int budget, int bagCount) {
        int bestDealIndex = -1, bestCost = -1;
        for (int i = 0; i < bagCount; i++) {
            if (f[i][0] <= budget) {
                //finish me );
            }

        }
        return bestDealIndex;
    }

}
