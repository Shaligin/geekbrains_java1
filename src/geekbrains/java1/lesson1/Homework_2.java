package geekbrains.java1.lesson1;

import java.util.Arrays;

public class Homework_2 {
    public static void main(String[] args) {
        int jony[] = {1, 0, 1, 0, 0, 1, 1};
        //EVA(jony);
        System.out.println(EVA(jony));  //в задание не сказанно возвратить в консоль, но мне хотелось посмотреть работу метода
        //NIKA();
        //System.out.println(NIKA());
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


//    public static String NIKA() {
//        int[] sam = new int[8];
//        for (int i = 0; i < sam.length; i++) {
//            sam[i] = (i * 3) + 1;
//        }
//        return (Arrays.toString(sam));
//    }


}
