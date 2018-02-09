package com.company.Other;

import java.util.Scanner;

/**
 * Created by win8demo on 2/6/2018.
 * made with love
 */
public class Ship {
    public static void main(String args[]) {
        Scanner s = new Scanner(System.in);
        String n1 = s.next();
        String n2 = s.next();
        for (int i = 1; i < n1.length(); i++) {
            for (int j = 1; j < n2.length(); j++) {
                System.out.print((n1.substring(0, i) + n2.substring(j)) + " ");
            }
        }
        System.out.println();
        System.out.println();
        System.out.println();
        for (int i = 0; i < n2.length(); i++) {
            for (int j = 0; j < n1.length(); j++) {
                if (i + j > 2) System.out.print((n2.substring(0, i) + n1.substring(j)) + " ");
            }
        }
    }
}
