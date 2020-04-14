package geekbrains.java;

public class qwerty1234 {
    public static void main(String args[]) {

//        int x = 11;
////        do {
////            System.out.println(" просто так скажи мне " + (x) ); x++;
////        } while (x < 10); //до тех пор пока <<<< это TRUE , печатаю верх!!!
////        System.out.println("конец на " + (x));//если FALSE то печатаю это
        int[][] a = new int[3][3];
        System.out.println(check(a));
    }

    public static boolean check(int[][] a) {
        for (int j = 0; j < 3; j++)
            for (int i = 0; i < 3; i++) {
                if (a[j][i] > 2)
                    return false;
            }
        return true;
    }
}

