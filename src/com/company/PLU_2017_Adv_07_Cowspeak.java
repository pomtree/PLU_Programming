package com.company;

import java.util.Scanner;

public class PLU_2017_Adv_07_Cowspeak {
    public static void main(String args[]) {
        Scanner s = new Scanner(System.in);
        int dc = s.nextInt();
        String out[] = new String[dc];
        System.out.println();
        for(int i = 0; i < dc; i++) {
            String line = s.nextLine();
            line = s.nextLine();
            String spl[] = line.split(" ");
            for(int word = 0; word < spl.length; word++) {
                int m = 0, o = 0;
                while (spl[word].contains("M")) {
                    m++;
                    spl[word] = spl[word].substring(1);
                    System.out.println(spl[word]);
                }
                while (spl[word].contains("O")) {
                    o++;
                    spl[word] = spl[word].substring(1);
                    System.out.println(spl[word]);
                }
               // m/=2;
               // o/=2;
                //System.out.println((char)(m*16+o));
                //System.out.println((m+ " m o " + o));
                //System.out.println((m*16+o));
                out[i] += (char)(m*16+o);
            }
        }
        for(int i = 0; i < dc; i++) {
            System.out.println(out[i]);
        }
    }
}
//131249