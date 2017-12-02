package com.company;
/*
7. Cowspeak
The animals are conspiring again. The cows are mooing very strangely and you’re certain of it. Your theory
is that the length of each “MM” sound and the length of the “OO” sound can be translated to hexadecimal
values and then converted to ascii. Create a program to translate cowspeak to English so you can find out
what they’re up to.
Input
The first line will contain a single integer n that indicates the number of data sets that follow. Each data set
will consist of one line containing many space separated strings representing the cows’ moos.
Output
For each test case, output the decoded cowspeak
Sample Input
2
MMMMOOOOOOOOOOOOO MMMMOOOOOOOOOOOOOOO MMMMOOOOOOOOOOOOOOO
MMMMMMOOOOOOOO MMMMMMOOOOOOOOO
Sample Output
MOO
hi
 */
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