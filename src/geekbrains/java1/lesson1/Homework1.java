package geekbrains.java1.lesson1;

public class Homework1 {
        public static void main(String[] args) {
            int q = 10;
            int w = 2;
            int e = 1;
            int r = 11;
            System.out.println(EVA (q, w, e, r));
            System.out.print (SARA (5, 16));
            NIKA(-56);
            System.out.println (KAT("Aleks"));

        }


        private static float EVA(int a, int b, int c, int d) {
            return a * (b + (c*1f/ d));
        }

        private static boolean SARA(int a, int b) {
            return (a + b >= 10 && a + b <= 20);
        }

        private static void NIKA(int x) {
            if (x >= 0) {
                System.out.println("Number is positive");
            } else {
                System.out.println("Number is negative");
            }
        }

        private static String KAT(String name) {
            return "Hello, " + name;
        }

}
