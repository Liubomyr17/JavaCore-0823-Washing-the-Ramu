package com.company;

/*
0823 Washing the Frames
Write a program that enters a line of text from the keyboard.
The program replaces the first letters of all words with capital letters in the text.
Display the result on the screen.
Input Example:
mom washed the frame.
Output Example:
Mom Soaps Ramu.

Requirements:
1. The program should display the text on the screen.
2. The program should read a line from the keyboard.
3. The Solution class must contain one method.
4. The program should replace in the text the first letters of all words with capital letters.
 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.file.attribute.AclFileAttributeView;
import java.util.*;


public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String s = reader.readLine();
        char[] t = s.toCharArray();
        t[0]= Character.toUpperCase(t[0]);
        for (int i = 1; i < t.length ; i++) {
            if (t[i-1]==' ')
                t[i]=Character.toUpperCase(t[i]);
        }
        System.out.println(t);

    }
}



