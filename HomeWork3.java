/**
 * Java 1, HomeWork 3
 *
 * @author Dovgalskiy Yaroslav
 * @version 17.02.2022
 */

import java.util.Arrays;

public class HomeWork3 {
    public static void main(String[] args) {
        System.out.println("\n#1: ");
		invertArray();
        System.out.println("\n#2: ");
        fillArray();
		System.out.println("\n#3: ");
        changeArray();
		System.out.println("\n#4: ");
        fillDiagonal();
		System.out.println("\n#5: ");
        twoArg();
        
    }
    static void invertArray() {
        int[] arr = {1, 1, 0, 0, 1, 0, 1, 1, 0, 0};
        System.out.println (Arrays.toString (arr));
        for (int i = 0; i < arr.length; i++){
            if (arr[i] == 0) {
                arr[i] = 1;
            }
            else {
                arr[i] = 0;
            }
            System.out.print(arr[i] + "," + " ");
        }
    }
			
    static void fillArray() {
        int[] arr = new int[100];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = i + 1;
            System.out.print(arr[i] + " ");
        }
    }

   
    static void changeArray() {
		int[] arr = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < 6) {
                arr[i] = arr[i] * 2;
            }
            System.out.print(arr[i] + " ");
        }
    }
	
	
	    
    static void fillDiagonal() {
        int[][] arr = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (i == j) {
                    arr[i][j] = 1;
                }
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }
    static void twoArg(){
        int len = 5; int initialValue = 1;
        int[] arr = new int[len];
        for (int i = 0; i < len; i++) {
            arr[i] = initialValue;
            System.out.print("[" + i + "-" + arr[i] + " " + "]");
        }
    }
}