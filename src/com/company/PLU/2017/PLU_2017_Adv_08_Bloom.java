package com.company.PLU;

import java.util.Scanner;

/**
 * Created by win8demo on 2/4/2018.
 * made with love
 * 8. Bloom
 * Your garden is coming along very nicely, and you’ve grown curious as to when all of your different plants
 * will be blooming. In order to ease your curiosity, you’ve pulled the seed bags out of the trash and found
 * each plants’ growth cycle on the back of their bag. Given the growth cycle of everything you planted,
 * determine how many plants will be blooming on each day.
 * Plants grow in different stages, and a plant’s growth cycle is simply a list of how many days each of these
 * stages take to complete. For example, a plant with a growth cycle of 1 2 4 3 5 would bloom on day 15.
 * Note, the first number in the list is stage 0 (zero).
 * One added complication is that some plants can be harvested more than once. For example, a plant with a
 * growth cycle of 1 2 4 3 5 that returns to stage 2 after harvest would bloom on days 15, 27, 39, and so on.
 * Input
 * The first line will contain a single integer n that indicates the number of data sets that follow. Each data set
 * will start with a single integer x denoting how many plants there are. The next x lines will each consist of
 * one plant’s growth cycle, denoted by an unknown number of integers. The last integer on each line will
 * represent which stage in growth a plant returns to after blooming, or will be negative one if the plant can
 * only be harvested once. The final line of each test case will consist of one integer, representing the day in
 * question.
 * Output
 * For each test case, output the number of plants blooming on the given day.
 * Sample Input
 * 2
 * 3
 * 1 2 3 4 5 0
 * 1 2 3 2
 * 5 5 5 5 5 5 -1
 * 30
 * 3
 * 1 2 3 4 5 0
 * 1 2 3 2
 * 5 5 5 5 5 5 -1
 * 15
 * Sample Output
 * 3
 * 2
 */
public class PLU_2017_Adv_08_Bloom {
    public static void main(String args[]) {
        Scanner s = new Scanner(System.in);
        int dataSets = s.nextInt();
        for (int dataSet = 0; dataSet < dataSets; dataSet++) {

        }
    }
}
