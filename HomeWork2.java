/**
 * Java 1, HomeWork 2
 * @author Dovgalskiy Yaroslav
 * @version 13.02.2022
 */

package HomeWork;

class homeWork2 {
    public static void main(String[] args) {
        boolean resalt1 = within10and20(10, 7);
        System.out.println(resalt1);
        isPositiveOrNegative(-2);
        boolean resalt2 = isNegative(-3);
        System.out.println(resalt2);
        printWordNTimes("HelloWorld",7);
    }

    static boolean within10and20(int x1, int x2) {
        return 10 <= x1 + x2 && x1 + x2 <= 20;
    }

    static void isPositiveOrNegative(int x) {
        System.out.println(x < 0 ? "-" : "+");
    }

    static boolean isNegative(int x) {
        if (x < 0) {
            return true;
        } else
            return false;
    }

    static void printWordNTimes(String word, int times) {
        for (int i = 1; i <= times; i++) {
            System.out.println("[" + i + "]" + " " + word);
        }
    }

}