package com;

public class GfG {
    public  void printDuplicates(int arr[], int n) {
        boolean flag = false;
        for (int i = 0; i < n; i++) {
            int calculateIndex = calculateIndex(i, arr);
            if (arr[calculateIndex] > 0 && arr[calculateIndex] < 49 && arr[calculateIndex]!=0) {
                arr[calculateIndex] = -arr[calculateIndex];
            } else if (((calculateIndex == 0 || arr[calculateIndex] == 0)) && (arr[calculateIndex] != 49 && arr[calculateIndex] != -49)) {
                      arr[calculateIndex] = 49;
            } else {
                flag = true;
                if (arr[calculateIndex] < 49 && arr[calculateIndex] != -49) {
                    System.out.print(calculateIndex + " ");
                    arr[calculateIndex] = 49 + (-arr[calculateIndex]);
                } else if (arr[calculateIndex] == 49) {
                    System.out.print(arr[calculateIndex]-49 + " ");
                    arr[calculateIndex] = -49;
                }

            }


        }
        if (!flag) {
            System.out.println(-1);
        }
    }


    static int calculateIndex(int i, int[] arr) {
        if (arr[i] < 0) {
            return arr[i] < 0 ? -(arr[i]) : arr[i];
        } else if (arr[i] < arr.length) {
            return arr[i];
        } else {
            return arr[i] - 49;
        }
    }

    public static void main(String[] args) {
        int[]  arr={6,0,3,3,1,3,4,4,4,4,4,4,4,4,4,4,2,2,6,0,1,1};
        new GfG().printDuplicates(arr,arr.length);
    }
}
