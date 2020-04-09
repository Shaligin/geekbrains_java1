package geekbrains.java1.lesson1;

import java.util.Arrays;

public class Homework_2 {
    public static void main(String[] args) {
        int jony[] = {1, 0, 1, 0, 0, 1, 1};
        //EVA(jony);
        //System.out.println(EVA(jony));  //в задание не сказанно возвратить в консоль, но мне хотелось посмотреть работу метода
        //NIKA();
        //System.out.println(NIKA());

        //int lucas[] = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        //System.out.println(POLLY(lucas));
        int diego[] = {3, 6, -18, 100};
        //SARA(diego);
        System.out.println(SARA(diego));

    }


    public static String EVA(int[] jony) {
        for (int i = 0; i < jony.length; i++) {
            jony[i] = jony[i] != 0 ? 0 : 1;

//            if (jony[i] != 0) {
//                jony[i] = 0;
//            } else {
//                jony[i] = 1;
//            }
        }
        return (Arrays.toString(jony));
    }


    public static String NIKA() {
        int[] sam = new int[8];
        for (int i = 0; i < sam.length; i++) {
            sam[i] = (i * 3) + 1;
        }
        return (Arrays.toString(sam));
    }

    public static String POLLY(int[] lucas) {
        for (int i = 0; i < lucas.length; i++) {
            lucas[i] = lucas[i] > 6 ? lucas[i] * 2 : lucas[i];
        }
        return (Arrays.toString(lucas));
    }

//    public static void SARA(int[]diego){
//
//        for (int i = 0; i < diego.length; i++) {
//
//            }
//        }

    public static String SARA(int[] diego) {
        {
            int max = diego[0];
            for (int i = 0; i < diego.length; i++) {
                max = max < diego[i] ? diego[i] : max;
//                if (diego[0] < diego[i])
//                    diego[0] = diego[i];
            }
            return (max);
            //System.out.println("максимальное число в массиве" + " " + max);
        }
    }
}
