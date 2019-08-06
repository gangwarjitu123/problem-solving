package com;


public class LCS {

    public static void main(String[] args){
        System.out.println(findLCS("@stoneabcde","$longestabcde"));
    }

    public static int  findLCS(String str1,String str2){
        int[][] metrix= new int[str1.length()][str2.length()];
        for (int i=0; i<str1.length(); i++){
            metrix[i][0]=0;
        }
        for (int i=0; i<str2.length(); i++){
            metrix[0][i]=0;
        }
        for(int i=1; i<str1.length(); i++){
            for (int j=1; j<str2.length(); j++){
                if(str1.charAt(i)==str2.charAt(j)){
                    metrix[i][j]=1+metrix[i-1][j-1];
                }else {
                   metrix[i][j]=Math.max(metrix[i-1][j],metrix[i][j-1]);
                }
            }
        }
         printLongest(metrix,str1.length()-1,str2.length()-1,str1);
         return metrix[str1.length()-1][str2.length()-1] ;
    }

    public static void printLongest(int[][] metric ,int i,int j,String str){
       if(i<=0 || j<=0 || (metric[i-1][j]==0 && metric[i][j-1]==0 && metric[i][j]==0)){
           return;
       }
       if(metric[i][j-1]==metric[i-1][j]){


           i=i-1;
           j=j-1;
           printLongest(metric,i,j,str);
           System.out.print(str.charAt(i+1));

       }else {
           if(metric[i][j-1]==metric[i][j]){
               j=j-1;
           }else {
               i=i-1;
           }
           printLongest(metric,i,j,str);
       }
    }




}
