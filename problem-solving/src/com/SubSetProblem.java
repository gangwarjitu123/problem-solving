package com;
public class SubSetProblem {
   static int arr[]={1,2,3,4};
    public static void main(String[] args) {
        Integer set[]= new Integer[4];
        SubSetProblem subSetProblem=new SubSetProblem();
        subSetProblem.set(arr,0,set);
    }
    public void set(int[] arr, int start, Integer[] list){
        if(arr.length <start){
            return;
        }
        if(start==arr.length){
            System.out.print("{");
            for(Integer s:list){
                if(s!=null)
                  System.out.print(s + " ");
            }
            System.out.println("}");
        }else{
            list[start]=null;
            set(arr,start+1,list);
            list[start]=arr[start];
            set(arr,start+1,list);
        }

    }
}
