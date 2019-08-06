package com;

public class Test {

    static boolean compareString(String s1, String s2) {
        boolean flag = false;

        char[] ch1 = s1.toCharArray();
        char[] ch2 = s2.toCharArray();

        if (ch1.length != ch2.length) {
            return false;
        }

        for (int i = 0; i < ch1.length; i++) {

            flag = false;
            for (int j = 0; j < ch2.length; j++) {
                if (ch1[1] == ch2[j]) {
                    flag = true;
                    ch2[j] = '%';
                    flag = true;
                }
            }
            if (flag) {
                return flag;
            }
        }
        return flag;
    }

    static boolean compareString1(String s1, String s2) {
        boolean flag = false;

        char[] ch1 = s1.toCharArray();
        char[] ch2 = s2.toCharArray();

        if (ch1.length != ch2.length) {
            return false;
        }

        int z = 0;
        int zor1=0;
        int zor2=0;
        for (int i = 0; i < ch1.length - 1; i=i+2) {
             zor1 = zor1^ch1[i] ^ ch1[i + 1];
             zor2 = zor2^ch2[i] ^ ch2[i + 1];

        }
        z = zor1 ^ zor2;
        if (z == 0) {
            return true;
        } else {
            return false;
        }
    }

    public static void main(String[] args) {
        System.out.println(compareString1("cbdc", "abdc"));
    }
}
