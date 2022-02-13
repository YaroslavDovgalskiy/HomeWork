/**
 * Java 1, HomeWork 1
 * @author Dovgalskiy Yaroslav
 * @version 13.02.2022
 */

package Java.HomeWork1;

class HomeWork1 {

    public static void main(String[] args) {
        printThreeWords() ;
        checkSumSign(-5, 2) ;
        printColor() ;
        compareNumbers(6,2) ;
    }

    static void printThreeWords() {
        System.out.println("Orange");
        System.out.println("Banana");
        System.out.println("Apple");
    }
    static void checkSumSign(int a, int b) {
        if (a+b>0) {
            System.out.println("Сумма положительная");
        }
        if (a+b<0) {
            System.out.println("Сумма отрицательная");
        }
    }
    static void printColor() {
        int value = 101;
        if (value < 0) {
            System.out.println("Красный");
        }
        if (value >= 0) {
            System.out.println("Желтый");
        }
        if (value > 100) {
            System.out.println("Зеленый");
        }

    }
    static void compareNumbers(int a, int b ) {
        if (a>=b) {
            System.out.println("a>=b");
        }
        else  {
            System.out.println("a<b");
        }
    }


}
