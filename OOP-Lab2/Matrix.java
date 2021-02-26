/*
 * Lab2.java 1.0 12 Feb 2019
 *
 * Copyright (c) 2019 Jack Shendrikov. All Rights Reserved.
 */

import java.util.InputMismatchException;
import java.util.Scanner;


final public class Matrix {
    private int row;
    private int column;
    private short[][] data;
    
    public Matrix(int M, int N) {
        this.row = M;
        this.column = N;
        data = new short[M][N];
    }
    
    public Matrix(short[][] data) {
        row = data.length;
        column = data[0].length;
        this.data = new short[row][column];
        for (int i = 0; i < row; i++)
            System.arraycopy(data[i], 0, this.data[i], 0, column);
    }

    public static Matrix random(int M, int N) {
        Matrix A = new Matrix(M, N);
        for (int i = 0; i < M; i++)
            for (int j = 0; j < N; j++)
                A.data[i][j] = (short) (Math.random()*10);
        return A;
    }
    
    public Matrix plus(Matrix B) {
        Matrix A = this;
        if (B.row != A.row || B.column != A.column)
            System.out.println("\tIt is impossible to add matrices of not the same size!");
        Matrix C = new Matrix(row, column);
        for (int i = 0; i < row; i++)
            for (int j = 0; j < column; j++)
                C.data[i][j] = (short) (A.data[i][j] + B.data[i][j]);
        return C;
    }

    public void average(){
        int d = 0;
        for (int i = 0; i < row; i++)
            for (int j = 0; j < column ; j++)
                d += data[i][j];
        float avrg = (float) d/(row*column);
        System.out.println("\tThe arithmetic mean of the elements of the matrix: " + avrg);
    }
    
    public void output() {
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < column; j++)
                System.out.printf("%-5d ", data[i][j]);
            System.out.println();
        }
    }


    public static void main(String[] args) {

        String dimension;

        Scanner in = new Scanner(System.in);
        System.out.print("Do you want to enter the dimension of the matrix (yes/no)? ");
        dimension = in.nextLine();

        switch (dimension.toLowerCase()) {
            case "yes":
                try {
                    short m, n;
                    System.out.print("Enter the number of rows and columns of matrix A (separated by a space): ");
                    m = in.nextShort();
                    n = in.nextShort();
                    if ((m < 0 | m > 15) | (n < 0 | n > 15)) {
                        System.out.println("\tThe dimension of the matrix cannot be less than 0 or more than 15!");
                        break;
                    } else {
                        Matrix A = Matrix.random(m, n);
                        System.out.println("Matrix А:");
                        A.output();
                        System.out.println();

                        Matrix B = Matrix.random(m, n);
                        System.out.println("Matrix B:");
                        B.output();
                        System.out.println();

                        System.out.println("Matrix C (A+B):");
                        A.plus(B).output();
                        System.out.println();

                        A.plus(B).average();
                        break;
                    }

                } catch (Exception exc) {
                    if (exc instanceof InputMismatchException) {
                        System.out.println("\tEnter data of type short!");
                        break;
                    } else {
                        System.out.println("\tUnexpected error!");
                        break;
                    }
                }
            case "no":
                Matrix A = Matrix.random(5, 5);
                Matrix B = Matrix.random(5,5);
                Matrix C = A.plus(B);

                System.out.println(new String(new char[52]).replace("\0", "—"));
                System.out.println("⎜         Matrix А           ⎜          Matrix В          ⎜         Matrix С (A+B)      ⎜");
                System.out.println(new String(new char[52]).replace("\0", "—"));

                for (int i = 0; i < A.row; i++) {
                    System.out.print("⎜   ");
                    for (int j=0; j<A.column; j++) {
                        System.out.printf("%-5d", A.data[i][j]);
                    }
                    System.out.print("⎜   ");
                    for (int  j=0; j<B.column; j++) {
                        System.out.printf("%-5d", B.data[i][j]);
                    }
                    System.out.print("⎜   ");
                    for (int j=0; j<C.column; j++) {
                        System.out.printf("%-5d", C.data[i][j]);
                    }
                    System.out.println(" ⎜");
                }

                System.out.println(new String(new char[52]).replace("\0", "—")+ "\n");
                C.average();
                break;
            default:
                System.out.println("\tUnexpected error!");
                break;
        }
    }
}