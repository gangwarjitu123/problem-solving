package com;

import java.util.Scanner;

public class SubSetSum {
    static  int count =0;
    static Scanner sc= new Scanner(System.in);
    public static void main (String[] args) {
        int test=sc.nextInt();
        for(int i=0; i<test; i++){
            int c=sc.nextInt();
            int[] arr= new int[c];
            for(int j=0; j<c; j++){
                arr[j]=sc.nextInt();
            }
            int sum=sc.nextInt();
            SubSetSum subSetSum= new SubSetSum();
            subSetSum.subSetSumCount(arr,0,0,arr.length-1,sum);
            System.out.println(count);
        }

    }

    public void subSetSumCount(int arr[], int sum,int i,int n,int k){

        if(sum==k){
            count =count+1;
            sum=0;
        }
        if(i>n || sum>k){
            return;
        }
        subSetSumCount(arr,sum+arr[i],i+1,n,k);
        subSetSumCount(arr,sum,i+1,n,k);
    }
}
