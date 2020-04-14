package geekbrains.java;

import java.util.Random;
import java.util.Scanner;

import static javafx.scene.input.KeyCode.Y;


    public class TicTacToe {

    private static final Scanner SCANNER = new Scanner(System.in);
    private static final Random RANDOM = new Random();

    private static int fieldSizeY;
    private static int fieldSizeX;
    private static char[][] field;
    private static final char HUMAN_DOT = 'X';
    private static final char AI_DOT = 'O';
    private static final char EMPTY_DOT = '.';

//    // init field
//    private static void initMap() {
//        fieldSizeY = 3;
//        fieldSizeX = 3;
//        field = new char[fieldSizeY][fieldSizeX];
//        for (int y = 0; y < fieldSizeY; y++) {
//            for (int x = 0; x < fieldSizeX; x++) {
//                field[y][x] = EMPTY_DOT;
//                //пример field[0][0] = '.' и так по всему массиву
//            }
//        }
//    }
//
//    // print field
//    private static void printMap() {
//        System.out.println("----------------");
//        for (int y = 0; y < fieldSizeY; y++) {
//            for (int x = 0; x < fieldSizeX; x++) {
//                System.out.print(field[y][x] + " | ");
//            }
//            System.out.println();
//        }
//    }
//
//    // human turn
//    private static void humanTurn() {
//        int x;
//        int y;
//        do {
//            System.out.printf("укажите координаты хода по X и Y от (1 до 3)", fieldSizeX);
//            x = SCANNER.nextInt() - 1;
//            y = SCANNER.nextInt() - 1;
//        } while (!(isEmptyCell(y, x) && isValidCell(y, x)));
//        field[y][x] = HUMAN_DOT;
//    }
//
//    // is cell empty
//    private static boolean isEmptyCell(int y, int x) {
//        return field[y][x] == EMPTY_DOT;
//    }
//
//    // is cell valid
//    private static boolean isValidCell(int y, int x) {
//        return x >= 0 && x < fieldSizeX && y >= 0 && y < fieldSizeY;
//    }
//
//    // ai turn
//    private static void aiTurn() {
//        int x;
//        int y;
//        do {
//            x = RANDOM.nextInt(fieldSizeX);
//            y = RANDOM.nextInt(fieldSizeY);
//        } while (!isEmptyCell(y, x));
//        field[y][x] = AI_DOT;
//    }

    // check win//
    //проверять работоспособность время жмет. поэтому пытаюсь просто понять механизм.
    //цикл который будет вызывать метод проверки горизонтали вертикали на 3 хумандот
    for(int i = 0;i<fieldSizeX;i++)
    {
        for (int j = 0; j < fieldSizeY; j++) {
            checkWinHor(field[i][j]);
            checkWinVert(field[i][j]);
            checkWinDiag(field[i][j]);
        }
    }

    private static boolean checkWinHor(char c) {
        // hor//
        for (int i = 0; i < fieldSizeX; i++) {
            if (!(field[0][i] == HUMAN_DOT))
                return false;
        }
        return true;
    }

    // если по вертикали три хумано то победа
    private static boolean checkWinVert(char c) {
        for (int i = 0; i < fieldSizeY; i++) {
            if (!(field[i][0] == HUMAN_DOT))
                return false;
        }
        return true;
    }

    private static boolean checkWinDiag(char c) {
        for (int i = 0; i < fieldSizeX; i++) {
            for (int j = 0; j fieldSizeY; j++)

            {
                if (!(field[i][j] == (j == i) == HUMAN_DOT))
                    return false;
                //если в точке диагонали
                // (00, 11,22)
                //стоит крестик то идем снова в цикл, и так пока не будет 3 подряд
            }
        }
        return true;
    }

}


//ver
//        if (field[0][0] == c && field[1][0] == c && field[2][0] == c) return true;
//        if (field[0][1] == c && field[1][1] == c && field[2][1] == c) return true;
//        if (field[0][2] == c && field[1][2] == c && field[2][2] == c) return true;
//
//        //dia
//        if (field[0][0] == c && field[1][1] == c && field[2][2] == c) return true;
//        if (field[0][2] == c && field[1][1] == c && field[2][0] == c) return true;
//        return false;
//}

//    // check draw
//    private static boolean isMapFull() {
//        for (int y = 0; y < fieldSizeY; y++) {
//            for (int x = 0; x < fieldSizeX; x++) {
//                if (isEmptyCell(y, x))
//                    return false;
//            }
//        }
//        return true;
//    }
//
//    public static void main(String[] args) {
//        while (true) {
//            initMap();
//            printMap();
//            while (true) {
//                humanTurn();
//                printMap();
//                if (gameChecks(HUMAN_DOT, "Human win!")) break;
//                aiTurn();
//                printMap();
//                if (gameChecks(AI_DOT, "AI win!")) break;
//            }
//            System.out.println("Play again?");
//            if (!SCANNER.next().equals("Y"))
//                break;
//        }
//        SCANNER.close();
//
//        int[] arr = {1, 2, 3, 4, 5, 6, 7};
//        arraySum("Hello", 0, arr);
//        arraySum("Hello", 0, new int[]{1, 2, 3, 4, 5, 6, 7});
//        arraySum("Hello", 0, 1, 2, 3, 4, 5, 6, 7);
//    }
//
//    private static int arraySum(String s, int b, int... a) {
//        int r = 0;
//        for (int i = 0; i < a.length; i++) {
//            r += a[i];
//        }
//        return r;
//    }
//
//    private static boolean gameChecks(char aiDot, String s) {
//        if (checkWin(aiDot)) {
//            System.out.println(s);
//            return true;
//        }
//        if (isMapFull()) {
//            System.out.println("draw!");
//            return true;
//        }
//        return false;
//    }
//}
//


