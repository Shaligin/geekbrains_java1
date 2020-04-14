package geekbrains.java1.lesson1;

import java.util.Arrays;

public class Homework_2 {
    public static void main(String[] args) {
        int jony[] = {1, 1, 1, 0, 0, 1, 1};
        //System.out.println(EVA(jony));  //в задание не сказанно возвратить в консоль, но мне хотелось посмотреть работу метода
        EVA(jony);

        int[] sam = new int[8];
        NIKA(sam);
        System.out.println(NIKA(sam));

        int[] lucas = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        System.out.println(POLLY(lucas));

        int[] diego = new int[10];
        SARA(diego);

        int[][] larry = new int[5][5];
        System.out.print(KIRA(larry));
    }

    //Задать целочисленный массив, состоящий из элементов 0 и 1.
    // Например: [ 1, 1, 0, 0, 1, 0, 1, 1, 0, 0 ].
    // Написать метод, заменяющий в принятом массиве 0 на 1, 1 на 0;
    public static String EVA(int[] jony) {
        for (int i = 0; i < jony.length; i++) {
            jony[i] = jony[i] != 0 ? 0 : 1;
//                if (jony[i] != 0) {
//                    jony[i] = 0;
//                } else {
//                    jony[i] = 1;
//                }
        }
        return (Arrays.toString(jony));
    }

    //Задать пустой целочисленный массив размером 8. Написать метод,
    // который помощью цикла заполнит его значениями 1 4 7 10 13 16 19 22;
    public static String NIKA(int[] sam) {
        for (int i = 0; i < sam.length; i++) {
            sam[i] = (i * 3) + 1;
        }
        return (Arrays.toString(sam));
    }

    //Задать массив [ 1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1 ],
    // написать метод, принимающий на вход массив и умножающий числа меньше 6 на 2;
    public static String POLLY(int[] lucas) {
        for (int i = 0; i < lucas.length; i++) {
            lucas[i] = lucas[i] > 6 ? lucas[i] * 2 : lucas[i];
        }
        return (Arrays.toString(lucas));
    }

    //Задать одномерный массив. Написать методы поиска в нём минимального и максимального элемента;
    public static void SARA(int[] diego) {
        int max = diego[0];
        int min = max;
        for (int i = 0; i < diego.length; i++) {
            max = max < diego[i] ? diego[i] : max;
            min = min > diego[i] ? diego[i] : min;
        }
    }

    //   Создать квадратный целочисленный массив (количество строк и столбцов одинаковое),
//   заполнить его диагональные элементы единицами, используя цикл(ы);
    public static int[][] KIRA(int[][] larry) {
        for (int i = 0; i < larry.length; i++) {
            for (int j = 0; j < larry.length; j++) {
                {
                    larry[i][j] = (j == i) ? 1 : 0;
                    System.out.print(larry[i][j]);
                }

            }
            System.out.println();
        }
        return (larry);  //не понял как заполнить вторую диагональ(вермя поджимает сдавать задание)и не пойму что ссылка появляется при печати в консоль
    }
}

