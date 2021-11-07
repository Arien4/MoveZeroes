package practice;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        /*
        Scanner sc = new Scanner(System.in);

        int size = 0;
        System.out.println("Enter the number of elements:");
        size = sc.nextInt();


        int[] nums = new int[size];

        System.out.println("Enter the elements of the array") ;
        for(int i=0; i<size; i++) {
            try {
                nums[i] = sc.nextInt();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        */

        // int[] nums = {0, 0, 0, 3, 4, 0, 0, 7, 0, 9};
        int[] nums = {0, 1, 0, 3, 4, 0, 0, 7, 0, 0};
        // int nums[] = {0};
        // int nums[] = {0, -9, 0, -8};
        // int[] nums = {-100, 9, 0, 0, -1, 4, 1, -300, 39, 0, 90, 0, 0, 0, 1};

        int size = nums.length;

        System.out.println("Your array is: ");
        for (int i = 0; i < size; i++) {
            System.out.print(nums[i]);
            if (i != size - 1) {
                System.out.print(", ");
            }
        }

        int lastNotZeroNumber = size - 1;
        System.out.print("\nSorting...");

        for (int i = 0; i < lastNotZeroNumber; i++) {

            // maybe we have zeroes in the end of the array at the moment
            for (int k = lastNotZeroNumber; k >= 0; k--) {
                if (nums[k] == 0) {
                    lastNotZeroNumber -= 1;
                    // printWithSeparator(nums, lastNotZeroNumber);
                } else break; // we are looking for the zeroes only in the end of the array

            }

            printWithSeparator(nums, lastNotZeroNumber);
            System.out.print("\ni = " + i);


            if (nums[i] == 0) {
                nums[i] = nums[lastNotZeroNumber];
                nums[lastNotZeroNumber] = 0;
                lastNotZeroNumber -= 1;

                // printing the array
                printWithSeparator(nums, lastNotZeroNumber);

                // first i numbers are not zeroes
                // sorting first i numbers
                // (i - 1) numbers are already sorted
                for (int j = i; j > 0; j--) {
                    if (nums[j] < nums[j - 1]) {
                        int temp = nums[j];
                        nums[j] = nums[j - 1];
                        nums[j - 1] = temp;
                        System.out.println(j - 1 + " and " + j + "elements swapped");
                    } else {
                        break;
                    }
                }
            }
        }

        // Arrays.sort(nums, 0, lastNotZeroNumber + 1);
        System.out.println("\nSorted array: ");
        for (int i = 0; i < size; i++) {
            System.out.print(nums[i]);
            if (i != size - 1) {
                System.out.print(", ");
            }
        }
    }

    public static void printWithSeparator(int[] nums, int lastNotZeroNumber) {
        // printing the array
        System.out.println();
        for (int m = 0; m < nums.length; m++) {
            System.out.print(nums[m] + " ");
            if (m == lastNotZeroNumber) System.out.print("| ");
        }
    }

}
