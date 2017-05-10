package com.wangyiTest;

import java.util.Scanner;
public class Candy {
	public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    int[] arr=new int[4];
    for (int i = 0; i < 4; i++) {
		arr[i]=sc.nextInt();
	}
    sc.close();
    int A=(arr[0]+arr[2])/2;
    int B=(arr[1]+arr[3])/2;
    int C=(arr[3]-arr[1])/2;
    if((A-B)==arr[0]&&(B-C)==arr[1])
    	System.out.println(A+" "+B+" "+C);
    else
    	System.out.println("No");
	}
}
