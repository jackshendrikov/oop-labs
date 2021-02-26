/*
 * Lab3.java 1.0 12 Feb 2019
 *
 * Copyright (c) 2019 Jack Shendrikov. All Rights Reserved.
 */

public class Lab3 {

    public static boolean isAlpha(char c) {
        return (c >= 'A' && c <= 'Z') || (c >= 'a' && c <= 'z');
    }

    public static void main(String[] args){
        StringBuffer str = new StringBuffer("Lmormem impsmum drolor tstit tatmet, tat melmecmtram ceonevenire lmlel.");
        int pos = 0;
        for (int i = pos; i < str.length(); i++)
            if (!isAlpha(str.charAt(i)) || i == (str.length() - 1))
                for (int j = pos; j < i - 1 ; j++) {
                    char deletingChar = str.charAt(i - 1);
                    if (i == (str.length() - 1) && isAlpha(str.charAt(i)))
                        deletingChar = str.charAt(i);
                    if (str.charAt(j) == deletingChar){
                        str.deleteCharAt(j);
                        j--;
                        i--;
                    }
                    pos = i;
                }
        System.out.println(str);
    }
}
