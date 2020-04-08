package geekbrains.java1.lesson1;

import java.util.Arrays;

public class Homework_2 {
    public static void main(String[] args) {
        int[] jony = {1, 0, 1, 0, 0,1, 1};
        System.out.print (EVA(jony));
    }

    public static String EVA(int[] jony) {

        for (int i = 0; i < jony.length; i++) {
            if (jony[i] != 0) {
                jony[i] = 0;
            } else {
                jony[i] = 1;
            }
        }
        return (Arrays.toString(jony));
    }
}