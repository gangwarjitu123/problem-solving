package com;

public class operators {
    public static void main(String[] args) 
    { 
  
        int a = 5; 
        int b = -10; 
  
        // left shift operator 
        // 0000 0101<<2 =0001 0100(20) 
        // similar to 5*(2^2) 
        System.out.println("a<<1 = " + (a<< 1));
  
        // right shift operator 
        // 0000 0101 >> 2 =0000 0001(1) 
        // similar to 5/(2^2) 
        System.out.println("b>>2 = " + (1 >> b));
  
        // unsigned right shift operator 
        System.out.println("b>>>2 = " + (b >>> 2)); 
    } 
} 