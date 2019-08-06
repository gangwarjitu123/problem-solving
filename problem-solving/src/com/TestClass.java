package com;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

class TestClass {

    static void printSubset(int set[],int l,String s,
                            int n)
    {
        if(l>n)
            return;

        if(s!=null && !s.isEmpty()) {
            System.out.println("["+s+"]");
        }

        for(int i = l; i<n; i++){
            printSubset(set, i+1, (s==null)?String.valueOf(set[i]):s + "," + String.valueOf(set[i]), n);
        }
    }

    public static void main(String args[] ) throws Exception {
        int set[] = {1,2,3,4};
        int n = set.length;
        String s = null;
        printSubset(set,0, s, n);
        System.out.println("[]");

    }
}