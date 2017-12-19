package com.company;

public class AmazonChallenge {
    public static void main(String args[]) {
        c2o(new int[][]{{-2, -4}, {3, 2}, {3, -5}, {0, -2}, {-2, -3}, {-1, 0}}, 2);
    }

    public static void c2o(int[][] in, int k) {
        for (int i = 0; i < k; i++) {
            int ri = 0;
            for (int j = 0; j < in.length; j++) {
                if (in[ri][0]*in[ri][0] + in[ri][1]*in[ri][1] > in[j][0]*in[j][0] + in[j][1]*in[j][1] ) {
                    ri = j;
                }
            }
            System.out.println("(" + in[ri][0] + "," + in[ri][1] + ")");
            in[ri][0] = 999;

        }
    }
}