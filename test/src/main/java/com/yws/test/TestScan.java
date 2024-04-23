package com.yws.test;

import java.util.Scanner;

public class TestScan {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt(),steps=0;
        while(num!=1){
            steps++;
            if(num%2==0 ) num/=2;
            else num=(3*num+1)/2;
        }
        System.out.println(steps);
    }
}
