package com;

import java.util.*;
import java.lang.*;
import java.io.*;


public class MeetingRoom {
    public static void main (String[] args)throws Exception {
        InputStreamReader reader = new InputStreamReader(System.in);
        BufferedReader in = new BufferedReader(reader);
        Integer testCase = Integer.parseInt(in.readLine());
        for(int i=0; i<testCase; i++){
            int length=Integer.parseInt(in.readLine());
            String lString=in.readLine();
            String rString=in.readLine();
            Integer l[]= Arrays.asList(lString.split(" ")).stream().toArray(Integer[]::new);
            Integer r[]= Arrays.asList(rString.split(" ")).stream().toArray(Integer[]::new);
            Integer value=getMeetings(l,r);
            System.out.println(value);

        }
    }

    public static int getMeetings(Integer[] left,Integer[] right){
        return 0;
    }
}