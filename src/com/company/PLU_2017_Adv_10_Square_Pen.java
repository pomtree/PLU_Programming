package com.company;

import java.util.Scanner;

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
            System.out.println(biggestBox[i]*biggestBox[i]);
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
