package com.wangyiTest;

import java.util.ArrayList;
import java.util.Scanner;
//求所有的约数（不包含1和本身）
public class QiuYueShu {

	public static void main(String[] args) {
     Scanner sc=new Scanner(System.in);
     int n=sc.nextInt();
     sc.close();
     ArrayList<Integer> list=new ArrayList<Integer>();
     for (int i = 2; i <=Math.sqrt(n); i++) {
		if(n%i==0)
		{
			list.add(i);
			if(n/i!=i)
			{
				list.add(n/i);
			}
		}
		for (int j = 0; j < list.size(); j++) {
			System.out.println(list.get(j));
		}
	}
	}

}
