package com;

public class MinimumJump {
    static  int[] arr={1, 3, 5, 8, 9, 2, 6, 7, 6, 8, 9};
    public static void main(String[] args){
        System.out.println(min());
        System.out.println(minimumJump(arr,arr[0],0));
    }
    static int n=arr.length;
    public static int minimumJump(int[] arr,int indexValue,int index){

        if (index ==n)
            return 0;
        if(indexValue==0){
            return Integer.MAX_VALUE;
        }
        if(index>=arr.length-1){
            return 0;
        }
        int minJump=Integer.MAX_VALUE;
        for(int i=index+1; i<=index+indexValue && i<arr.length; i++){
            int jump= minimumJump(arr,arr[i],i);
            if(jump <minJump && jump+1<minJump){
                minJump=jump+1;
            }
        }
        return minJump;
    }

    public static int min(){
        int minj=Integer.MAX_VALUE;
        int i=arr.length-1;
        while (i>0){
            int j=i-1;
             while (j<arr[j]+j && j<arr.length-1){
                   if(arr[j]>=(arr.length-1)-i){
                           if(minj>1){
                               minj=1;
                           }
                       }else if(arr[j]>=i-j){
                            minj=minj+1;
                      }else {
                      minj=Integer.MAX_VALUE;
                  }
                   j=j+1;
            }
            i=i-1;
        }
        return minj;
    }
}
