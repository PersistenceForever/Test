package com.wangyiTest;

import java.util.Scanner;

public class MaxJiYue6 {

	public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    long n=sc.nextInt();
    long sum=0;
    for (long i = n; i>0; i=i/2) {
		sum+=((i+1)/2)*((i+1)/2);
	}
    System.out.println(sum);
    sc.close();
	}
	
}
