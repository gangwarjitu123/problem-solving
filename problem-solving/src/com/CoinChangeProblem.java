package com;


public class CoinChangeProblem {
    static int[] arrs = {1, 2,3};
    static int sum = 5;


    public static void main(String[] args) {
        System.out.println(sum(arrs, arrs.length, sum));
    }

    static int sum(int[] input, int coin, int sum) {
        int[][] metric= new int[coin+1][sum+1];
        for(int i=0; i<=coin;i++){
            for (int j=0;j<=sum; j++){
                 if(i==0  || j==0){
                     metric[i][j]=0;
                     continue;
                 }

                 if(j%input[i-1]==0){
                     metric[i][j]=metric[i-1][j]+1;
                 }else if(j<input[i-1]){
                      metric[i][j]=metric[i-1][j];
                 } else if(Math.abs(j-input[i-1])>0){
                       metric[i][j]=metric[i][Math.abs(j-input[i-1])]+metric[i-1][j];
                 }
            }
        }
        return metric[coin][sum];
    }
}


