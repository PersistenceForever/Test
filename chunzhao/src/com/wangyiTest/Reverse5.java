package com.wangyiTest;

import java.util.Scanner;

public class Reverse5 {

	public static void main(String[] args) {
     Scanner sc=new Scanner(System.in);
     int x=sc.nextInt();
     int y=sc.nextInt();
     sc.close();
     StringBuffer sb1=new StringBuffer();
     StringBuffer sb2=new StringBuffer();
     StringBuffer sb3=new StringBuffer();
     sb1.append(x);
     sb1.reverse();
     sb2.append(y);
     sb2.reverse();
     int x1=Integer.parseInt(sb1.toString());
     int x2=Integer.parseInt(sb2.toString());
     int sum=x1+x2;
     sb3.append(sum);
     sb3.reverse();
     System.out.println(Integer.parseInt(sb3.toString()));
	}

}
