package com;


public class Solution {
    public  static int trap(int[] height) {
        int[] right=new int[height.length];
        int[] left=new int[height.length];
        int water=0;
        for(int i=0; i<height.length; i++){
             if(i==0 || i==height.length-1){
                 right[height.length-1]=height[height.length-1];
                 left[0]=height[0];
                 continue;
             }
             if(left[i-1]>height[i]){
                 left[i]=left[i-1];
             }else{
                 left[i]=height[i];
             }
            
              if(right[(height.length-i)]>height[height.length-i-1]){
                 right[height.length-i-1]=right[height.length-i];
             }else{
                 right[height.length-i-1]=height[height.length-i-1];
             }
        }

           int compare;

           for(int i=0; i<height.length; i++){
                if(i==0|| i==height.length-1){
                     continue;
                }
                if(right[i]<left[i]){
                    compare=right[i];
                }else{
                     compare=left[i];
                }
               if(compare-height[i]>0){
                   water=water+compare-height[i];

               }
           }
        return water;
    }
    public static void main(String[] args){
        int[] water= {1,8,6,2,5,4,8,3,7};
        System.out.println(maxArea(water));
    }

    public static int maxArea(int[] height) {
        int[] right=new int[height.length];
        int[] left=new int[height.length];
        int[] arr= new int[height.length];
        int area=0;
        for(int i=0; i<height.length; i++) {
            if (i == 0 || i == height.length - 1) {
                right[height.length - 1] = height[height.length - 1];
                left[0] = height[0];
                continue;
            }
            if (left[i - 1] > height[i]) {
                left[i] = left[i - 1];
            } else {
                left[i] = height[i];
            }

            if (right[(height.length - i)] > height[height.length - i - 1]) {
                right[height.length - i - 1] = right[height.length - i];
            } else {
                right[height.length - i - 1] = height[height.length - i - 1];
            }
        }
        int compare=0;
        for(int i=0; i<height.length; i++){
            if(i==0|| i==height.length-1){
                continue;
            }
            if(right[i]<left[i]){
                compare=right[i];
            }else{
                compare=left[i];
            }
            if(compare-height[i]>0){
                arr[i]=compare-height[i];

            }
        }
        int current=0;
        for(int i=2; i<height.length; i++){
            for(int j=0; i<height.length; i++){
                current=  Math.abs((i-j)*arr[i]);
                if(current>area){
                    area=current;
                }
            }
        }
        return area;
    }


}