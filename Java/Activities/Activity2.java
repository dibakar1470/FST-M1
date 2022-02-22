package activities;

import sun.lwawt.macosx.CSystemTray;

import java.util.Arrays;

public class Activity2 {

    public static void main(String[] args){

        int[] arr = {10,77,10,54,-11,10};

        int searchNumber = 10;
        int sum = 30;

        System.out.println("Result is: " + result(arr, searchNumber, sum));

    }

        public static boolean result(int[] numArr, int searchNum, int fixedSum) {

            int temp_sum = 0;
            for (int number : numArr) {
                if (number == searchNum) {
                    temp_sum += searchNum;
                }

                if (temp_sum > fixedSum) {
                    break;
                }
            }

            return temp_sum == fixedSum;
        }
}
