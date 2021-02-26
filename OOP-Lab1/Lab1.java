/*
 * Lab1.java 1.0 12 Feb 2019
 *
 * Copyright (c) 2019 Jack Shendrikov. All Rights Reserved.
 */

import java.util.InputMismatchException;
import java.util.Scanner;


public class Lab1 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int  i ,j, n, m, a, b;
        while(true) {
            try {
                System.out.print ("\tEnter the lower bound of a: ");
                a = scanner.nextInt();

                System.out.print("\tEnter the upper bound of n: ");
                n = scanner.nextInt();

                System.out.print("\tEnter the lower bound of b: ");
                b = scanner.nextInt();

                System.out.print("\tEnter the upper bound of m: ");
                m = scanner.nextInt();

                if ((a <= n) && (b <= m)) {
                    if (!(a<=1 && n>=1)) {
                        float res = 0;
                        for (i = a; i <= n; i++) {
                            for (j = b; j <= m; j++)
                                res += (float) (i % j) / (i - 1);
                        }
                        System.out.println("\tResult = " + res);
                        break;
                    } else {
                            System.out.println("\n!!! Division by 0 !!!\n");
                        }
                } else System.out.println("\n!!! Error within specified limits !!!\n");
            } catch (Exception exc) {
                if (exc instanceof InputMismatchException) {
                    System.out.println("\n!!! Enter data of type int !!!\n");
                    scanner.next();
                } else {
                    System.out.println("\n!!! Unexpected error !!!\n");
                }
            }
        }
    }
}
