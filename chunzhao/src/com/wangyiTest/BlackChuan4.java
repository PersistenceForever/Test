package com.wangyiTest;

import java.util.Scanner;

public class BlackChuan4 {

	public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    long[] num=new long[n+1];
    num[1]=3;
    num[2]=9;
    for (int i = 3; i <=n; i++) {
		num[i]=2*num[i-1]+num[i-2];
	}
    System.out.println(num[n]);
    sc.close();
	}

}
