package com.company;

import java.util.Scanner;

/*
code by Tom Pree, problem by PLU.
        10. Square Pen
        You want to create a huge square pen for your animals in one of your fields. That way they can enjoy the
        sunlight instead of staying pent up in their dusty barn all year. Your field is still messy though. You don’t
        want to clean it, you just want to build the biggest possible square pen without any junk in it. Given the
        layout of your field, determine the area of the largest square pen you can make.
        Input
        The first line will contain a single integer n that indicates the number of data sets that follow. Each data set
        will start with a single integer s denoting the side length of your square field. The next s lines will consist
        of the layout of your field, with “#” denoting an obstacle, and ‘.’ denoting a free space.
        Output
        For each test case, output the area of the largest square pen you can make without it having any obstacles
        inside of it.
        Sample Input
        2
        5
        ...##
        ##...
        .....
        #....
        #..##
        6
        ...##.
        ##..##
        ..###.
        #.....
        #..##.
        ..##..
        Sample Output
        9
        4


 */
public class PLU_2017_Adv_10_Square_Pen {
    public static void main(String args[]) {
        Scanner s = new Scanner(System.in);
        int dataCount = s.nextInt();
        char[][] in;
        int biggestBox[] = new int[dataCount];
        for (int dataLoop = 0; dataLoop < dataCount; dataLoop++) {

            int penSize = s.nextInt();

            in = new char[penSize][penSize];
            for (int line = 0; line < penSize; line++) {
                String l = s.next();

                for (int cn = 0; cn < penSize; cn++) {
                    in[line][cn] = l.charAt(cn);
                }
            }
            int boxCounter;
            biggestBox[dataLoop] = -1;
            for (int line = 0; line < penSize; line++) {
                for (int ch = 0; ch < penSize; ch++) {
                    boxCounter = -1;
                    while (true) {
                        if (isGoodBox(in, line, ch, boxCounter, penSize)) {
                            boxCounter++;
                            //System.out.println("!");
                        } else {
                            break;
                        }
                    }
                    if (boxCounter > biggestBox[dataLoop]) {
                        biggestBox[dataLoop] = boxCounter;
                    }
                }
            }

        }
        for (int i = 0; i < dataCount; i++) {
            System.out.println(biggestBox[i] * biggestBox[i]);
        }
    }

    public static boolean isGoodBox(char[][] in, int sRow, int sCol, int size, int gs) {

        if (sCol + size < gs && sRow + size < gs) {
            size++;
            StringBuilder s = new StringBuilder();
            for (int r = sRow; r < sRow + size; r++) {
                for (int c = sCol; c < sCol + size; c++) {
                    s.append(in[c][r]);
                }
            }
            if (!s.toString().contains("#")) {
                return true;
            }
        }
        return false;
    }
}
